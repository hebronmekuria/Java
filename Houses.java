/***********
  * 
  * @author: Hebron Mekuria
  * @version: Februaru 15, 2021
**/



public class Houses {

   public static void main(String[] args)  {
       drawHouse(.2, .5);//this part is from Liz Hoffman
       drawHouse(.5,.5);
       drawHouse(.8,.5);
   }
  
   public static void drawDoor(double x, double y)  {
      final double WIDTH = .05;
      final double HEIGHT = .1;
      final double KNOB_RADIUS = .005;
      final double KNOB_OFFSET = -.01;      
      StdDraw.rectangle(x, y+HEIGHT / 2, WIDTH / 2, HEIGHT / 2);
      StdDraw.filledCircle(x - KNOB_OFFSET, y+HEIGHT / 2, KNOB_RADIUS);
   }
   public static void drawHouse(double x, double y) {
     
     final double WIDTH = .2;
     final double HEIGHT = .3;
     final double RECTANGLE_HEIGHT = .2;
     StdDraw.rectangle(x, y, WIDTH/2, RECTANGLE_HEIGHT/2);
     //from Liz Hoffman
     StdDraw.line(x-(WIDTH/2), y+(RECTANGLE_HEIGHT/2), x, y+ (HEIGHT-.1));;
     StdDraw.line(x+(WIDTH/2), y+(RECTANGLE_HEIGHT/2), x, y + HEIGHT-.1);
     drawDoor(x,y-.1);
     
   }
}
