import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
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

        netherblue netherblue = new netherblue();
        addObject(netherblue,75,640);
        netherblueX3 netherblueX3 = new netherblueX3();
        addObject(netherblueX3,291,570);
        netherblueX4 netherblueX4 = new netherblueX4();
        addObject(netherblueX4,544,620);
        netherblue netherblue2 = new netherblue();
        addObject(netherblue2,663,566);

        netherblueX3 netherblueX32 = new netherblueX3();
        addObject(netherblueX32,561,468);
        netherblue netherblue3 = new netherblue();
        addObject(netherblue3,661,514);
        netherblueX2 netherblueX2 = new netherblueX2();
        addObject(netherblueX2,376,378);
        netherblue netherblue4 = new netherblue();
        addObject(netherblue4,164,294);
        netherblueX2 netherblueX22 = new netherblueX2();
        addObject(netherblueX22,817,350);
        netherblue netherblue5 = new netherblue();
        addObject(netherblue5,935,230);
        netherblue5.setLocation(939,213);
        removeObject(netherblue5);
        netherblueX2 netherblueX23 = new netherblueX2();
        addObject(netherblueX23,919,236);
        addObject(netherblue5,995,176);
        netherblue netherblue6 = new netherblue();
        addObject(netherblue6,991,121);
        netherblueX4 netherblueX42 = new netherblueX4();
        addObject(netherblueX42,865,122);
        netherblue6.setLocation(997,120);
        netherblueX2 netherblueX24 = new netherblueX2();
        addObject(netherblueX24,788,638);
        netherblueX3 netherblueX33 = new netherblueX3();
        addObject(netherblueX33,972,636);
        creeper creeper = new creeper(2);
        addObject(creeper,1007,579);
        creeper.setLocation(1013,586);
        skeleton skeleton = new skeleton(1);
        addObject(skeleton,333,507);
        creeper creeper2 = new creeper(1);
        addObject(creeper2,611,410);
        steve steve = new steve();
        addObject(steve,76,575);
        netherblue.setLocation(87,626);
        removeObject(netherblue);
        netherblueX2 netherblueX25 = new netherblueX2();
        addObject(netherblueX25,81,650);
        netherblueX25.setLocation(81,643);
        Lingot lingot = new Lingot();
        addObject(lingot,161,240);
        Lingot lingot2 = new Lingot();
        addObject(lingot2,597,568);
        Lingot lingot3 = new Lingot();
        addObject(lingot3,939,180);
        netherblueX42.setLocation(915,122);
        netherblueX42.setLocation(847,108);
        netherblueX42.setLocation(876,114);
    }
}
