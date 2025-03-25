/*
 *TOPICS
 * Constructor
 * Need of Constructor
 * Constructor Example
 * Types of constructor : 1.Default constructor
 *                        2.Paramaterized constructor
 * Chaining construction
 * Method Overloading
 */


 // In-build constructor
public class Student { //constructor 

    int s_id;
    String s_name;

    public void show(){
        System.out.println(s_id);
        System.out.println(s_name); //constructor has no return type
    }

    public static void main(String[] args){
        Student s1;
        s1 = new Student(); //Student() is a default in-build constructor
        s1.show(); //The implicit constructor will initialize the default values for the object
    }
}

//Example of constructor : 
class Teacher{

    int t_id;
    String t_name;

    public Teacher(int id, String name){ //Constructor created by the user
        this.t_id = id; //inializing variables
        this.t_name = name;
    }

    void show(){
        System.out.println("The Teacher ID is : " + t_id);
        System.out.println("The Teacher name is : " + t_name);
    }

    public static void main(String[] args){
        Teacher t1 = new Teacher(12, "Ansh"); //initiatzing object using the constructor created above
        t1.show();
    }
}

// Types of constructor :
//Default constructor :
// -> Does not have parameters
// -> Created when user wants to initialize the object (defaultly)
class test3{
    int x, y;

    test3(){ //default constructor created
        x = 10;
        y = 20;
    }

    void show(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args){
        test3 t1 = new test3();
        t1.show();
    }
}

//Paramaterized construtor :
// -> Specific number of parameter
class test4{
    int id;
    String name;

    test4(int id, String name) { //parameters
        this.id = id;
        this.name = name;
    }

    void show(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args){
        test4 t2 = new test4(1, "Ansh");
        t2.show();
    }
}

//Chaining constructor : 
// -> In a class there are more than one contructor which can call each other
class test5 {
    int id;
    static String name;

    //constructor 1(c1)
    test5(){
        this(10); //Calling the Chaining constructor 2
        System.out.println(id); // After c2 it will run
    }

    //constructor 2(c2)
    test5(int id){
        this(id, name); //Calling the Chaining constructor 3
        System.out.println(id); // After c3 it will run
    }
    
    //constructor 3(c3)
    test5(int id, String name){ //this will run when called
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args){
        new test5();
    }
}

//Method overloading :
// -> Same name of method but different signature(different parameter)
// -> MethodOverloading is achieved at compile time
class test6{

    void sum(int x, int y){ //different parameter
        System.out.println("Sum is : " + (x+y));
    }

    void sum(int x, int y, int z){ //different parameter
        System.out.println("Sum is : " + (x+y+z));
    }

    void sum(double x, double y){ //different datatype
        System.out.println("Sum is : " + (x+y));
    }

    public static void main(String[] args){
        test6 t6 = new test6();
        t6.sum(45, 45); //first sum method
        t6.sum(45, 45, 45); // 1. overloaded second sum method (using differnt parameters)
        t6.sum(12.22, 12.00); // 2. overload using different datatype
    }
}

