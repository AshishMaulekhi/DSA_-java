package src.Arrays;

import java.util.Arrays;

public class Twosum {
    public static int findSqrRoot(int num) {
        int start = 0;
        int last = num;
        int result = -1;

        while (start <= last) {
            int mid = start + (last - start) / 2;

            if (mid * mid == num) {
                return mid;
            } else if (mid * mid > num) {
                last = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }

        return result;
    }
    public  static int[] findTwoSum(int[]arr,int target){

        int start=0;
        int end=arr.length-1;
        int sum=0;
        int []r_arr=new int[2];
        while (start<end){
            sum=arr[start]+arr[end];
            if(sum==target){
                r_arr[0]=arr[start];
                r_arr[1]=arr[end];
            }
            else if(sum<target){
                start++;
            }
            else {
                end--;
            }
        }
        return r_arr;
    }
    public static void reversOfArray(int []arr){
        int len=arr.length;
        int []reverseArr = new int[len];
        int start=0;
        for(int i=len-1;i>=0;i--){
            reverseArr[i]=arr[start];
            start++;
        }
        for(int i=0;i<len;i++){
            System.out.println(reverseArr[i]);
        }

    }
    public static void arithmaticAp(int []arr){
        //find missing number
        //first find the sum of all element
        //find the sum of AP
        // totalSum -sum
        int n=arr.length;
        int sum=0;
        int A_Psum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int totalTerms=n+1;
        int d=(arr[0]+arr[n])/totalTerms;
        A_Psum=n*(arr[0] + arr[n-1])/2;
        int expectedSum = totalTerms * (2 * arr[0] + (totalTerms - 1) * d) / 2;
        int res=A_Psum-sum;
        System.out.println("missing no:" + res);
    }

    public static void main(String[] args) {
        int num = 25;
        int []arr={
                2,3,4,5,6,7
        };
        int target=5;
        int res = findSqrRoot(num);
        int[]result=findTwoSum(arr,target);
        reversOfArray(arr);
        arithmaticAp(arr);
        System.out.println("Square root (floor): " + res);
    }
}
