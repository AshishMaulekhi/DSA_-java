package Arrays;

import java.util.Arrays;

public class linear_search {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,7,1,1};
        int[]arr_1={2,3,4,5,6,4,4,7,1,1};//use for to find target having more than one appearance
        int target=4;
        int result=linearSearch(arr,target);
        System.out.println("element present at -->" + result);
        //if we have more than one element in array which is equal to target;
        System.out.println(Arrays.toString(linearSEarch(arr_1,target)));
    }

    public static int linearSearch(int [] arr,int target){
        int n=arr.length;
        int result=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                result=i;
            }
        }
        return result;
    }
    public static int[] linearSEarch(int[]arr,int target){
        int n=arr.length;
        int count=0;
        for(int j=0;j<n;j++){//use for to count the appearance of target element
            if(arr[j]==target){
                count++;
            }
        }
        int[] temp=new int[count];
        int index=0;

        for(int i=0;i<n;i++){
            if(arr[i]==target){
                temp[index++]=i;//store the index of array where target element are present;
            }
        }
        return temp;
    }
}

