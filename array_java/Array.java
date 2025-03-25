/*
 * Array
 * Input using Scanner class
 * 2D - Array
 * 2d array sum
 */

 //Array : Data structure, fixed memory , data of similar type , contigious memory allocation
 //Syntax : Array : 
 //                 datatype[] arrayname = {declared element}; or datatype arrayname[] = {declared element}
 //                 datatype[] arrayname = new datatype[size/{declared element}];
 //         Dynamic Array : 
 //                 import java.util.ArrayList
 //                 ArrayList<datatype full name> arrayname = new ArrayList<>();

import java.util.Scanner; //Scanner is class inside util package
//takes imput in tokens
public class Array {

    public static void main(String[] args){

        //int[] arr = {10,20,30,40,50}; //user declared the array at initializing 
        int arr[] = new int[5]; //2nd type of declaration
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]); //Printing the array
        }
    }
}

//Scanner class : 
//used for taking input
class Inputarray {

    public static void main(String[] args){

        int[] arr = new int[5];
        Scanner s = new Scanner(System.in); //Created a object of scanner class

        System.out.println("Enter the array elements :");
        for(int i=0; i<5; i++){
            arr[i] = s.nextInt(); //here s works as input taker which takes integer type of input from keyborad and send it to buffer
        }

        System.out.println("Your inputted array is : ");
        for(int i=0; i<5; i++){
            System.out.print(arr[i] + " ");
        }

        s.close();

    }
}

//2D - Array : 
/*
 * matrix structure also sometime name as muti-dimensional array
 * Syntax : 1. <datatype>[][] <arrayname> = new <datatype>[size1][size2]
 *          2. <datatype[][] <arrayname> = {declartion of elements {},{}}
 */
class Twodarray {

    public static void main(String[] args){
        int[][] arr = new int[3][3]; //2d array declaration (forms a mastrix structure of 3x3)
        int[][] arr2 = new int[3][3];
        System.out.println("Enter the 1st 2d-Array elements : ");
        Scanner s = new Scanner(System.in);

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("Inputted 2d-array is : ");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j] + " ");
 
            }
            System.out.println();
        }

        System.out.println("Enter the 2nd 2d-Array elements : ");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr2[i][j] = s.nextInt();
            }
        }

        System.out.println("Inputted 2d-array is : ");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr2[i][j] + " ");
 
            }
            System.out.println();
        }

        System.out.println("Sum of both 2d array is : "); //Sum of 2d array
        int[][] sumarr = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                sumarr[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(sumarr[i][j] + " ");
 
            }
            System.out.println();
        }

        System.out.println("Tranpose of 1st matrix : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[j][i] + " ");
 
            }
            System.out.println();
        }

        int[][] mularr = new int[3][3];
        System.out.println("Multiplication of matrix : ");
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int sum = 0;  // Reset sum for each element in the result matrix
                for(int k = 0; k < 3; k++){
                    sum += arr[i][k] * arr2[k][j];  // Multiply row elements of arr with column elements of arr2
                }
                mularr[i][j] = sum;  // Assign the accumulated sum to the result matrix
            }
        }
        

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(mularr[i][j] + " ");
 
            }
            System.out.println();
        } 

        s.close();
    }
}