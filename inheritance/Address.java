/*
 * Inheritance :
 *              1. Association : is - a relation (using extends keyword, indirect way)
 *              2. Aggregation  : has - a relation 
 * Types of Inheritnace : 
 *                      1. Single level
 *                      2. Multi level
 * Final keyword (for variable, method and class).
 * 
 * Polymorphism : 
 * Method Overriding.
 * Super keyword in method overriding.
 */

// Inheritance : When the subclass inherits the propertires of superclass
// when child class inherits the parent class its done during the compile time
// Association : 
// Single level
class User {

    int user_id;
    String user_name;
    String user_type;

    void set_user(int userid, String username, String type){
        this.user_id = userid;
        this.user_name = username;
        this.user_type = type;
    }

    void get_user(){
        System.out.println("User ID : " + user_id);
        System.out.println("User name : " + user_name);
        System.out.println("User type : " + user_type);
    }
}

class Address extends User {
    String city;
    String state;
    String country;

    void set_address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }

    void get_address(){
        System.out.println("City is : " + city);
        System.out.println("State is : " + state);
        System.out.println("Country is : " + country);
    }

    public static void main(String[] args){
        Address a1 = new Address();
        a1.set_user(1, "Ansh", "Employee");
        a1.set_address("Mayur Vihar Phase - 3", "Delhi", "India");
        a1.get_user();
        a1.get_address();
    }
}

//Multi-level Inheritance:
// dadaji --> papaji --> betaji (inheritance level)
class dadaji {
    void show(){
        System.out.println("Dadaji show call");
    }
}
class papaji extends dadaji{
    void display(){
        System.out.println("Papaji display call");
    }
}

//Final keyword : value cannot be change of final variable
final class mummyji{ //final class can not be inherited

    final int xy = 10;

    void pri(){
        System.out.println("Mummyji pri call");
    }

    public static void main(String args[]){
        // xy = 30; can not be over written as xy is final declared
    }
}

class betaji extends papaji{
    void print(){
        System.out.println("Beta ji");
    }

    public static void main(String[] args){
        betaji b1 = new betaji();
        b1.show();
        b1.display();
        b1.print();
    }
}

//Method Overriding :
// -> same method in child class as well as in parent class
// -> Method overriding(overwriting) is acheived at run-time/runtime polymorphism
class test7 {

    static void show(){ //static method is always called by class name 
        //parent can be : public -> protected -> default -> private (strong to weak)
        System.out.println("Test 7 is calling");
    }
}

//Super Keyword : 
// -> Use to invoke method and contructor of parent class
class test8 extends test7{

    public static void show(){ //In static this is not overriding but is method hiding(since static block is created at compile time)
        //But the child should be Stronger or equal to parent method access specifier
        System.out.println("Test 8 is calling");
        //super.show(); //super keyword for invoking the show() method of test7
        test7.show(); //because static method is called by class name
    }

    public static void main(String[] args){
        //test8 t = new test8();
        //t.show();
        test8.show(); //because static method is called by class name

    }
}