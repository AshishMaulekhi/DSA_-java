package BinarySearch;

public class kokoEatingBanana {
    public static void main(String[] args) {
        int[] piles = {7, 15, 6, 3};
        int target = 8;// I have to eat all banana at maximum 8 hours
        //System.out.println(eatingBananaPerHours(piles, target));
        System.out.println(findValueOf_k(piles, target));
    }

    public static int max(int[] arr) {
        //if array is sorted than maximum element at last position
        //but if not then we will find
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }

    public static int eatingBananaPerHours(int[] arr, int target) {
        //int[]piles={7, 15, 6, 3};

        //brute force
        for (int i = 1; i <= max(arr); i++) {
            //for each value of i. I will find the value of k(banana per hours).
            //i=1--->1 banana per hours
            //i=2--->2 banana per hours
            int total_hour = 0;
            for (int j = 0; j < arr.length; j++) {//iterate the array and find the value of k for each pile
                total_hour += Math.ceil((double) (arr[j]) / (double) (i));
            }
            if (total_hour <= target) {
                return i;
            }


        }
        return max(arr);
    }

    //    Example 1:
//    Input Format:
//    N = 4, a[] = {7, 15, 6, 3}, h = 8
//    Result:
//            5
//    Explanation:
//    If Koko eats 5 bananas/hr, he will take 2, 3, 2, and 1 hour to eat the piles accordingly. So, he will take 8 hours to complete all the piles.
//
//    Example 2:
//    Input Format:
//    N = 5, a[] = {25, 12, 8, 14, 19}, h = 5
//    Result:
//            25
//    Explanation:
//    If Koko eats 25 bananas/hr, he will take 1, 1, 1, 1, and 1 hour to eat the piles accordingly. So, he will take 5 hours to complete all the piles.
//
//
//    Before moving on to the solution, let’s understand how Koko will eat the bananas. Assume, the given array is {3, 6, 7, 11} and the given time i.e. h is 8.
//
//    First of all, Koko cannot eat bananas from different piles. He should complete the pile he has chosen and then he can go for another pile.
//    Now, Koko decides to eat 2 bananas/hour. So, in order to complete the first he will take
//    3 / 2 = 2 hours. Though mathematically, he should take 1.5 hrs but it is clearly stated in the question that after completing a pile Koko will not consume more bananas in that hour. So, for the first pile, Koko will eat 2 bananas in the first hour and then he will consume 1 banana in another hour.
//    From here we can conclude that we have to take ceil of (3/2). Similarly, we will calculate the times for other piles.
//
//1st pile: ceil(3/2) = 2 hrs
//2nd pile: ceil(6/2) = 3 hrs
//3rd pile: ceil(7/2) = 4 hrs
//4th pile: ceil(11/2) = 6 hrs
//    Koko will take 15 hrs in total to consume all the bananas from all the piles.
//
//    Observation: Upon observation, it becomes evident that the maximum number of bananas (represented by 'k') that Koko can consume in an hour is obtained from the pile that contains the largest quantity of bananas. Therefore, the maximum value of 'k' corresponds to the maximum element present in the given array.
//
//    So, our answer i.e. the minimum value of ‘k’ lies between 1 and the maximum element in the array i.e. max(a[]).
//
    public static int totalCalculateTime(int[]arr,int k){
        int total_time=0;
        for(int i=0;i<arr.length;i++){
            total_time+=Math.ceil( (double)(arr[i]) / (double)(k));
        }
        return total_time;
    }
    public static int findValueOf_k(int[] arr, int target) {
//optimal approach
//whenever we have given a range of answer then we always use binary search
//N = 4, arr[] = {7, 15, 6, 3}, target(h) = 8
//i have to find the value of k
//so the range of k  for 1 banana per hours --->to --->max(arr) banana per hours
        int low=1;
        int high=max(arr);
        int ans=15;// max(arr)
        while(low<=high){
            int mid=(low+high)/2;
            int total_time=totalCalculateTime(arr,mid);
            if(total_time==target){
                return mid;
            }
            else if(total_time<target) {
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
