import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class loadingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class loadingWorld extends Actor
{
    
    GifImage loadingGif = new GifImage("loading.gif");
    
    /**
     * Act - do whatever the loadingWorld wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        setImage(loadingGif.getCurrentImage());
               
    }
}
