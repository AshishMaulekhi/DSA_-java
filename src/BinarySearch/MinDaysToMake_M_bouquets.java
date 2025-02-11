package BinarySearch;

import org.w3c.dom.ls.LSOutput;

public class MinDaysToMake_M_bouquets {
    // You are given 'N’ roses and you are also given an array 'arr'
    // where 'arr[i]'  denotes that the 'ith' rose will bloom on the 'arr[i]th' day.
    //You can only pick already bloomed roses that are adjacent to make a bouquet.
    // You are also told that you require exactly 'k' adjacent bloomed roses to make a single bouquet.
    //Find the minimum number of days required to make at least ‘m' bouquets
    // each containing 'k' roses. Return -1 if it is not possible.
    //Input Format:
    // N = 8, arr[] = {7, 7, 7, 7, 13, 11, 12, 7}, m = 2(no of bouquet), k = 3(no of flower in each bouquet)
    //Result:
    // 12
    public static void main(String []args){
        int[]arr={7, 7, 7, 7, 13, 11, 12,7,7,7, 7};
        int m=2;//no of bouquet
        int k=3;//no of flower in each bouquet
        //I have to find the minimum day required to make m bouquet having k flower in each bouquet;
        //and we can only choose adjacent flower to make bouquet;
        int result=findMinimumDays(arr,m,k);
        System.out.println(result);
    }
    public static int possibleOrNot(int[]arr,int day,int m,int k){
        //now check for day.In array how many flower are bloomed or not
        //and count them
        int count=0;
        int noOfB=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else {
                noOfB += count/k;
                count=0;
            }
        }
        //ager last ke three flower bloomed ho
        noOfB +=count/k;
        return noOfB;
    }
    public static int findMinimumDays(int[]arr,int m,int k){
        //arr={7, 7, 7, 7, 13, 11, 12, 7};
        //range of days from minimum  to maximum element of array
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            mini=Math.min(mini,arr[i]);
            maxi=Math.max(maxi,arr[i]);
        }
        int low=mini;
        int high=maxi;
        int ans=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            //now I will check for mid(day). can I make m bouquet or not;
            int result=possibleOrNot(arr,mid,m,k);
            if(result==m){
                return mid;
            }
            else if(result<m){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return ans;
    }
}
