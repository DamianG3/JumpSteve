import greenfoot.*;
import java.util.Random;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Greenfoot;
import greenfoot.GreenfootSound;

/**
 * Write a description of class skeleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skeleton extends BadGuys
{
    private int frame = 1;
    private int animationTimer = 0;
    
    private Random random = new Random();
    private int tiempoEspera;
    private int soundCooldown;
    private static int soundCounter = 0;
    
    private GreenfootSound skeletonSound1 = new GreenfootSound("skeletonsound1.wav");
    private GreenfootSound skeletonSound2 = new GreenfootSound("skeletonsound2.wav");
    
    GreenfootImage pwalkR1 = new GreenfootImage ("skeletonwalkR1.png");
    GreenfootImage pwalkR2 = new GreenfootImage ("skeletonwalkR2.png");
    GreenfootImage pwalkR3 = new GreenfootImage ("skeletonwalkR3.png");
    GreenfootImage pwalkR4 = new GreenfootImage ("skeletonwalkR4.png");
    
    GreenfootImage pwalkL1 = new GreenfootImage ("skeletonwalkL1.png");
    GreenfootImage pwalkL2 = new GreenfootImage ("skeletonwalkL2.png");
    GreenfootImage pwalkL3 = new GreenfootImage ("skeletonwalkL3.png");
    GreenfootImage pwalkL4 = new GreenfootImage ("skeletonwalkL4.png");
    
    /**
     * Act - do whatever the zombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public skeleton (int bSpeed) {
        super(bSpeed);
        tiempoEspera = random.nextInt(7*60, 10*60);
        soundCooldown = tiempoEspera - 7*60;
    }
    
    public void act()
    {
        checkFall();
        moveBadGuy();
        animateWalk();
        damage();
        playRandomSound();
    }
    
    public void damage() {
        if (isTouching(steve.class)) {
            steve steve = (steve) getOneIntersectingObject(steve.class);
            steve.damage();
        }
    }
    
    
    public void animateWalk() {
        animationTimer = animationTimer + 1;

        // Si el temporizador alcanza cierto valor, cambia el frame de la animación
        if (animationTimer % 5 == 0) {
            frame = (frame % 4) + 1; // Ajusta esto según la cantidad de frames en tu animación

            // Cambia la imagen según la dirección
            if (speed > 0) {
                setImage(getWalkImageRight());
            } else {
                setImage(getWalkImageLeft());
            }
        }
    }
    
    public GreenfootImage getWalkImageRight() {
        switch (frame) {
            case 1:
                return pwalkR1;
            case 2:
                return pwalkR2;
            case 3:
                return pwalkR3;
            case 4:
                return pwalkR4;
            default:
                return pwalkR1;
        }
    }
    
    public GreenfootImage getWalkImageLeft() {
        switch (frame) {
            case 1:
                return pwalkL1;
            case 2:
                return pwalkL2;
            case 3:
                return pwalkL3;
            case 4:
                return pwalkL4;
            default:
                return pwalkL1;
        }
    }
    
    public void playRandomSound() {
        if (soundCooldown == 0) {
            if (soundCounter == 0) {
                skeletonSound1.play();
                soundCounter++;
            } else {
                skeletonSound2.play();
                soundCounter = 0;
            }

            soundCooldown = tiempoEspera;
        } else {
            soundCooldown--;
        }
    }
}
