package BinarySearch;

public class find_k_rotation {
    public static void main(String[] args) {
        int[]arr={5,6,7,1,2,3};//right rotate

        int result=rotateOf_SortedArray_k(arr);
        System.out.println(result);
    }
    public static int rotateOf_SortedArray_k(int[]arr){//kitne bar sorted array ko rotate kera h
        int n=arr.length;

        //solution--> find minimum element and return its index
        int low=0;
        int high=n-1;
        int min=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){//if complete array is sorted then smallest element will be at low.
                min=arr[low];
                index=low;
                break;
            }
            if(arr[mid]<=min){//check for the mid element

                index=mid;

            }
            if(arr[low]<=arr[mid]){//check for half sorted part(left part)
                if(arr[low]<=min){
                    min=arr[low];//minimum element always at first position in sorted array
                    index=low;//store  the minimum element index
                    low=mid+1;//remove the remaining  sorted array part after getting minimum element
                }
            }
            else{//another half sorted part (right part)
                if(arr[mid]<=min){
                    min=arr[mid];
                    index=mid;
                    high=mid-1;
                }
            }

        }
        return index;
    }
}
