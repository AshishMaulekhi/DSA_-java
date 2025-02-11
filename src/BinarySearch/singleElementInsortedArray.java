package BinarySearch;

public class singleElementInsortedArray {
    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,4,4,5,5,6,6};//find single element in sorted array
        int result=singleElement(arr);
        System.out.println(result);
    }
    public static int singleElement(int[]arr){
        int n= arr.length;
        //(even,odd)--->(check for left side)

        //if anyone condition from below is match then we are on left side of single element.
        //if the current element index is  odd then the previous element (index-even) value same as current element/
        //if the current element index is even then the next element (index-odd) value same as current element.


        //(odd,even)--->(check for right side)

        //if anyone condition from below is match then we are on right side of single element.
        //if the current element index is  odd then the next element (index-even) value same as current element/
        //if the current element index is even then the previous element (index-odd) value same as current element.
        //int[]arr={1,1,2,2,3,3,4,5,5,6,6}
        if(n==1){//if there is only one element in array
            return arr[0];
        }
        if(arr[0]!=arr[1]){// check for the first element
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]){//check for the last element
            return arr[n-1];
        }
        //we had written these condition before loop for clean and readable code.

        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                //check for mid element
                return arr[mid];
            }
            //check for left side
            if((mid%2==1 && arr[mid-1]==arr[mid])||(mid%2==0 && arr[mid]==arr[mid+1])){
                low=mid+1;

            }
            else{
                high=mid-1;
            }

        }
        return -1;
    }
}
