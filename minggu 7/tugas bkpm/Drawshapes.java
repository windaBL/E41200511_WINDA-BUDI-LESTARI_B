/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawshapes;

/**
 *
 * @author acer
 */
import java.awt.*;
import java.applet.*;

public class Drawshapes extends Applet{
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;

   
    public void init ()  {
        //the font is Arial size, 18 and is ialicized
        font = new Font ("Arial", Font.ITALIC, 18);
        
        //some colors are predefined in the Color class
        redColor = Color.red;
        backgroundColor = Color.orange;
        
        //colors can be created using red, green, blue values
        blueColor = new Color(0,0,122);
        
        //set the background Color of the Apllet
        setBackground(backgroundColor);
       
    }
    public void stop() {
       
    }
     /**this method paints theshapes to the screen
      * 
      */
    public void paint(Graphics graph){
        //set font
        graph.setFont(font);
        //create a title
        graph.drawString("Draw Shapes",90,20);
        
        //set the color for the first shape
        graph.setColor(blueColor);
        
        //draw a rectangle using drawrect(int x, int y,int width, int heigh)
        graph.drawRect(120, 120, 120, 120);
        
        //this will fill a rectangle
        graph.fillRect(115, 115, 90, 90);
        
        //set the color for the next shape 
        graph.setColor(redColor);
        
        //draw a circle using drawArc(int x, int y, int width, int height, int startAngle, in arcAngle)
        graph.fillArc(110,110,50,50,0,360);
        
        //set color for next shape
        graph.setColor(Color.CYAN);
        
        //draw another rectangle
        graph.drawRect(50,50,50,50);
        
        //this will fill a ectangle
        graph.fillRect(50,50,60,60);
    }
}
