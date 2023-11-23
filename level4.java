import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level4 extends World
{
        
    /**
     * Constructor for objects of class level.
     * 
     */
    public level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(495, 660, 1); 
        prepare();
        
        
    }    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        NetherrackX2 netherrackX2 = new NetherrackX2();
        addObject(netherrackX2,93,239);
        NetherrackX3 netherrackX3 = new NetherrackX3();
        addObject(netherrackX3,93,289);
        netherrackX3.setLocation(99,289);
        netherrackX3.setLocation(142,284);
        netherrackX3.setLocation(93,293);
        netherrackX3.setLocation(122,285);
        netherrackX3.setLocation(108,300);
        netherrackX3.setLocation(109,283);
        netherrackX3.setLocation(151,289);
        netherrackX3.setLocation(142,296);
        netherrackX3.setLocation(145,296);
        netherrackX3.setLocation(94,284);
        steve steve = new steve();
        addObject(steve,48,581);
        NetherrackX2 netherrackX22 = new NetherrackX2();
        addObject(netherrackX22,66,631);
        steve.setLocation(38,573);
        skeleton skeleton = new skeleton(2);
        addObject(skeleton,240,469);
        NetherrackX3 netherrackX32 = new NetherrackX3();
        addObject(netherrackX32,240,529);
        NetherrackX2 netherrackX23 = new NetherrackX2();
        addObject(netherrackX23,416,396);
        zombie zombie = new zombie(2);
        addObject(zombie,444,338);
        removeObject(zombie);

        addObject(zombie,443,330);
        zombie.setLocation(437,336);
        NetherrackX2 netherrackX24 = new NetherrackX2();
        addObject(netherrackX24,254,340);
        creeper creeper = new creeper(2);
        addObject(creeper,255,284);
        creeper.setLocation(258,276);
        Netherrack netherrack = new Netherrack();
        addObject(netherrack,347,265);
        creeper.setLocation(250,239);
        netherrackX24.setLocation(225,298);
        netherrackX23.setLocation(424,386);
        zombie.setLocation(445,332);
        netherrackX24.setLocation(251,307);
        creeper.setLocation(253,232);
        netherrackX23.setLocation(461,387);
        zombie.setLocation(456,336);
        netherrackX24.setLocation(235,313);
        removeObject(netherrackX24);
        NetherrackX3 netherrackX33 = new NetherrackX3();
        addObject(netherrackX33,248,320);
        creeper.setLocation(260,264);
        netherrackX23.setLocation(418,382);
        netherrackX23.setLocation(440,378);
        netherrackX23.setLocation(446,395);
        netherrackX23.setLocation(425,392);
        netherrackX32.setLocation(289,596);
        skeleton.setLocation(298,537);
        netherrackX23.setLocation(423,483);
        zombie.setLocation(453,426);
        netherrackX23.setLocation(428,469);
        zombie.setLocation(451,393);
        netherrackX32.setLocation(228,621);
        skeleton.setLocation(287,560);
        skeleton.setLocation(252,559);
        netherrackX23.setLocation(403,576);
        zombie.setLocation(438,507);
        removeObject(netherrackX23);
        NetherrackX3 netherrackX34 = new NetherrackX3();
        addObject(netherrackX34,403,573);

        addObject(netherrackX23,261,459);
        NetherrackX2 netherrackX25 = new NetherrackX2();
        addObject(netherrackX25,421,392);
        netherrackX23.setLocation(272,474);
        netherrackX32.setLocation(261,634);
        netherrackX34.setLocation(412,634);
        netherrackX23.setLocation(231,483);
        netherrackX25.setLocation(422,407);
        netherrackX32.setLocation(236,624);
        netherrackX34.setLocation(410,627);
        netherrack.setLocation(388,303);
        Netherrack netherrack2 = new Netherrack();
        addObject(netherrack2,448,208);
        creeper.setLocation(179,559);
        netherrackX33.setLocation(311,193);
        zombie.setLocation(453,333);
        netherrackX22.setLocation(61,626);
        netherrackX33.setLocation(290,211);
        netherrackX33.setLocation(269,212);
        NetherrackX4 netherrackX4 = new NetherrackX4();
        addObject(netherrackX4,240,36);
        Portal portal = new Portal();
        addObject(portal,95,200);
        portal.setLocation(108,136);
        portal.setLocation(63,162);
        portal.setLocation(94,178);
        portal.setLocation(120,200);
        portal.setLocation(87,133);
    }
}
