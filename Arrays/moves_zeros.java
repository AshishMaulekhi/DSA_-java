package Arrays;
import java.util.Arrays;
class moves_zeros{
    public static void main(String[] args) {
        //move zeros to the end of array
        //System.out.println(Arrays.toString(array)); is use for to print array by converting array into string
        int[]array={1,2,3,4,0,0,7,6,5,0,0,0,7,0,6,0};
        System.out.println(Arrays.toString(move_zero(array)));
        //another way

    }
    public static int[] move_zero(int[]array) {
        //use another array to store non-zero element and use anoter loop for to
        //push all 0 to end of array
        int n=array.length;
        int j=0;//indexing for temp array
        int[] temp=new int[n];
        for(int i=0;i<n;i++){// this  loop help to put all non-zero element into temp array
            if(array[i]!=0){
                temp[j++]=array[i];
            }
        }
        int last=n-1;
        for(int m=n-1;m>=0;m--){//this loop help to put all zero element to last postion of array
            if(array[m]==0){
                array[last--]=array[m];
            }
        }

        for (int k=0;k<n;k++){//put back non-zero element to array
            if(temp[k]!=0){
                array[k]=temp[k];
            }
        }
        return array;
    }
}