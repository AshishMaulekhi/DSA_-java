package BinarySearch;

public class lastOccurance {
    public static void main(String[] args) {
        int[]arr={3,4,13,13,13,13,13,20,20,40};
        int key=13;
        int n=7;

        System.out.println( lastnumberOccurance(arr,key,n));
    }
    public static int lastnumberOccurance(int[]arr,int key,int n){
        int ans=n;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=key){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
