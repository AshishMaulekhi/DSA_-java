package BinarySearch;

public class lowerIndex {
    public static void main(String[] args) {
        int[]array={3,5,8,15,19};
        int target=9;
        System.out.println(LowerBoundIndex(array,target));
    }
    public static int LowerBoundIndex(int[]arr,int target){
        //return lower bound in sorted array
        //lower bound---->the minimum index in which arr[i]>=target
        //if there  is no such element than we return n (which is length of array i.e. imaginary number
        //because index n not present in array
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>=target){
                return i;
            }
        }
        return n;


    }
}
