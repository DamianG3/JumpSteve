import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    private static GreenfootSound backgroundMusic = new GreenfootSound("menusong.wav");;
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1);
        
        if (!backgroundMusic.isPlaying()) {
            backgroundMusic.playLoop();
        } 
        
    }
    
    public void act (){
        if(Greenfoot.isKeyDown("space")){
            //backgroundMusic.stop();
            Greenfoot.setWorld(new Credits());
        }
        if(Greenfoot.isKeyDown("enter")){
            backgroundMusic.stop();
            
            Greenfoot.setWorld(new loading());
        }
        if(Greenfoot.isKeyDown("e")){
            //backgroundMusic.stop();
            
            Greenfoot.setWorld(new instructions());
        }
    }
}
