package Arrays;

import java.util.Arrays;

public class leftRotateArrayby_K_place {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int k=4;//move array to left by k place
        //[1,2,3,4,5,6,7,8,9,10,11]-->[5,6,7,8,9,10,11,1,2,3,4]
        System.out.println(Arrays.toString(moveBy_k_place(arr,k)));
        //another way by reversal algorithm.
        // let k=2 (move first k  element at end of array)
        //[1,2,3,4,5,6,7]-->a1=[2,1]-->a2=[7,6,5,4,3]-->reverse(a1+a2)-->[3,4,5,6,7,1,2]
        //reverse the first k element and then reverse the n-k element
        //than reverse the whole array
        moveby_k_PLACE(arr,k);
    }
    public static int[] moveBy_k_place(int[]arr,int k){//move array to left by k place
        int n=arr.length;
        int[]temp=new int[k];
        for(int i=0;i<k;i++){//move first k element to temp array
            temp[i]=arr[i];
        }
        int index=0;
        for(int j=k;j<n;j++){//move n-k element to starting of the array
            arr[index++]=arr[j];

        }
        int index_1=0;
        for(int r=k;r<n;r++){//replace first k element to end of the array
            arr[r]=temp[index_1++];
            ;
        }
        return arr;
    }


    //SECOND METHORD REVERSE TECHNIQUE

    public static void moveby_k_PLACE(int[]arr,int k){//by reverse technique
        int n=arr.length;
        reverse(arr,0,k-1);//reverse first k element
        reverse(arr,k,n-1);//reverse n-k element
        reverse(arr,0,n-1);//reverse all element
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[]arr,int start, int end){//it will reverse the array
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
