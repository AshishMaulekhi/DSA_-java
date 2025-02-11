package Arrays;
import java.util.Arrays;
class moves_zeros{
    public static void main(String[] args) {
        //move zeros to the end of array
        //System.out.println(Arrays.toString(array)); is use for to print array by converting array into string
        int[]array={1,2,3,4,0,0,7,6,5,0,0,0,7,0,6,0};
        System.out.println(Arrays.toString(move_zero(array)));
        //another way
        moveZEROs(array);

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
        for(int m=n-1;m>=0;m--){//this loop help to put all zero element to last position of array
            if(array[m]==0){
                array[last--]=array[m];
            }//no need to use this loop just assign zero to the remaining position
        }

        for (int k=0;k<n;k++){//put back non-zero element to array
            if(temp[k]!=0){
                array[k]=temp[k];
            }
        }
        return array;
    }

    public static void moveZEROs(int[]array){
        //another way to solve that problem is to move the element to previous position
        // where element is equal to 0 by swaping;
        int n=array.length;
        int i=-1;//use as index where we will found zero
        for(int j=0;j<n;j++){
            if(array[j]==0){
                i=j;//zero wale element ka index i ko assign ker do
                break;
            }
        }
        if(i==-1){
            return;//ek bhi zero nhi k array  m.
        }
        for(int k=i+1;k<n;k++){//zero milne ke bad se hi naya loop start ker do
            if(array[k]!=0){
                //non zero element ko swap ker do zero element ke sath
                int temp=array[k];
                array[k]=array[i];
                array[i]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}