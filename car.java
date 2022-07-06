import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    int year;
    String make;
    int speed;
    boolean carCrash;
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public car(int year, String make, int speed){//what output daata value should this have
        this.year=year;
        this.make=make;
        this.speed=speed;
        speed=0;

    }

    public String ToString(){
        String Returnval=String.format("A %d %s that is going %d mph",year,make,speed);
        return Returnval;
    }

    public void act() 
    {
        // handle mouse click events
        //move(10);
        if (Greenfoot.mouseClicked(this)) {
            JOptionPane.showMessageDialog(null, this.toString());

        }

        // update speed and move the car
        if (Greenfoot.isKeyDown("up")) {
            accelerate();
        }
        if (Greenfoot.isKeyDown("down")) {
            brake();
        }
        move(speed);
        // check if the car has crashed
        Actor other = getOneIntersectingObject(car.class);
        if (other != null) {
            carCrash = true;
        }

    } 
    public int getSpeed(){
        return speed;
    }

    public String getMake(){
        return make;
    }

    public int getYear(){
        return year;
    }

    public void accelerate(){
        speed=speed+1;

    }

    public void brake(){
        speed=speed-1;
    }

    public void checkCrash() {         
        // check if the car has crashed
        Actor other = getOneObjectAtOffset(0,0,car.class);
        if (!carCrash){ 
            if (other != null) {
                carCrash=false;
                Greenfoot.playSound("crash.wav");
                JOptionPane.showMessageDialog(null, "You have crashed!");
                Greenfoot.stop();
            }
        }
    }
}
