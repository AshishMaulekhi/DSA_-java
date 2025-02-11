package Arrays;

public class findMissingNumber {
    public static void main(String[] args) {
        int[]arr={1,2,3,5};
        int n=5;// total no of element  but here are 4 so we have to find missing no.
        System.out.print(missingNO(arr,n));
    }
    public static int missingNO(int[]arr,int n){//here n=5

        int array_sum=0;
        int total_sum=0;
        int missing_no=0;
        for(int i=0;i<arr.length;i++){
            array_sum +=arr[i];//sum of all array element
        }
        total_sum=n*(n+1)/2;
        missing_no=total_sum-array_sum;
        return missing_no;
    }
}
