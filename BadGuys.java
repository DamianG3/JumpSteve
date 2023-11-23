import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadGuys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadGuys extends Actor
{
    public int vSpeed;
    public int gravity = 1;
    
    public int speed;
    
    public int spriteHeight = getImage().getHeight();
    public int spriteWidth  = getImage().getWidth();
    public int lookForWalls = spriteWidth/2;
    public int lookForEdge = spriteWidth/4;
    public int lookForGround = spriteHeight/2;
    
    public BadGuys (int bSpeed){
        speed = bSpeed;
    }
    
    
    /**
     * Act - do whatever the BadGuys wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void checkFall(){
        if (onGround() == true){
        vSpeed = 0;}
        else{
        fall();}
    }
    
    public void fall(){
        setLocation(getX(), getY() + vSpeed);
        
        if (vSpeed <= 12)
        vSpeed = vSpeed + gravity;
    }
    
    public boolean onGround(){
        int spriteHeight = getImage().getHeight();
        int lookForGround = spriteHeight/2;
        
        Actor ground = getOneObjectAtOffset(0, lookForGround, Ground.class);
        if(ground == null){
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
        
    }
    
    public void moveBadGuy(){
    Actor wall = getOneObjectAtOffset(lookForWalls, 0, Dirt.class);
    Actor cliff = getOneObjectAtOffset(lookForEdge, lookForGround, Ground.class);
    
    if (wall == null && cliff == null) {
        speed = speed * -1;
        lookForWalls = lookForWalls *-1;
        lookForEdge = lookForEdge * -1;
    }
    else if (wall != null && cliff != null){
        speed *= -1;
        lookForWalls *= -1;
        lookForEdge *= -1;
    }
    else
        move(speed);
    }
}
