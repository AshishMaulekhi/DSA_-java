package Arrays;

import java.util.Arrays;

public class Alternative_p_n_num {
    public static void main(String[] args) {
        int []array={1,2,3,4,5,-1,-8,-2,-3,-4};
        System.out.println(Arrays.toString(Aternative_pos_neg_number(array)));
    }
    public static int[] Aternative_pos_neg_number(int[]arr){
        //find alternative positive and negative number in array
       // [1,-1,2,-4,7,-4,7,-3]
        int n=arr.length;
        int[]temp=new int[n/2];
        int[]temp2=new int[n/2];
        int index1=0;
        int index2=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){//place positive no into temp1
                temp[index1++]=arr[i];
            }
            else {//place negative no into temp2
                temp2[index2++]=arr[i];
            }
        }
        for(int j=0;j<n/2;j++){
            arr[2*j]=temp[j];
            arr[(2*j)+1]=temp2[j];
        }
        return arr;
        //complexity is o(n) + o(n/2)
    }
}
