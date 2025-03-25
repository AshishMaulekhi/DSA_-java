/*
 * QUESTIONS
 * 1.Proving Methodoveroading done at compile time
 * 2.Can private datamembers can be inherited in child class(but protected members can)
 */

//1.Methodoverloadig at compile time
//by making the method static we can prove it
public class Question {
    
    public static void sum(int a, int b){
        System.out.println("Sum is : " + (a+b));
    }

    public static void sum(int a, int b, int c){
        System.out.println("Sum is : " + (a+b+c));
    }

    public static void main(String[] args){
        new Question();
        Question.sum(2,3);
        Question.sum(1,2,3);
    }
}


//2.Private datamembers can be inherited but not accessed
//protected members can be accessed in child class
class base {
    @SuppressWarnings("unused")
    private int x = 10; //can be inherited but not accessed
    protected int z = 30; //can be accessed in child class
}

class child extends base {

    int y = 20;

    void show(){
        //System.out.println(x); private member can not be accessed
        System.out.println(y);
        System.out.println(z);
    }

    public static void main(String[] args){
        child c1 = new child();
        c1.show();
    }
}


