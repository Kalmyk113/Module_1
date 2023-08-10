import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class DigitalArtistry extends GraphicsProgram {

    public void run(){
        double height = getCanvasHeight(); //470
        double width = getCanvasWidth(); //754
        int size = 250;
        int rad = size/2;
        int w_side = 600;
        int h_side = 100;

        GOval circle = new GOval(size,size);
        circle.setFillColor(Color.yellow);
        circle.setFilled(true);
        add(circle, (width/2)-rad, (height/2)-rad);

        GOval oval = new GOval(rad,size);
        oval.setFillColor(Color.blue);
        oval.setFilled(true);
        add(oval,(width/2)-(rad/2),(height/2)+(size/2));

        GRect rect = new GRect(w_side,h_side);
        rect.setFillColor(Color.red);
        rect.setFilled(true);
        add(rect, (width/2)-(w_side/2), (height/2)-rad-(h_side*2/3));

        GImage korb = new GImage("korb.png");
        korb.scale(0.1);
        add(korb,(width/2)-(korb.getWidth()/2),(height/2)-(korb.getHeight()/2));

        GTurtle tutel = new GTurtle();
        add(tutel,150,150);

        GLabel label = new GLabel("Praise Korb and Friend");
        label.setFont("times new roman-35");
        label.setColor(Color.white);
        add(label,(width/2)-(label.getWidth()/2),(height/4));

        setBackground(Color.darkGray);

    }

    public static void main(String[] args){
        (new DigitalArtistry()).start(args);
    }
}
