import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class DigitalArtistry extends GraphicsProgram {

    public void run(){
        double height = getCanvasHeight(); //470
        double width = getCanvasWidth(); //754
        int size = 250;
        int rad = size/2;
        int w_side = 75;
        int h_side = 100;

        GOval circle = new GOval(size,size);
        circle.setFillColor(Color.yellow);
        circle.setFilled(true);
        add(circle, (width/2)-rad, (height/2)-rad);

        GRect rect = new GRect(w_side,h_side);
        rect.setFillColor(Color.red);
        rect.setFilled(true);
        add(rect, (width/2)-(w_side/2), (height/2)-(h_side/2));


        setBackground(Color.darkGray);
    }

    public static void main(String[] args){
        (new DigitalArtistry()).start(args);
    }
}
