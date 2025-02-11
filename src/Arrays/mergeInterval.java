package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeInterval {
    public static void main(String[] args) {
        int[][]array={{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        //List<List<Integer>>result=mergeInterval(array);
        List<List<Integer>>result=mergeIntervalOfsortedArray(array);
        System.out.print("[");
        int n=result.size();
        for(List<Integer> it:result){
            System.out.print("[" + it.get(0) + "," + it.get(1) + "]");
        }
        System.out.print("]");


    }
    public static List<List<Integer>> mergeInterval(int[][]arr){
        //step-1 first sort the array  complexity-->O(nlog(n))
        //brute force
        //complexity----> O(2n) + nlog(n)
        List<List<Integer>> ans=new ArrayList<>();
        //{1, 3}, {8, 10}, {2, 6}, {15, 18}
        //Step-1 first sort the array
        //take a first interval and merge with that Interval which starting element is less than the ending element of present element
        int n=arr.length;
        for(int i=0;i<n;i++){//iterate through Interval
            int start=arr[i][0];
            int end=arr[i][1];
            if(!ans.isEmpty() && ans.get(ans.size()-1).get(1)>=start){//ager ans wali list empty no ho and last interval
                //ka end element bada ho first element of current interval
                continue;

            }
            for(int j=i+1;j<n;j++){
                if(arr[j][0]<=end){//ager current interval ka starting element is small than  ans wale list ke end element se.
                    end=Math.max(end,arr[j][1]);
                }
                else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));

        }
        return ans;

    }

    //brute force
    //complexity----->O(n)
    public static List<List<Integer>> mergeIntervalOfsortedArray(int[][]arr){
        List<List<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int start=arr[i][0];
            int end=arr[i][1];
            //ager ans list empty h ya fir ans list ke last interval ka last element smaller h current Interval ke starting element ;

                // if the current interval does not
                // lie in the last interval:
            if(ans.isEmpty() || ans.get(ans.size()-1).get(1)<start ){
                ans.add(Arrays.asList(start,end));
            }
            // if the current interval
            // lies in the last interval:
            else{
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr[i][1]));

            }
        }
        return ans;
    }
}
