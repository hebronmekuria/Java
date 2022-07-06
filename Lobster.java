import greenfoot.*;

/**
 * EMU Lobster class
 */
public class Lobster extends Animal
{
    private static final int EAST = 0;
    private static final int WEST = 1;
    private static final int NORTH = 2;
    private static final int SOUTH = 3;
    
    private int direction;
    private int leavesEaten;
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    ////the following code is adopted from the wombat class
    {
        if(foundCrab()) {
            eatCrab();
        }
        else if(canMove()) {
            move();
        }
        else {
            turnLeft();
        }
        
        
    }

    /**
     * Check whether there is a crab in the same cell as we are.
     */
    public boolean foundCrab()
    {
        Actor crab = getOneObjectAtOffset(0, 0, Crab.class);
        if(crab != null) {
            return true;
        }
        else {
            return false;
        }
    }
    

    public void eatCrab()
    {
        int crabsEaten=0;
        Actor crab = getOneObjectAtOffset(0, 0, Crab.class);
        if(crab != null) {
            // eat the crab.
            getWorld().removeObject(crab);
            crabsEaten = crabsEaten + 1; 
        }
    }
    

    
    public void move()//this code is adopted from the wombat class
    
    {   
        if (canMove()) {
           
        
        int random=Greenfoot.getRandomNumber(30);
        int random2=Greenfoot.getRandomNumber(90);
        
        int random3=-1*random2;
        turn(random);

        move(100);
        turn(random3);
        
        
    
  
    }
/**
        switch(direction) {
            case SOUTH :
                setLocation(getX(), getY() + 1);
                break;
            case EAST :
                setLocation(getX() + 1, getY());
                break;
            case NORTH :
                setLocation(getX(), getY() - 1);
                break;
            case WEST :
                setLocation(getX() - 1, getY());
                break;
        }
        **/
    }

    /**
     * Test if we can move forward. Return true if we can, false otherwise.
     */
    public boolean canMove()
    {
        World myWorld = getWorld();
        int x = getX();
        int y = getY();
        switch(direction) {
            case SOUTH :
                y++;
                break;
            case EAST :
                x++;
                break;
            case NORTH :
                y--;
                break;
            case WEST :
                x--;
                break;
        }
        // test for outside border
if (x >= myWorld.getWidth() || y >= myWorld.getHeight()) {
            return false;
        }
        else if (x < 0 || y < 0) {
            return false;
        }
      return true;
    }

    /**
     * Turns towards the left.
     */
    public void turnLeft()
    {
        switch(direction) {
            case SOUTH :
                setDirection(EAST);
                break;
            case EAST :
                setDirection(NORTH);
                break;
            case NORTH :
                setDirection(WEST);
                break;
            case WEST :
                setDirection(SOUTH);
                break;
        }
    }

    /**
     * Sets the direction we're facing.
     */
    public void setDirection(int direction)
    {
        this.direction = direction;
        switch(direction) {
            case SOUTH :
                setRotation(90);
                break;
            case EAST :
                setRotation(0);
                break;
            case NORTH :
                setRotation(270);
                break;
            case WEST :
                setRotation(180);
                break;
            default :
                break;
        
    }
    }
}

