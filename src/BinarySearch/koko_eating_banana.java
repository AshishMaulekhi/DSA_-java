package BinarySearch;

public class koko_eating_banana {
    // A monkey is given ‘n’ piles of bananas, whereas the 'ith' pile has ‘a[i]’ bananas.
    // An integer ‘h’ is also given, which denotes the time (in hours) for all the bananas to be eaten.
    //Input Format:
    // N = 4, a[] = {7, 15, 6, 3}, h = 8
    //Result:
    // 5
    public static void main(String[] args) {
        int[] piles={7,15,6,3};//no of banana in each bucket
        int h=8;//hours
        //I have to find the minimum rate which koko eat all banana in "h" hours
        int result=find_eating_rate(piles,h);
        System.out.println(result);

    }
    public static int find_eating_rate(int []arr,int hours){
        //arr[] = {7, 15, 6, 3}, h = 8
        //koko can eat banana with the rate of 1 ----to---- maximum(arr)
        //so range of rate is 1 to maximum(arr)
        //optimal approach--binary search
        int low=1;
        int high=maximum(arr);
        int ans=1;
        while(low<=high){
            int mid=(low+high)/2;
            //now I have to check the time consume by  mid
            int time=time_consume(arr,mid);
            if(time==hours){
                return mid;
            }
            else if(time<hours){
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }

        }

        return ans ;
    }
    public static int time_consume(int[]arr,int mid){
        //arr[] = {7, 15, 6, 3}, h = 8
        int total_time=0;
        for(int i=0;i<arr.length;i++){
            total_time +=Math.ceil((double) arr[i]/(double) mid);
        }
        return total_time;
    }
    public static int maximum(int[]arr){
        //if the array is sorted then return the last element
        //otherwise
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }

}
