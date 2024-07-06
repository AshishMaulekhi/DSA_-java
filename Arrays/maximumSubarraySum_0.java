package Arrays;

import java.util.HashMap;
import java.util.Map;

public class maximumSubarraySum_0 {
    public static void main(String[] args) {
        int[]array={1,2,3,-1-2,0,-3,-2,-1};
        System.out.println(maximunSubarraySum(array));
    }
    public static int maximunSubarraySum(int[]array){
        int n=array.length;

        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            int count=0;
            for(int j=i;j<n;j++){
                sum+=array[j];
                count++;
                if(sum==0){
                    maxi=Math.max(maxi,count);
                }
            }
        }
        return maxi;
    }
    public static int maximumSumSubarray(int[]array){
        Map<Integer,Integer> hashmap=new HashMap<>();
        int len=0;
        int n=array.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=array[i];

            if(hashmap.containsKey(sum)){
                hashmap.put(sum,i);

            }
        }
        return len;
    }
}

