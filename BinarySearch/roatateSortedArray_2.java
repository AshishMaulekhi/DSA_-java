package BinarySearch;

public class roatateSortedArray_2 {
    public static void main(String[] args) {
        //array may contain duplicate value;
        int[]arr={3,1,2,3,3,3,3};//right rotate
        int k=1;//target element
        //result will be in boolean form  because target element is at vary indexes
        boolean result=rotateSorted_2(arr,k);
        System.out.println(result);
    }
    public static boolean rotateSorted_2(int[]arr,int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                //this condition is satisfy only when all three element are same
                //and for to overcome this problem we increment low and decrement high
                //so we can find sorted half  part
                low=low+1;
                high=high-1;
            }
            if(arr[mid]==k){
                return true;
            }
            //ager mid m nhi h to left m dek
            if(arr[low]<=arr[mid]){//for to check the array is sorted or not (left part)
                if(arr[low]<=k && k<=arr[mid]){//check  target element range m h ya nhi
                    high=mid-1;//right half ko remove ker do
                }
                else{//(right part)
                    low=mid+1;// left part ko remove ker do
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


        return false;
    }
}
