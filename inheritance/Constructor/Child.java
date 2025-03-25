/*
 * Constructor Reusability
 */

 //Constructor Reusability :
class Base {
    
    int x;
    Base(int x){
        System.out.println("Base class constructor is called : " + x);
    }
}

class Child extends Base{

    int y;
    Child(int y){
        //super(); //It will be called automatically also but can be used mannually
        super(10);
        System.out.println("Child class is called : " + y);
        //super(); //This will throw error
    }

    void show(){
        System.out.println("This is Child Class");
    }

    public static void main(String[] args){
        @SuppressWarnings("unused")
        Child c1 = new Child(20); //this will call the constructor of child class as well as parent class also
        //as Child class will automatically call it
    }
}
