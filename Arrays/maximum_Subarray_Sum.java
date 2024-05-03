package Arrays;

import java.util.Arrays;

public class maximum_Subarray_Sum {
    public static void main(String[] args) {
        int[]array={1,-2,-3,4,5-1,2,4,-5,-1,2,2,-1,7,-1};
        //System.out.println(MaximumSubArraySum(array));
        //another way
        //System.out.println(maxsubarraySum(array));
        //another way
        //System.out.println(maxisumSubArray(array));

       // ---------------------------------------------
        //another question we have to return the starting and ending index of subarray
        System.out.println(Arrays.toString(Maximum_SubArraySum(array)));

    }
    public static int MaximumSubArraySum(int[]arr){
        //brute force------->complexity o(n^3)
        int n=arr.length;
        int maxi_sum=0;
        for(int i=0;i<n;i++){//for i index element
            for(int j=i;j<n;j++){//for i to j index element
                int sum=0;
                for(int k=i;k<=j;k++){//for find the  sum from i to j index
                    sum+=arr[k];
                }
                maxi_sum=Math.max(sum,maxi_sum);
            }
        }

        return maxi_sum;
    }
    public static int maxsubarraySum(int[]arr){
        //1,-2,-3,4,5-1,2,4,-5,-1,2,2,-1,7
        int maxi_sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];//add  each element of sub array which start from i index
                maxi_sum=Math.max(maxi_sum,sum);
            }
        }

        return maxi_sum;
        //complexity--->0(n^2)

    }
    public static int maxisumSubArray(int[]arr){
        //1,-2,-3,4,5-1,2,4,-5,-1,2,2,-1,7
        //optimal approach
        //complexity---->0(n)
        int n=arr.length;
        int maxi_sum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum<=0){
                sum=0;
            }
            maxi_sum=Math.max(maxi_sum,sum);
        }
        return maxi_sum;
    }


    // if we have to return index then we return the starting and ending index of subarray
    public static int[] Maximum_SubArraySum(int[]arr){
        //1,-2,-3,4,5-1,2,4,-5,-1,2,2,-1,7
        int[]temp=new int[2];
        int n=arr.length;
        int sum=0;
        int starting_index=-1;
        int ending_index=-1;
        int maxi_sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(sum==0){//for to find starting index
                starting_index=i;
            }
            sum+=arr[i];
            if(sum<=0){
                sum=0;
            }

            if(maxi_sum<sum){//for to find ending index
                ending_index=i;
            }
            maxi_sum=Math.max(maxi_sum,sum);//for to find maximum subarray sum.

        }
        temp[0]=starting_index;
        temp[1]=ending_index;
        return temp;
    }
}
