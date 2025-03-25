public class LaunchCalc {
    
    public static void main(String[] args){
        Calc c = new Calc();

        int result = c.divide(10, 5); //Testing the unit code , we will check if it matching the expected result
        System.out.println(result);
        if(result == 2){ //checking the expected output
            System.out.println("test is passed");
        }
        else{
            System.out.println("test is failed");
        }

        int result2 = c.divide(10, 0); //Testing the unit code , we will check if it matching the expected result
        System.out.println(result);
        if(result2 == 2){ //checking the expected output
            System.out.println("test is passed");
        }
        else{
            System.out.println("test is failed");
        }
    }
}
