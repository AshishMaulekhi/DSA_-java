/*
 * TOPICS
 * multiple main methods (using different signatures)
 * class without main
 * factorial, fibonacci, even and odd, prime, armstrong functions
 */

import java.util.Scanner;

class abc {
    public static void main(String args[]) { // multiple main method in the same class
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        main(10, 20);
        main(90, 100);
        main(4.5);
    }

    public static void main(int a, int b) { // different signature or datatype of command line argument
        int c;
        c = a + b;
        System.out.println("The first number is: " + a);
        System.out.println("The second number is: " + b);
        System.out.println("Sum: " + c);
        main(c);
    }

    public static void main(int a) {
        System.out.println("The value of sum is: " + a);
        double f;
        f = a + 1.01;
        main(f);
    }

    public static void main(double b) {
        System.out.println(b);
    }
}

class abc2 {
    // class without a main method
}

class abc1 {

    public int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public void findEvenorOdd(int n){
        if(n == 0){
            System.out.println("Zero is even");
        }
        if(n%2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }

    public static void findprime(int n){
        if(n == 0){
            System.out.println("Zero is neither prime nor composite");
        }
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }

    public static void findarmstrong(int n){
        int temp, rem, sum = 0;
        if(n <= 0){
            System.out.println("Number is not armstrong !");
        }
        else{
            temp = n;
            while(n >= 0){
                rem = n%10;
                sum = sum + (rem * rem * rem);
                n = n/10;
            }
            if(temp == sum){
                System.out.println("Number is Armstrong !");
            }
            else{
                System.out.println("Number is not Armstrong !");
            }
        }
    }

    public static void main(String args[]) {
        abc1 obj = new abc1();

        byte b = 100;
        int i = b; // widening type casting (from small to large)
        System.out.println("Widening Casting: " + i);

        float a = 100;
        int j = (char) a; // change the datatype of float to char and then to int
        System.out.println("Narrowing Casting: " + j);

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in); // factorial of a number

        System.out.println("Enter the number to find its factorial: ");
        int k = scan.nextInt();
        long iterativeFactorial = 1; // through iterative method
        for (i = 1; i <= k; i++) {
            iterativeFactorial *= i;
        }
        System.out.println("The factorial of " + k + " using iteration is: " + iterativeFactorial);

        long recursiveFactorial = obj.fact(k); //through recusive method
        System.out.println("The factorial of " + k + " using recursion is: " + recursiveFactorial);

        System.out.println("Enter the number of terms for Fibonacci series: "); //for fibonacci series
        int p = scan.nextInt();
        int n1 = 0, n2 = 1, n3;
        System.out.print("Fibonacci series: " + n1 + ", " + n2);
        for (i = 2; i < p; i++) {
            n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
        }

        System.out.println("");
        System.out.println("Enter the number to check wheather the given is Even or Odd : ");
        int ceo = scan.nextInt();
        obj.findEvenorOdd(ceo);

        System.out.println("Enter the number to check its prime or composite : ");
        int cp = scan.nextInt();
        findprime(cp); 

        System.out.println("Enter the number to  check it is armstrong or not : ");
        int an = scan.nextInt();
        findarmstrong(an);

        scan.close();
        System.out.println();
    }
}
