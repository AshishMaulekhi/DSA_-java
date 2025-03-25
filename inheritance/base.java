/*
 * Dynamic Polymorphism()
 * Binding : 
 *          1.Up-casting 
 *          2.Down-casting
 */

class base {

    void show(){
        System.out.println("This is base class");
    }

    void display(){
        System.out.println("This is display function of base class");
    }
}

class child extends base {

    void show(){
        System.out.println("This is child class");
        super.show(); //for show of base class
    }

    void dis(){
        System.out.println("This is dis function of child class");
    }

    public static void main(String[] args){

        base b = new child(); // Run-time Binding(down-casting)
        b.show();
        b.display(); // b.dis(); this will throw error since b is of base type

        child c = (child)b; //up-casting
        c.dis();

    }
}