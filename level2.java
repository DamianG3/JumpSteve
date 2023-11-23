import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{
    private GreenfootSound backgroundMusic;
    private World nextLevel;
    /**
     * Constructor for objects of class level2.
     * 
     */
    public level2()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1); 
        prepare();
       
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        NetherrackX2 netherrackX2 = new NetherrackX2();
        addObject(netherrackX2,133,368);
        steve steve = new steve();
        addObject(steve,62,288);
        netherrackX2.setLocation(69,364);
        souldsoilX2 souldsoilX2 = new souldsoilX2();
        addObject(souldsoilX2,316,370);
        skeleton skeleton = new skeleton(2);
        addObject(skeleton,286,306);
        Lingot lingot = new Lingot();
        addObject(lingot,107,312);
        skeleton.setLocation(286,319);
        Lingot lingot2 = new Lingot();
        addObject(lingot2,286,319);
        netherrackX2.setLocation(92,458);
        steve.setLocation(47,374);
        skeleton.setLocation(110,369);
        souldsoilX2.setLocation(328,367);
        removeObject(souldsoilX2);
        netherrackX2.setLocation(57,470);
        removeObject(netherrackX2);
        souldsoil souldsoil = new souldsoil();
        addObject(souldsoil,48,491);
        steve.setLocation(39,436);
        souldsoil.setLocation(39,159);
        steve.setLocation(53,107);
        skeleton.setLocation(553,398);
        souldsoil souldsoil2 = new souldsoil();
        addObject(souldsoil2,154,268);

        addObject(souldsoilX2,62,390);
        soulsand soulsand = new soulsand();
        addObject(soulsand,180,498);
        soulsand soulsand2 = new soulsand();
        addObject(soulsand2,43,659);
        lingot.setLocation(32,609);
        removeObject(skeleton);
        lingot2.setLocation(288,320);
        removeObject(lingot2);
        lingot.setLocation(38,608);
        steve.setLocation(42,108);
        skeleton skeleton2 = new skeleton(2);
        addObject(skeleton2,439,546);
        souldsoilX3 souldsoilX3 = new souldsoilX3();
        addObject(souldsoilX3,448,621);
        soulsandX2 soulsandX2 = new soulsandX2();
        addObject(soulsandX2,598,478);
        soulsandX3 soulsandX3 = new soulsandX3();
        addObject(soulsandX3,424,328);
        soulsandX3.setLocation(412,345);
        soulsandX4 soulsandX4 = new soulsandX4();
        addObject(soulsandX4,736,176);
        skeleton skeleton3 = new skeleton(4);
        addObject(skeleton3,731,110);
        Lingot lingot3 = new Lingot();
        addObject(lingot3,800,110);
        souldsoilX2.setLocation(86,387);
        removeObject(souldsoilX2);
        souldsoil souldsoil3 = new souldsoil();
        addObject(souldsoil3,50,386);
        soulsandX3.setLocation(475,351);
        soulsandX4.setLocation(686,210);
        skeleton3.setLocation(733,158);
        lingot3.setLocation(795,154);
        soulsand soulsand3 = new soulsand();
        addObject(soulsand3,947,23);
        soulsand soulsand4 = new soulsand();
        addObject(soulsand4,946,72);
        soulsand soulsand5 = new soulsand();
        addObject(soulsand5,945,120);
        souldsoil souldsoil4 = new souldsoil();
        addObject(souldsoil4,884,606);
        lingot3.setLocation(760,155);
        skeleton skeleton4 = new skeleton(2);
        addObject(skeleton4,1002,459);
        souldsoilX2 souldsoilX22 = new souldsoilX2();
        addObject(souldsoilX22,1021,514);
        souldsoil4.setLocation(848,602);
        souldsoilX22.setLocation(991,510);
        removeObject(souldsoilX22);
        soulsandX3 soulsandX32 = new soulsandX3();
        addObject(soulsandX32,1001,516);
    }
}
