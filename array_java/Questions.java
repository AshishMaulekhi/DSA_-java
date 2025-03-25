/*
 * Write a program to print the duplicate element of an array in java 1
 * Write a program to find the frquency of each element in array in java 2
 * Write a java program to print the elements of an array present on even position 3
 * Write a java program to print the largest element in the array 4
 * write a program to sort the element of an array in ascending order 5
 * write a prgram to find the second largest number 6
 * write a program to check string is palindrome or not 7
 * write a program o conactenate two arrys a and b 8
 */

public class Questions {


    public static boolean isPalindrome(String str){ //7
        int left = 0;
        int right = str.length() -1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    

    public static void main(String[] args){

        int[] arr = {20, 10, 20, 30, 10, 30}; //1

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }

        int[] arr2 = {1,2,3,4,5,6}; //3

        for(int i=0+1; i<arr2.length; i++){
            if(i%2 == 0){
                System.out.println("Element : " + arr2[i] +  " is at even Index " + i);
            }
        }

        int[] arr3 ={1,2,3,1,2,3,1,2,3}; //2

        int fr[] = new int[arr3.length]; //for counted elements
        int visited = -1;

        for(int i=0; i<arr3.length; i++){
            int count = 1;
            for(int j=i+1; j<arr3.length; j++){
                if(arr3[i] == arr3[j]){
                    count++;
                    fr[j] = visited;
                }

                if(fr[j] != visited){
                    fr[i] = count;
                }
            }
        }
        for(int i=0; i<fr.length; i++){
            if(fr[i] != visited){
                System.err.println(arr3[i] + " | " + fr[i]);
            }
        }

        int[] arr4 = {10,2,3,4,5,6,5}; //4

        int max = arr4[0];

        for(int i=0; i<arr4.length; i++){
            if(arr4[i] > max){
                max = arr4[i]; 
            }
        }

        System.out.println("Maximum element is : " + max);

        int[] arr5 = {5,4,3,2,1,0};
        int temp;

        for(int i=0; i<arr5.length; i++){
            for(int j=i+1; j<arr5.length; j++){
                if(arr5[i] > arr5[j]){
                    temp = arr5[i];
                    arr5[i] = arr5[j];
                    arr5[j] = temp;
                }
            }
        }

        for(int i=0; i<arr5.length; i++){
            System.out.print(arr5[i] + " ");
        }

        System.out.println();

        int[] arr6 = {1,6,5,4,3,2,1};

        int max1 = arr5[0];
        int max2 = arr5[0];


        for (int i = 0; i < arr6.length; i++) { //6
            if (arr6[i] > max1) {
                max2 = max1;
                max1 = arr6[i];
            } 
            else if (arr6[i] > max2 && arr6[i] != max1) {
                max2 = arr6[i];
            }
        }

        System.out.println("Second largest element is : "+ max2);

        String str = "madam";

        if(isPalindrome(str)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

        String[] str1 = {"r", "a", "m"};
        String[] str2 = {"s", "i", "t", "a"};

        String[] str3 = new String[str1.length + str2.length]; //8

        for(int i=0; i<str1.length; i++){ //adding str1 to str3
            str3[i] = str1[i];
        }

        int j=0;
        for(int i=str1.length; i<str3.length; i++){ //adding str2 to str3
            str3[i] = str2[j];
            j++;
        }

        for(int i=0; i<str3.length; i++){
            System.out.println(str3[i]);
        }

    }
}
