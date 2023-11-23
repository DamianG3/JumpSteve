import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{
    private GreenfootSound backgroundMusic;

    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1);
        backgroundMusic = new GreenfootSound("endsong.wav");
        backgroundMusic.playLoop();
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("m")) {
            backgroundMusic.stop();

            Greenfoot.setWorld(new Menu());
        }
    }
    
}
