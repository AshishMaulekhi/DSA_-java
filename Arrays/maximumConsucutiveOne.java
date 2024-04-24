package Arrays;

public class maximumConsucutiveOne {
    public static void main(String[] args) {
        int[] array={1,0,1,0,0,0,1,1,0,1,1,1,0,1,0,1,0,1,1,1,1,1};
        int n =array.length;
        int result=maximumOne(array,n);
        System.out.println( "result is :" + result);
    }
    public static int maximumOne(int [] arr,int n){
        //we have to return count value for  to "1" repeat itself consecutively in array
       int count=0;
       int maxi_count=0;
       for(int i=0;i<n;i++){
           if(arr[i]>0){
               count++;
               if(count>maxi_count){
                   maxi_count=count;
               }
           }
           else{
               count=0;
           }
       }
       return  maxi_count;
    }
}
