import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class steve here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class steve extends Actor
{
  
    
   public int vSpeed;
   public int gravity = 1;
   
   public boolean jumping;
   public int jumpStrength = 20;
   
   public int frame = 1;
   public int animationTimer;
   public String lastKeyPressed = "";
   
   private int vidas = 3;  // Inicialmente, Steve tiene 3 vidas
   private GreenfootImage vidaImage = new GreenfootImage("heart.png");
    
   private boolean invulnerable = false;
   private long lastDamageTime;
   
   private long lastAnimationTime;
   
   private int lingotsCollected = 0;
   
   private boolean waitForEnter = false;
   
   GreenfootImage IDLER = new GreenfootImage ("steveIDLER.png");
   GreenfootImage IDLEL = new GreenfootImage ("steveIDLEL.png");
   
   GreenfootImage IDLERD = new GreenfootImage ("steveIDLERD.png");
   GreenfootImage IDLELD = new GreenfootImage ("steveIDLELD.png");
   
   GreenfootImage pwalkL1 = new GreenfootImage ("stevewalkL1.png");
   GreenfootImage pwalkL2 = new GreenfootImage ("stevewalkL2.png");
   GreenfootImage pwalkL3 = new GreenfootImage ("stevewalkL3.png");
   GreenfootImage pwalkL4 = new GreenfootImage ("stevewalkL4.png");
   
   GreenfootImage pwalkR1 = new GreenfootImage ("stevewalkR1.png");
   GreenfootImage pwalkR2 = new GreenfootImage ("stevewalkR2.png");
   GreenfootImage pwalkR3 = new GreenfootImage ("stevewalkR3.png");
   GreenfootImage pwalkR4 = new GreenfootImage ("stevewalkR4.png");
   
   private GreenfootSound stevesound = new GreenfootSound("stevedamagesound.wav");
   
   public int timer;
   public static int level = 1;
   
   private long lastSoundTime;
   private int soundCooldown = 1000;
   
    public void act()
    {
        checkFall();
        checkKeys();
        checkCeiling();
        checkRightWall();
        checkLeftWall();
        checkLingot();
        checkPortal();
        checkRightEdge();
        checkBottomEdge();
        
        if (invulnerable && (System.currentTimeMillis() - lastDamageTime) > 2000) {
            invulnerable = false;
        }
        
        if (timer == 0 && Greenfoot.isKeyDown("enter")){
            if (level == 1){
            
                Greenfoot.setWorld(new level1());
            
            }
            if (level == 2){
               
                Greenfoot.setWorld(new level2());
            
            }
            if (level == 3){
            Greenfoot.setWorld(new level3());
            
            }
            if (level == 4){
            Greenfoot.setWorld(new level4());
            
            }
            Greenfoot.setSpeed(50);
        }
    }
    
    public void checkKeys() {
        animationTimer = animationTimer + 1;
        
        
        if (Greenfoot.isKeyDown("space") && !jumping) {
            jump();
        }
        
        if (Greenfoot.isKeyDown("d")) {
            move(5);
            if (animationTimer % 5 == 0) {
                animatedRight();
            }
            lastKeyPressed = "d";  // Actualiza la última tecla presionada
        } else if (Greenfoot.isKeyDown("a")) {
            move(-5);
            if (animationTimer % 5 == 0) {
                animatedLeft();
            }
            lastKeyPressed = "a";  // Actualiza la última tecla presionada
        } else {
            // Si no se presiona ninguna tecla, establece la imagen según la última tecla presionada
            if (lastKeyPressed.equals("d")) {
                setImage(IDLER);
            } else if (lastKeyPressed.equals("a")) {
                setImage(IDLEL);
            }
        }
    }
    
    public void checkFall(){
        if (onGround() == true){
        vSpeed = 0;
        
        }
        else{
            fall();
        }
    }
    
    public void fall(){
        setLocation(getX(), getY () + vSpeed);
        
        if(vSpeed <= 12)
            vSpeed = vSpeed + gravity;
        
        jumping = true;
    }
    
    public boolean onGround(){
        int spriteHeight = getImage().getHeight();
        int lookForGround = spriteHeight/2;
        
        Actor ground = getOneObjectAtOffset(0, lookForGround, Ground.class);
        if(ground == null){
            jumping = true;
            return false;
        }
        else{
            moveToGround(ground);
            return true;
        }
    }
    
    public void moveToGround(Actor ground){
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        
        setLocation(getX(), newY);
        jumping = false;
    }
    
    public boolean checkRightWall(){
        int spriteWidth = getImage().getHeight();
        int lookForRightWall = spriteWidth/2;
        
        Actor rWall = getOneObjectAtOffset(lookForRightWall, 0, Ground.class);
        if(rWall == null){
            return false;
        }
        else{
            stopByRWall(rWall);
            return true;
    }
    }
    
    public void stopByRWall(Actor rWall){
        int wallWidth = rWall.getImage().getWidth();
        int newX = rWall.getX() - (wallWidth + getImage().getWidth())/2;
        
        setLocation(newX, getY());
        
    }
    
    public boolean checkLeftWall(){
        int spriteWidth = getImage().getHeight();
        int lookForLeftWall = spriteWidth/2;
        
        Actor lWall = getOneObjectAtOffset(-lookForLeftWall, 0, Ground.class);
        if(lWall == null){
            return false;
        }
        else{
            stopByLWall(lWall);
            return true;
    }
    }
    
    public void stopByLWall(Actor lWall){
        int wallWidth = lWall.getImage().getWidth();
        int newX = lWall.getX() + (wallWidth + getImage().getWidth())/2;
        
        setLocation(newX, getY());
        
    }
    
    public boolean checkCeiling(){
        int spriteHeight = getImage().getHeight();
        int lookForCeiling = spriteHeight/2;
        
        Actor ceiling = getOneObjectAtOffset(0, -lookForCeiling, Ground.class);  
        if(ceiling != null){
            bopHead(ceiling);
            return true;
        }
        else{
            return false;
    }
    }
    
    public void bopHead(Actor ceiling){
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight())/2;
        
        setLocation(getX(), newY);
        jumping = false;
        vSpeed = 2;
    }
    
    public void jump(){
    vSpeed = vSpeed - jumpStrength;
    jumping = true;
    fall();
    
    }
    
    public void animatedLeft(){
        if (frame == 1){
            setImage(pwalkL1);
            frame = 2;
        }
        else if (frame == 2){
            setImage(pwalkL2);
            frame = 3;
        }
        else if (frame == 3){
            setImage(pwalkL3);
            frame = 4;
        }
        else if (frame == 4){
            setImage(pwalkL4);
            frame = 1;
        }
    }
    public void animatedRight(){
        if (frame == 1){
            setImage(pwalkR1);
            frame = 2;
        }
        else if (frame == 2){
            setImage(pwalkR2);
            frame = 3;
        }
        else if (frame == 3){
            setImage(pwalkR3);
            frame = 4;
        }
        else if (frame == 4){
            setImage(pwalkR4);
            frame = 1;
        }
    }
    
    public void addedToWorld(World world) {
        showLifes();
    }
    
    public void showLifes() {
        getWorld().showText("", 10, 5);
        for (int i = 0; i < vidas; i++) {
            Vida vida = new Vida();
            getWorld().addObject(vida, 30 + i * 30, 25);
            vida.act();  // Activa la Vida para que se muestre correctamente
        }
    }
    
    public void checkLingot() {
        Actor lingot = getOneIntersectingObject(Lingot.class);
        if (lingot != null) {
            // Incrementa el contador de lingots y verifica si se alcanzó el límite (3)
            lingotsCollected++;
            if (lingotsCollected <= 3) {
                // Muestra una imagen en la pantalla
                showLingotImage(lingotsCollected);
                // Eliminar el lingot después de la colisión, puedes hacer:
                getWorld().removeObject(lingot);
            }
        }
    }
    
    public void showLingotImage(int lingotNumber) {
        // Muestra una imagen de lingot en la posición específica en la pantalla
        GreenfootImage lingotImage = new GreenfootImage("netheringot.png");
        getWorld().addObject(new Actor() {{ setImage(lingotImage); }}, 0 + lingotNumber * 30, 65);
    }
    
    public void checkPortal() {
        if (isTouching(Portal.class)) {
            loading loadingInstance = new loading();
            loadingInstance.stopMusic();
            
            Greenfoot.setWorld(new End());

            level = 1;
        }
    
    }
    
    public void damage() {
        if (isTouching(BadGuys.class) && !invulnerable) {
            loseLife();
            animationDamageIDLE();
            if (System.currentTimeMillis() - lastSoundTime >= soundCooldown) {
                sounddamage();
                lastSoundTime = System.currentTimeMillis();
            }
            invulnerable = true;
            lastDamageTime = System.currentTimeMillis();
            
        }
    }
    
    public void sounddamage(){
        stevesound.play(); // Puedes ajustar el valor del cooldown según tus necesidades
    
    }
    
    public void animationDamageIDLE(){
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastAnimationTime >= 1000){
            if (lastKeyPressed.equals("d")) {
                    setImage(IDLERD);
                } else if (lastKeyPressed.equals("a")) {
                    setImage(IDLELD);
                }
            lastAnimationTime = currentTime;
        }
    }
    
    public void loseLife() {
        vidas--;

        if (vidas <= 0) {
            if (level <=3 ){
                GreenfootImage diedOverlay = new GreenfootImage("diedoverlay.png");
                getWorld().setBackground(diedOverlay);
    
                // Muestra la imagen encima de todos los elementos
                getWorld().addObject(new Actor() {
                {
                    setImage(diedOverlay);
                }
                }, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        
                Greenfoot.setSpeed(5);
                timer = 0;
            
            } if (level == 4) {
                GreenfootImage diedOverlay = new GreenfootImage("diedoverlay2.png");
                getWorld().setBackground(diedOverlay);
    
                // Muestra la imagen encima de todos los elementos
                getWorld().addObject(new Actor() {
                {
                    setImage(diedOverlay);
                }
                }, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            
                Greenfoot.setSpeed(5);
                timer = 0;
            }
        } else {
            // Si aún hay vidas, actualiza la pantalla
            getWorld().removeObjects(getWorld().getObjects(Vida.class));
            showLifes();
            }
    }
    
    public void checkRightEdge() {
        int worldWidth = getWorld().getWidth();
        int steveX = getX();

        // Verifica si Steve está cerca del borde derecho del mundo
        if (steveX > worldWidth - 10) {
            // Cambia al siguiente mundo
            World currentWorld = getWorld();
            if (currentWorld instanceof level1 && lingotsCollected >= 1) {
                level = 2;
                Greenfoot.setWorld(new level2());
            } else if (currentWorld instanceof level2 && lingotsCollected >= 2) {
                level = 3;
                Greenfoot.setWorld(new level3());
            } else if (currentWorld instanceof level3 && lingotsCollected >= 3) {
                level = 4;
                Greenfoot.setWorld(new level4());
            } 
        }
    }
    
    public void checkBottomEdge() {
    int worldHeight = getWorld().getHeight();
    int steveY = getY();

    // Verifica si Steve está cerca del borde inferior del mundo
    if (steveY > worldHeight - 10 ) {
        // Reinicia el mundo
        if (level == 1) {
            Greenfoot.setWorld(new level1());
        } else if (level == 2) {
            Greenfoot.setWorld(new level2());
        } else if (level == 3) {
            Greenfoot.setWorld(new level3());
        } else if (level == 4) {
            Greenfoot.setWorld(new level4());
        }
        
        sounddamage();
    }
}
}