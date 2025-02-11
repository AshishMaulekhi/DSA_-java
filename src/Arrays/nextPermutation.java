package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class nextPermutation {
    public static void main(String[] args) {
        int[]array={2,1,5,4,3,0,0};
        System.out.println(Arrays.toString(NextPermutation(array)));
    }
    public static int[] NextPermutation(int[]arr){
        //2,1,5,4,3,0,0
        //step-1  find the breaking point
        //for find breaking point we start the loop from backside second last element.
        //and check if arr[i]<arr[i+1]
        //2...1,5,4,3,0,0  breaking point between 2 and 1

        //store index i in another variable index_1.

        //step-2 swap number . use  for loop to find slightly greatest element.
        // swap the breaking point element with greatest (slightly greatest)element  from the backside fo array
        //swap(arr[index_1],arr[j]
        //step-3 reverse or sort the suffix array after breaking point
        //reverse the suffix array.

        int index=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }

        if(index==-1){
            return reverse(arr,0,n-1);
            //in case we can't findout any breaking point than we return first arrangment of array
            //[5,4,3,2,1]--->in that case we are not able to find the breaking point so we simply return the first
            //arrangement of permutation . which is we get by reverse the array.

        }
        for(int j=n-1;j>=index;j--){//move from last to breaking point
            if(arr[j]>arr[index]){//swap ker do breaking point and slightly greatest element ko
                int temp=arr[index];
                arr[index]=arr[j];
                arr[j]=temp;
                break;
            }
        }
        //reverse ker de breaking point ke bad wale element ko ya fir sort ker de
        reverse(arr,index-1,n-1);

        return arr;
    }
    public static int[] reverse(int[]arr,int starting_index,int ending_index){
        // [5 4 1 0 0]
        int n=arr.length;

        for(int i=starting_index;i<=ending_index;i++){
            if(i < ending_index) {
                int temp = arr[i];
                arr[i] = arr[ending_index];
                arr[ending_index] = temp;
                ending_index--;
            }
        }
        return arr;
    }


}
