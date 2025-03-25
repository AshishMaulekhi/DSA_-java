//Error catching by JRE
/*
 * try {
 *  Use to catch the exception
 * }
 * catch ()
 * Finally block
 * Throws keyword
 * Throw
 * Custom Exception
 */
//import java.io.PrintWriter;
import java.util.Scanner;;
public class Test{

    public static void main(String[] args){
        @SuppressWarnings("unused")
        int x = 10/0; //Internal handling of error by JRE

    }
}

/*
 * There can be 1 try with multiple catch blocks
 * but will only catch one because of top to bottom approach as after first condition on try, program abnormally
 * terminates and go to catch block
 */

class Test2 {

    public static void main(String[] args) {// throws Exception {
        int x = 10;
        @SuppressWarnings("unused")
        int y;

        try {

            y = x/0; //after this it directly goes to the catch block as it should be corrected first

            int[] z = new int[5];
            z[10] = 100;

        }
        catch(ArithmeticException e){
            System.out.println(e); //Throws the exception
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }
    }
}

//Example of null pointer exception
class Test3 {

    @SuppressWarnings("null")
    public static void main(String[] args){
    
        try {
            String s = null;
            System.out.println(s.length());
        }
        catch(NullPointerException n){
            System.out.println(n);
        }
    }
}

//Checked Exception
class Test4 {

    public static void main(String[] args){
        // PrintWriter pw = new PrintWriter("abc.text"); compiler it self caugth the exception
    }
}

//Catching multiple exception at one time using nested try catch operation
class Test5 {

    @SuppressWarnings("null")
    public static void main(String[] args){
        try{
            //1st exception
            try{
                @SuppressWarnings("unused")
                int x = 10/0;
            }
            catch(ArithmeticException a){
                System.out.println(a);
            }
            //2nd excetion
            try {
                String s = null;
                System.out.println(s.length());
            }
            catch(NullPointerException n){
                System.out.println(n);
            }
            //3rd exception
            int[] y = new int[5];
            y[10] = 100;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}

//Parent exception
class Test6 {
    
    public static void main(String[] args){
        try{
            @SuppressWarnings("unused")
            int x = 10/0;
        }
        catch(Exception e){ //catching exception using parent exception
            System.out.println(e);
        }
    }
}

//Finally : This block is used after try and catch, this block always run if the exception caught or not
//Used to close connection from outside the program like database etc.
//most asked question final vs finally
/*
 * syntax: 
 * try{}
 * catch(Exception e){}
 * finally{}
 */
class Test7 {

    public static void main(String[] args){
        try{
            @SuppressWarnings("unused")
            int y = 10/0;
            //int y = 10/2;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("hello nigga"); //We can also catch exception inside finally block also
        }
    }
}

//Throws Keyword : Helps to catch exception automatically, but will catch only one at a time
//Worksimplicitly
/*
 * Syntax: 
 * functionname() throws Exceptiontype classname ...., (there can be multiple)
 */
class Test8 {
    void   calc() throws ArithmeticException{ //handled itself
        @SuppressWarnings("unused")
        int y = 10/0;
    }
    public static void main(String[] args){
        Test8 t = new Test8();
        t.calc();
    }
}

//Throw keyword : Used to explicitly throw the exception, it can throw both checked and unchecked exception
//Throw can be used with throws and try both, mostly used to develop custom exception
/*
 * syntax : 
 * try {
 * statements...
 * throw new Exceptiontype();
 * }
 * catch(Exceptiontype <e>)
 */
class Test9 {
    @SuppressWarnings("null")
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
            throw new NullPointerException();
        }
        catch(NullPointerException n){
            System.out.println(n);
        }
    }
}

//Custom Exception : 
/*
 * Rules  : 1. Must extent Exception class
 *          2. There should be a constructor(parameterized) in class
 */

 class AgeEx extends Exception{ //extends Exception
    
    AgeEx(String str){ //Constructor
        super(str);
    }
 }

 class CustomEx {
    
    static void validate(int age) throws AgeEx{ //static because object will create by its own
        if(age < 18){
            throw new AgeEx("Age is not valid to vote");
        }
        else{
            System.out.println("Age is valid for vote");
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age = s.nextInt();
        try{
            validate(age);
        }
        catch(AgeEx a){
            System.out.println("Caught the Exception : " + a);
        }
        finally{
            s.close();
        }

    }
 }

//Custom Arithematic Exception
class ArithmeticError extends Exception {

    ArithmeticError(String str){
        super(str);
    }
}

class Math {
    static void divideByZero(int a, int b) throws ArithmeticError{
        if(b == 0){
            throw new ArithmeticError("Divide by zero is not allowed");
        }
        else{
            System.out.println("The Division is : " + a/b);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = s.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = s.nextInt();
        try{
            divideByZero(a, b);
        }
        catch(ArithmeticError e){
            System.out.println(e);
        }
        finally{
            s.close();
        }
    }
}