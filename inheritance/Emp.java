/*
 * Aggregation (Inheritance)
 */

 //Aggregation : parent child relation withod extends keyword
public class Emp {
    
    int eid;
    String ename;

    Emp(int id, String name){
        this.eid = id;
        this.ename = name;
    }
}

class Addr { //has-a relation, No extend keyword is used

    String city, state;
    Emp e; //created a object for inheriting the Emp class method

    Addr(String city, String state, Emp e){ //Here object of Emp is passed
        this.city = city;
        this.state = state;
        this.e = e;
    }

    void show(){
        System.out.println("Eid : " + e.eid);
        System.out.println("Ename : " + e.ename);
        System.out.println("City : " + city);
        System.out.println("State : " + state);
    }

    public static void main(String[] args){
        Emp e1 = new Emp(1, "Ansh"); //Creating the object for Emp to store eid, ename
        Emp e2 = new Emp(2, "Ankit");

        Addr a1 = new Addr("Delhi", "Delhi", e1); //Here object is called of Emp(e1) which is givn as input for Addr oject
        Addr a2 = new Addr("New Ashok Nagar", "Delhi", e2);

        a1.show();
        a2.show();
    }
}
