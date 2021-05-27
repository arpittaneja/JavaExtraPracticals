package s;

public class oops2 {
public static void main(String[] args){
    Employee Manager = new Employee(11, "Micheal");
    Manager.intro();
    Employee Salesman =  new Employee(15, "Dwight");
    Salesman.intro();

    HR Sole = new HR("Toby", 12);
    Sole.intro();
}
}
class Employee{
    int id;
    String name;
    static int count;

    void intro(){
        System.out.println("My name is " + name + " and my uid is "+ id);
    }

    public Employee(){
        count++;
        System.out.println("creating an object");
    }
    public Employee(int newID, String newName){
        System.out.println("creating an object");
        name = newName;
        id=newID;
    }

}
class HR extends Employee{
public HR (String name, int id){                            //I have created another constructor for this inherited class because constructors do not get inherited in inheritance, so we need to create a new constructor'
    this.name=name;
    this.id=id;
}
}