import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class loading here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class loading extends World
{
    public static GreenfootSound backgroundMusic;

    Random random = new Random();
    private long tiempoInicio;
    int tiempoEspera;
    
    /**
     * Constructor for objects of class loading.
     * 
     */
    public loading()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.        
        super(1080, 720, 1);
        tiempoInicio = System.currentTimeMillis();
        tiempoEspera = random.nextInt(4000, 6600);
        
        loadingWorld loadingWorld = new loadingWorld();
        addObject(loadingWorld,540,360);
    }
    
    public static void stopMusic() {
        if (backgroundMusic != null) {
            backgroundMusic.stop();
        }
    }
    
    public void act()
    {   
        
        if ( (System.currentTimeMillis() - tiempoInicio) > tiempoEspera) {
            backgroundMusic = new GreenfootSound("pigstep.wav");
            backgroundMusic.playLoop();
            Greenfoot.setWorld(new level1());
        }
    }
    
    
    
}
