package Arrays;

import java.util.Arrays;

public class LeaderInArray {
    public static void main(String[] args) {
        int[]array={1,6,4,5,2,3,0};
        //leader of the array mean those element which are greater than all the right side element
        System.out.println(Arrays.toString(leaderOfArray(array)));
    }
    public static int[] leaderOfArray(int[]arr){
        int n=arr.length;
        int count=0;
        int max_1=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){//for find the length of temp array
            if(arr[i]>max_1) {
                max_1 =Math.max(max_1,arr[i]);
                count++;
            }
        }
        int[]temp=new int[count];
        int index=0;
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){//for insert the leader element into temp array
            if(arr[i]>max) {
                max =Math.max(max,arr[i]);
                temp[index++]=max;
            }
        }

        return temp;
    }
}
