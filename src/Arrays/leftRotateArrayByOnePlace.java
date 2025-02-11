package Arrays;

import java.util.Arrays;

public class leftRotateArrayByOnePlace {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int n=arr.length;
        //move the array to left side by one place
        //[1,2,3,4,5,6,7,8]-->[2,3,4,5,6,7,8,1]
        System.out.println(Arrays.toString(moveElementOnePlaceLeft(arr,n)));
    }
    public static int[] moveElementOnePlaceLeft(int[]arr,int n){
        //store the first element in temp than move the array by one place to left
        int temp=arr[0];
        for(int i=0;i<n-1;i++){//start from first element upto  second last
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;//put first element at last postion
        return arr;
    }
}
