package BinarySearch;

public class upperBound {
    public static void main(String[] args) {
        int[]array={3,5,8,9,9,15,19};
        int target=9;
        //System.out.println(upperBoundOfArray(array,target));
        System.out.println(upperbounds(array,target));
    }

    public static int upperBoundOfArray(int[]arr,int target){
        int n=arr.length;
        //upper bound----> will be the index of that element (  arr[i]>target  )
        //3,5,8,9,9,15,19
        //if my target element is 19 than i return n because there is no other element
        //which is greater than 19 so we return length of array which is n;
        for(int i=0;i<n;i++){
            if(arr[i]>target){
                return i;
            }
        }
        return n;
    }
    public static int upperbounds(int[]arr,int target){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=arr[mid];
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
