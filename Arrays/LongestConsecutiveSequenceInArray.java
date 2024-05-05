package Arrays;

import java.util.*;

public class LongestConsecutiveSequenceInArray {
    //brute force
    //complexity o(n^2)
    public static void main(String[] args) {
        int[]array={12,13,15,14,1,4,5,2,3,6,16};
        //System.out.println(longestCosecutiveSequenceInArray(array));

        //another way
        //System.out.println((CosecutiveNumber(array)));

        //another way --->optimal approach
        System.out.println(ConsecutiveTerm(array));
    }
    public static int longestCosecutiveSequenceInArray(int[]arr){
        //[12,13,15,14,1,4,5,2,3,6,16]
        // step-1--->select each element from array
        //step-2--->do linear search for  (element+1) in array if found return true
        int n=arr.length;
        int longest=1;
        for(int i=0;i<n;i++){
            int num=arr[i];
            int count=1;

            while (linearSearch(arr,num+1)==true){//num+1 is next consecutive element
                num++;
                count++;
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
    public static boolean linearSearch(int[]arr,int target){//linear search for each consecutive element
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }

    //another way to solve
    //step-1---> insert the element in set
    //step-2--->sort the set element
    //step-3--->than return those element who satisfy that if condition(arr[i]<arr[i+1]

    public static int CosecutiveNumber(int[]arr){
        Arrays.sort(arr);//it will sort the array
        int n=arr.length;
        int count=1;//include first no.
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int num=arr[i];
            if(num+1==arr[i+1]){//it will check if next element  is equal to num+1
                count++;
                num++;//it will increase num for next interation
            }
            else{
                count=1;//if next number is not not consecutive then it will restart the count

            }
            maxi=Math.max(maxi,count);

        }
        return maxi;
    }


    //another way
    //optimal approach

    public static int ConsecutiveTerm(int[]arr){
        int maxi=Integer.MIN_VALUE;
        int n=arr.length;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }


        for(int x:set){
            int count = 1;
            if(!set.contains(x-1)) {//for starting element
                count=1;
                int it=x;

                while (set.contains(it + 1)) {
                    count++;
                    it++;
                }
                maxi = Math.max(maxi, count);
            }
        }
        return maxi;
    }


}
