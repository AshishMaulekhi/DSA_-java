package BinarySearch;



public class aggresiveCow {
    public static void main(String[] args) {
        //int[]arr= {0,3,4,7,10,9};//stalls
        //step-1 sort the array order so we can find the Minimum distance bw the consecutive cow
        int[]arr= {0,3,4,7,9,10};
        int n = 6;
        int k = 4;//no of cows
        //find the minimum distance bw cow so it should be maximum
        int result=minimumDistance(arr,k,n);
        System.out.println(result);

    }
    public static int minimumDistance(int[]arr,int k,int n){
       int lastCow=arr[0];
       int countCow=1;
       for(int i=1;i<arr[n-1];i++){
           
       }

        return -1;
    }
}
