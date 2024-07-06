package BinarySearch;

public class minimumRotateSortedArray {
    public static void main(String[] args) {
        int[]arr={4,5,6,7,1,2,3};//right rotate
        int k=6;//target element
        int result=rotateSorted_minimum(arr,k);
        System.out.println(result);
    }
    public static int rotateSorted_minimum(int[]arr,int k){
        //minimum element find in rotated sorted array
        int n=arr.length;
        int low=0;
        int high=n-1;
        int min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                min=Math.min(min,arr[low]);
                break;
            }
            if(arr[mid]<=min){
                min=Math.min(min,arr[mid]);
            }
            if(arr[low]<=arr[mid]){
                min=Math.min(min,arr[low]);
                low=mid+1;
            }
            else{
                min=Math.min(min,arr[mid]);
                high=mid-1;
            }

        }
        return min;
    }
}
