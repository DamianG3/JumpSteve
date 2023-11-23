import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{
    private GreenfootSound backgroundMusic;
    
    
    /**
     * Constructor for objects of class level1.
     * 
     */
    public int level = 1;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1);
        prepare();
    }
    
    public int getLevel() {
        return level;
    }
    
      
    
    // Agrega este método para detener la música
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        steve steve = new steve();
        addObject(steve,72,339);

        Dirt dirt3 = new Dirt();
        addObject(dirt3,486,55);
        removeObject(dirt3);
        
        steve.setLocation(264,102);
        steve.setLocation(253,100);
        steve.setLocation(212,81);
        steve.setLocation(246,93);
        steve.setLocation(252,92);
        removeObject(steve);

        steve steve2 = new steve();
        addObject(steve2,123,74);
        steve2.setLocation(116,598);
        steve2.setLocation(68,592);
        steve2.setLocation(39,584);
        steve2.setLocation(50,581);
        steve2.setLocation(52,600);
        
        Dirt dirt4 = new Dirt();
        addObject(dirt4,97,181);
        zombie zombie = new zombie(2);
        addObject(zombie,270,209);
        zombie zombie2 = new zombie(3);
        addObject(zombie2,470,170);
        dirt4.setLocation(112,325);
        Netherrack netherrack = new Netherrack();
        addObject(netherrack,704,278);
        Netherrack netherrack2 = new Netherrack();
        addObject(netherrack2,751,277);
        blackstoneX2 blackstoneX2 = new blackstoneX2();
        addObject(blackstoneX2,943,315);
        creeper creeper = new creeper(2);
        addObject(creeper,964,240);
        skeleton skeleton = new skeleton(2);
        addObject(skeleton,753,205);
        Lingot lingot = new Lingot();
        addObject(lingot,322,216);
        Lingot lingot2 = new Lingot();
        addObject(lingot2,237,218);
        Lingot lingot3 = new Lingot();
        addObject(lingot3,402,200);
        netherrack.setLocation(709,264);
        removeObject(netherrack);
        removeObject(netherrack2);
        NetherrackX4 netherrackX4 = new NetherrackX4();
        addObject(netherrackX4,705,403);
        lingot.setLocation(329,212);
        removeObject(lingot);
        lingot3.setLocation(408,200);
        removeObject(lingot3);
        dirt4.setLocation(139,324);
        removeObject(dirt4);
        removeObject(netherrackX4);
        removeObject(blackstoneX2);
        removeObject(creeper);
        skeleton.setLocation(752,196);
        removeObject(skeleton);
        removeObject(zombie2);
        removeObject(zombie);
        blackstoneX4 blackstoneX4 = new blackstoneX4();
        addObject(blackstoneX4,128,658);
        blackstoneX3 blackstoneX3 = new blackstoneX3();
        addObject(blackstoneX3,384,522);
        addObject(blackstoneX2,129,391);
        blackstoneX2 blackstoneX22 = new blackstoneX2();
        addObject(blackstoneX22,364,320);
        lingot2.setLocation(348,238);
        blackstoneX2.setLocation(110,387);
        blackstoneX2.setLocation(74,401);
        blackstoneX2.setLocation(105,401);
        zombie zombie3 = new zombie(2);
        addObject(zombie3,429,452);
        zombie3.setLocation(429,461);
        lingot2.setLocation(537,180);
        blackstone blackstone = new blackstone();
        addObject(blackstone,574,259);
        lingot2.setLocation(572,180);
        blackstone.setLocation(598,307);
        blackstone.setLocation(651,308);
        lingot2.setLocation(641,236);
        blackstone.setLocation(637,313);
        lingot2.setLocation(635,247);
        zombie zombie4 = new zombie(3);
        addObject(zombie4,860,530);
        blackstoneX3 blackstoneX32 = new blackstoneX3();
        addObject(blackstoneX32,912,604);
        blackstone blackstone2 = new blackstone();
        addObject(blackstone2,726,637);
        blackstoneX4.setLocation(164,646);
        removeObject(blackstoneX4);
        blackstoneX2 blackstoneX23 = new blackstoneX2();
        addObject(blackstoneX23,84,663);
        blackstone blackstone3 = new blackstone();
        addObject(blackstone3,501,202);
        blackstoneX23.setLocation(105,656);
        removeObject(blackstoneX23);
        blackstoneX3 blackstoneX33 = new blackstoneX3();
        addObject(blackstoneX33,101,662);
        blackstone blackstone4 = new blackstone();
        addObject(blackstone4,1011,553);
        blackstone blackstone5 = new blackstone();
        addObject(blackstone5,1010,503);
        blackstone blackstone6 = new blackstone();
        addObject(blackstone6,1010,446);
        blackstone6.setLocation(1010,454);
        blackstone blackstone7 = new blackstone();
        addObject(blackstone7,1007,403);
        blackstone7.setLocation(1010,408);
        blackstone2.setLocation(730,438);
        blackstone blackstone8 = new blackstone();
        addObject(blackstone8,888,431);
        removeObject(blackstoneX3);
        blackstoneX4 blackstoneX42 = new blackstoneX4();
        addObject(blackstoneX42,356,528);
        zombie3.setLocation(422,465);
    }
}
