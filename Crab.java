import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
/**
 * This class defines a crab, EMU Version.
 */

public class Crab extends Animal
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    private int counter;
    /**
     * Create a crab and initialize its two images.
     */
    public Crab()
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        setImage(image1);
        wormsEaten = 0;
        counter=0;
    }
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(foundWorm()) {
            eat();
        }
        else{
        move(50);
        turn (98);
        move(50);
    }
        if (   (Greenfoot.isKeyDown("left")  )){
	turn(-3);
}

        if (   (Greenfoot.isKeyDown("right")  )){
	turn(3);
}

    }
   
    /**
     * switches the crabs images to simulate movement
     */
    public void switchImage()
    {
        if(getImage() == image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }
    /**
     * counts up to switch images slower
     */
    public void counter()
    {
        counter=counter+1;
        if(counter==3)
        {
            switchImage();
            counter=0;
        }
    }
    

    public boolean foundWorm()
    {
        Actor worm = getOneObjectAtOffset(0, 0, Worm.class);
        if(worm != null) {
            return true;
        }
        else {
            return false;
        }
    }
    

    public void eat()
    {
        int wormsEaten=0;
        Actor worm = getOneObjectAtOffset(0, 0, Crab.class);
        if(worm != null) {
            
            getWorld().removeObject(worm);
            wormsEaten = wormsEaten + 1; 
        }
    

    //Greenfoot.playSound("mycustomsound.wav");
}
}

