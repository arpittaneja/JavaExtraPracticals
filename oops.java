package s;
import java.util.Scanner;
public class oops {
    public static void main(String[] args){
        Phone OnePlus = new Phone();               //new Phone is a default constructor and when it is initialized, it simultaneously prints the sout line in the default constructor definition of its corresponding CLASS.
        OnePlus.name="8T";
        OnePlus.camera = 48;
        OnePlus.processor = "Snapdragon 865";

        System.out.println(OnePlus.camera +"mp camera and processor is " + OnePlus.processor);

        Phone Apple = new Phone("iPhone 12", 12);           //Prameterised arguments
        Apple.processor = "A14";

        System.out.println(Apple.camera +"mp camera and processor is " + Apple.processor);

        OnePlus.sgame();
        OnePlus.sgame("templerun");

        System.out.println("The number of objects created in class Phone is "+ Phone.count);           //Phone.count here signifies that static is called only by a class and not by any of its object.
}}


class Phone{
    static int count;                                       //static = a property unique to classes, it doesnt depend upon the objects. Accessible only to classes, NOT OBJECTS.
    public Phone(){                                                                 //default constructor is basically a function which calls itself whenever its corresponding object is created
        count++;
        System.out.println("Creating an object (this is a default constructor)");   //we use constructors when we need to print/do something at the time we call an object, both simultaneously
    }//constructors have no return type


    public Phone(String newName, int newCamera){
        System.out.println("Creating an object (this is a default constructor)");//Parametrised constructor, same as default constructor but it has parameters. T o save time we could pass parameters and update values simultaneously as we create an object, to save time.     name = newName;
        count++;
        name = newName;                                        //constructs and initializes at the same time
        camera= newCamera;
    }
    String name;
    int camera;
    String processor;


    void sgame(){
        System.out.println(name + "started game ");
    }
    void sgame(String game){
        System.out.println(name + "started game " + game );
    }
}