import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class HelloWorldGraphics extends GraphicsProgram {

    public void run(){
        GLabel label = new GLabel("Hello World");
        add(label, 100, 100);
    }

    public static void main(String[] args){
        (new HelloWorldGraphics()).start(args);
    }
}
