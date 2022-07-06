
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * In this part of the LAB, we have created a world in Greenfoot that contains an image of the EMU campus..
 * 
 * @author Hebron Mekuria
 * @version April 14 2021
 */
public class Image extends World
{

    /**
     * Constructor for objects of class Image.
     * 
     */
    public Image()
    {    
        // Create a new world with 610x375 cells with a cell size of 1x1 pixels.
        super(610, 375, 1); 
    }        
/**
* Updates all pixels to the closest gray equivalent.
*/
       public void grayScale() {
	GreenfootImage img = getBackground();
	int width=getWidth();
	int height=getHeight();
	
	for (int i=0; i<width; i++){
	    for (int j=0;j<height; j++){
	        Color culor=getColorAt(i,j);
	        int redamount=culor.getRed();
	        int greenamount=culor.getGreen();
	        int blueamount=culor.getBlue();
	        int average=(redamount+greenamount+blueamount)/3;
	        Color newcolor=new Color(average,average,average);
	        img.setColorAt(i,j,newcolor);
	       }
	   }
	
}
/**
* Applies a sepia transformation to all pixels.
*/
public void sepiaTone() {
    GreenfootImage img = getBackground();
	int width=getWidth();
	int height=getHeight();
	
	for (int i=0; i<width; i++){
	    for (int j=0;j<height; j++){
	        Color culor=getColorAt(i,j);
	        int redamount=culor.getRed();
	        int greenamount=culor.getGreen();
	        int blueamount=culor.getBlue();
	        double newredd=0.393*redamount+0.769*greenamount+0.189*blueamount;
	        double newgreend=0.349*redamount+0.686*greenamount+0.168*blueamount;
	        double newblued=0.272*redamount+0.534*greenamount+0.131*blueamount;
	        int newred=(int)newredd;
	        int newgreen=(int)newgreend;
	        int newblue=(int)newblued;
	        if (newred>255){
	            newred=255;
	           }
	        if (newgreen>255){
	            newgreen=255;
	           }
	        if (newblue>255){
	            newblue=255;
	           }
	                
	        Color newcolor=new Color(newred,newgreen,newblue);
	        img.setColorAt(i,j,newcolor);
	       }
	   }
}

/**
* Replaces the right half of an image with a reflection of its left half.
*/
public void reflectLeft() {
  GreenfootImage img = getBackground();
  int width=getWidth();
  int height=getHeight();
  	
	for (int i=0; i<width/2; i++){
	    for (int j=0;j<height; j++){
             
             	Color culor=getColorAt(i,j);
	      
	        img.setColorAt(img.getWidth()-i-1, j, culor);
	        
	        
	       }
	   }
}  


/**
* Replaces the bottom half of an image with a reflection of its top half.
*/
public void reflectTop() {
    GreenfootImage img = getBackground();
  int width=getWidth();
  int height=getHeight();
  	
	for (int i=0; i<width; i++){
	    for (int j=0;j<height/2; j++){
             
             	Color culor=getColorAt(i,j);
	      
	        img.setColorAt(i, img.getHeight()-j-1, culor);
	        
	        
	       }
	   }

}


    }

