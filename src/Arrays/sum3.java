package Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class sum3 {
    public static void main (String[] args) {
        int[]array={-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> Result=sumOfThree(array);
        for (ArrayList<Integer> it : Result) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
        }
    public static ArrayList<ArrayList<Integer>> sumOfThree(int []arr){
        int n=arr.length;
        Set<ArrayList<Integer>> setOfarray= new HashSet<>();
        //Step-1 run three for loop for check three element
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        ArrayList<Integer>temp= new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.sort(null);
                        setOfarray.add( temp);
                    }
                }
            }
        }
        ArrayList<ArrayList<Integer>> result=new ArrayList<>(setOfarray);
        return result;
    }


}







