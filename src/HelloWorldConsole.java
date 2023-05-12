import acm.program.*;

public class HelloWorldConsole extends ConsoleProgram {
    public void run(){
        println("Hello World");
    }

    public static void main(String[] args){
        (new HelloWorldConsole()).start(args);
    }

}
