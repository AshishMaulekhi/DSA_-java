package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class findNothatAppearONce {
    public static void main(String[] args) {
        int []arr={1,2,2,3,4,3,4,11,44,66,9,5,5,1,7};
        System.out.println(Arrays.toString(apearOnce(arr)));
        //another way by XOR
        int []array={1,1,3,3,2,4,2,5,6,5,6};
        System.out.println(appearOnce(array));//print no. that appear only once in array
        //another way by  hash map
        //but for this methord array must contain positive no. and array value should be small.
        HashMap<Integer,Integer> hash_1=new HashMap<>();
    }
    public static int[] apearOnce(int[]arr){
        int n=arr.length;

        int[]temp=new int[n];
        int index=0;
        for(int i=0;i<n;i++){//linear search for each element in array and count the appearance
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){//if appearance is equal =1
                temp[index++]=arr[i];
            }
        }
        return temp;
    }
    public static int appearOnce(int[]arr){//second methord by xor
        int n=arr.length;
        int XOR=0;
        for(int i=0;i<n;i++){
            XOR=XOR ^ arr[i];
        }
        return XOR;
    }
}
