/*
 * Data Abstraction
 * Abstract class and methods
 * constructor in abstract class 
 * Standarised declaration
 * Interface
 * Extention of interface with other interface
 * Default method and static in interface (from java 8 onwards)
 * Private members in interface (from java 9 onwards)
 * Functional Interface (method of object class)
 * lambda expression
 */


 //Abstraction : 
 //abstract keyword to create abstract class or method
 //If there is any one absract method then class should also be abstarct, but if class is abstract there can
 // be abstract or non abstract method in it

 //Abstract class : 
abstract class Animal {

    //Abstract method :
    abstract void fly(); //abstract method does not have any defination

    void nonfly(){
        System.out.println("Animal nonfly call");
    }
}

class Bird extends Animal {

    void fly(){
        System.out.println("Bird fly call"); //overriding
    }

    void show(){
        System.err.println("show call");
    }

    public static void main(String[] args){
        Bird b = new Bird();
        b.nonfly();
        b.fly();
        b.show();
    }
}

//Constructor in abstract class but its object is not created as abstract methods are incomplete
abstract class base {

    base(){
        System.out.println("base class default constructor call");
    }

}

class child extends base {

    child(){
        System.out.println("child class default constructor call");
    }

    public static void main(String[] args){
        @SuppressWarnings("unused")
        child c = new child(); //will automatically call the parent class constructor also

    }
}

//Standarised declaration for abstract
abstract class plan {
    abstract void rate();
}

class domsetic extends plan{

    int unit, rate;
    void rate(){
        unit = 100;
        rate = 5;
        System.out.println("Bill gen " + (unit*rate));
    }
}

class coms extends plan{

    int unit, rate;
    void rate(){
        unit = 100;
        rate = 10;
        System.out.println("Bill gen " + (unit*rate));
    }

    public static void main(String[] args){
        plan p1 = new domsetic(); //dynamic binding
        p1.rate();

        plan p2 = new coms(); // dynamic binding
        p2.rate();
    }
}

//Interface :
//Use to achieve abstraction, by default all method inside interface are 
//All method by default are abstract
interface my{

    void show(); //abstarct method
}


//Interface can be extended by another interface
interface my1 extends my {

    public void disp();

}

class Myshow implements my1{

    public void show(){
        System.out.println("myshow calls show method"); //method is implemented
    }

    public void disp(){
        System.out.println("myshow calls disp method");
    } 
   

    public static void main(String[] args){
        Myshow m = new Myshow();
        m.show();
        m.disp();
    }

}

//Default methods in interfaces
interface m2{

    default void show(){ //defination provided in interface itself as default
        System.out.println("My show call in interface");
        disp();
    }

    static void disp(){ //static method
        System.out.println("static disp call interface");
    }
}

class Myshow2 implements m2{

    //m2 method can be re - engine in class which implements it example :
    /*
     * public void show(){
     *      System.out.println("Re-engine of show method in Myshow2 class")}
     */

    public static void main(String[] args){

        Myshow2 m1 = new Myshow2();
        m1.show();
    }
}

//Private members in interface
interface m3{

    default void show(){
        System.out.println("m3 show call");
        disp(); //disp has been accessed through show method as it is private
    }

    //private members can also have defination inside interface
    private void disp(){
        System.out.println("m3 disp call(private)");
    }
}

class Myshow3 implements m3{
    
    public static void main(String[] args){
        Myshow3 m = new Myshow3();
        m.show(); //from show() we have accessed the disp() as it was private and cannnot be accessed outside
        // m.disp(); disp can not be accessed as it is outside
    }
}

//Function Interface : have only one abstract method
@FunctionalInterface //always use the annotation(as of functional interface and others)
interface m4 {

    void show();

     // void sh(); can not be declared because m4 is functional interface and can only have one abstract method

    int hashCode(); //method of object class(object class is the parent class of all) can also be used in functional interface
}

class Myshow4 implements m4{

    public void show(){
        System.out.println("Functional interface of m4");
    }

    public static void main(String[] args){
        Myshow4 m = new Myshow4();
        m.show();
        System.out.println(m.hashCode());
    }
}

//Lambda expression : 
// -> less coding, to provide implementation of functional interface, very useful with collections
// Syntax = (argument list) -> {body} {argument list, arrow token, body}
// 1. No parameter : () -> {body}, 2. One parameter : (a, b) -> {body} and so on..
@FunctionalInterface
interface m5 {

    void show();
}

class Myshow5 { //We will create a reference ID of m5 interface not a object/instance(since object can not be created for interface)

    public static void main(String[] args){
        int x = 10;
        /* m5 m = new m5() { //anonymous functionality this not object this is reference ID
            public void show() { //interface method called using reference
                System.out.println("m5 : " + x); //complexity increases that is why lambda expression is used
            }
        };
        m.show(); */
        m5 m = () -> { //lambda expression of above code
            System.out.println("m5 : " + x);
        };
        m.show();
    }
}