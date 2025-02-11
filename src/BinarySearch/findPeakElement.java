package BinarySearch;

public class findPeakElement {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,5,1};//find the peak element
        //System.out.println(Peak_Element(arr));
        System.out.println(peakValueIndex(arr));
    }
    public static int Peak_Element(int[]arr){
        //brute force--->linear search
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
//            if(i==0){
//                if(arr[0]>arr[1]){
//                    return i;//return peak element index
//                }
//            }
//
//            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
//                return i;
//            }
//            if(i==arr.length-1){//this condition will be false for length 1
//                //index -1 out of bounds
//                if(arr[i]>arr[i-1]){
//                    return i;
//                }
//            }

            if ((i == 0 || arr[i - 1] < arr[i])
                    && (i == n - 1 || arr[i] > arr[i + 1])) {
                return i;//index
            }
        }
        return -1;//if nothing is found
    }


    //optimal approach--->binary search
    public static int peakValueIndex(int[]arr){
        int n=arr.length;
        if(n==1){
            return 0;
        }
        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[n-1]>arr[n-2]){
            return n-1;
        }
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid-1]<arr[mid]){//graph going upward direction i.e. peak element will be on right side
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
