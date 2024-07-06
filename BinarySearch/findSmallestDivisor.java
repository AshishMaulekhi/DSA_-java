package BinarySearch;

public class findSmallestDivisor {
//    Input: nums = [1,2,5,9], threshold = 6
//    Output: 5
//    Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1.
//    If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2).
   public static void main(String[] args) {
        int[]nums = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums,threshold));
        System.out.println(smallest_Divisor(nums,threshold));
   }
    public static int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int maxi=maximum(nums);
        int ans=0;
        for(int i=1;i<=maxi;i++){
            int sum=sum_of_divisor(nums,i);
            if(sum<=threshold){
                ans=i;
                return ans;
            }
        }
        return -1;
    }
    public static int sum_of_divisor(int[]arr,int div){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            //use ceil function get int value like (4.5-->5 ,2.1-->3)
            sum+= Math.ceil((double)(arr[i])/(double)(div));
        }
        return sum;
    }
    public static int maximum(int[]arr){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }

    //optimal solution
    public static int smallest_Divisor(int[] nums, int threshold) {
        int n=nums.length;
        int low=1;
        int high=maximum(nums);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=sum_of_divisor(nums,mid);
            if(sum<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
