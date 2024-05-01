package Arrays;

public class largestSumofContiguousArray {
    public static void main(String[] args) {
        int[]array={1,2,3,4,-3,-5,4,-4};
       // System.out.println(largestSubarraySum(array));
        System.out.println(maxiSubarray(array));
    }
    public static int largestSubarraySum(int[]arr){
        //brute force
        //complexity o(n^3)
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){//sub array
                int sum=0;
                for(int k=i;k<=j;k++){//add all the element of subarray.
                    sum=sum+arr[k];
                }
                maxi=Math.max(sum,maxi);


            }
        }
        return maxi;
    }
    public static int maxiSubarray(int[]array){//maximum sub array
        //better approach
        //complexity 0(n^2)
        int n=array.length;
        int maxi= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){//it will sum current element with previous array
                sum+=array[j];
                maxi=Math.max(maxi,sum);//it will give the maximum sum of sub array
            }

        }
        return maxi;

    }

}
