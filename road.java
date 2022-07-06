import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class road extends World
{

    /**
     * Constructor for objects of class road.
     * 
     */
    public road()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        car car = new car(2010,"Toyota",40);
        
        addObject(car,491,155);
        
        car buggy=new car(2021,"Tesla",50);
        
        addObject(buggy,391,200);
        
        
    }
    
}
