package BinarySearch;

public class rotatedSortedArray {
    public static void main(String[] args) {
        //array present only unique element
        int[]arr={4,5,6,7,0,1,2,3};//right rotate
        int k=0;//target element
        int result=rotateSorted_1(arr,k);
        System.out.println(result);
    }
    public static int rotateSorted_1(int []arr,int k){
        int n=arr.length;
        //array is sorted so we use binary search
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                return mid;
            }
            //now find the sorted half of array
            if(arr[low]<=arr[mid]){
                if(arr[low]<=k && k<=arr[mid]){//arr[low] <= k<= arr[mid]
                    //for to check weather the element is present or not in sorted part
                    high=mid-1;

                }
                else{
                    low=mid+1;
                }

            }
            else{
                if(arr[mid]<=k && k<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;


    }
}
