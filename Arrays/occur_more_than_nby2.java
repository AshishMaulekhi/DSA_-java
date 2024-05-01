package Arrays;

import java.util.HashMap;
import java.util.Map;

public class occur_more_than_nby2 {
    public static void main(String[] args) {
        //find the number in the array which is occurance more than n/2;
        //[1,2,3,2,2,1,2,5,2,7,5,2,2]----->here (2) come more than n/2;
        int[]array={1,2,3,2,2,1,2,5,2,2,7,5,2,2};
        System.out.println(findNumber(array));
    }
    public static int findNumber(int[]arr){

        int n=arr.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<n;i++){
            int value = hashMap.getOrDefault(arr[i], 0);
            hashMap.put(arr[i], value + 1);
        }
        for(Map.Entry<Integer,Integer>entry:hashMap.entrySet()) {
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
