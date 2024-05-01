package Arrays;

import java.util.HashMap;
import java.util.Map;

public class occur_more_than_nby2 {
    public static void main(String[] args) {
        //find the number in the array which is occurance more than n/2;
        //[1,2,3,2,2,1,2,5,2,7,5,2,2]----->here (2) come more than n/2;
        int[]array={1,2,3,2,2,1,2,5,2,2,7,5,2,2};
       // System.out.println(findNumber(array));
        //another way
        //optimal solution--->moore's voting algo
        System.out.println(findnum_(array));

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

    public static int findnum_(int[]arr){
        int n=arr.length;
       // [1,2,3,2,2,1,2,5,2,2,7,5,2,2]
        int element=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0) {//for starting element of each sub array
                count = 1;//for first element of each sub array
                element = arr[i];//maan lo starting element hi result h
            }
            else if(arr[i]==element){//ager agla element hi same h to count ki value increase ker denge
                count++;
            }
            else{//ager value same nhi h to ek subtract ker denge
                count--;
            }
        }
        int count_1=0;//ise count kerenge ki result wala element array m kitne bar aa rha h
        for(int j=0;j<n;j++) {
            if(element==arr[j]){//yha pe element ki value wo hogi jiski previous loop me count ki value zero nhi hui h
                count_1++;
            }
        }
        if(count_1>n/2){
            return element;
        }


        return -1;//in  case we can't find any result
    }
}
