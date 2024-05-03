package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;


public class findNothatAppearONce {
    public static void main(String[] args) {
        int []arr={1,2,2,3,4,3,4,11,44,66,9,5,5,1,7};
       // System.out.println(Arrays.toString(apearOnce(arr)));
        //another way by XOR
        int []array={1,1,3,3,2,4,2,5,6,5,6};
        //System.out.println(appearOnce(array));//print no. that appear only once in array
        //another way by  hash map
        //but for this methord array must contain positive no. and array value should be small.
        //HashMap<Integer,Integer> hash_1=new HashMap<>();
        //better_approach
        int result=appear_Once(array);
        System.out.println(result);
    }
    public static int[] apearOnce(int[]arr){
        //brute force
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
        //optimal approach
        int n=arr.length;
        int XOR=0;
        for(int i=0;i<n;i++){
            XOR=XOR ^ arr[i];
        }
        return XOR;
    }
    public static int appear_Once(int[]arr){
        //better approach--1
        //here i use hash array to put each element from array(arr)  as  a index to
        //hash array then check which hash element value is equal to 1.
        int n=arr.length;
        int maxi=arr[0];
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);//find maximum element from array which is use for the size of hash array
        }
        int []hash_array=new int[maxi+1];//size will be maxi+1 because it start from 0.
        for(int j=0;j<n;j++){
            hash_array[arr[j]]++;//put each element of array (arr) into hash array as a index.
        }
        for(int k=0;k<n;k++){
            if(hash_array[arr[k]]==1){//check if any element frequency is one or not in hash array.
                return arr[k];
            }
        }
        return -1;//in case we can't find any unique element.
    }
    public static int aPPear_once(int []arr){
        //better approach--2
        //using hash map
        //hashmap(key,value) pair
        //using each element of array(arr) as key and its value would be the frequency of that element.
        HashMap<Integer,Integer>hash_map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
           // hash_map[arr[i]]++;

        }
        return 0;// ese  hi lagaya h hata dena bad m solve kerte time
    }
}
