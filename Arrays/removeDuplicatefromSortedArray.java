package Arrays;

import java.util.HashSet;

public class removeDuplicatefromSortedArray {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,7,8};
        System.out.println("array after removing duplicate");
       int k= removeDuplicate(array);
        System.out.println("number of unique element-->" + k);
        //another way
        removeDUplicate(array);

    }
    public static int  removeDuplicate(int []array)
    {//brute force-->complexity(o(n)+ nlogn (nlogn for insertion of element into set))
        HashSet<Integer> set=new HashSet<>();
        int n=array.length;
        for(int i=0;i<n;i++){
            set.add(array[i]);//insert each unique element of array into set;
        }
        //another loop for to put back unique element into array
        int k= set.size();//for to return the no.of unique  element
        int j=0;// for indexing of array from start
        for(int x:set){
            array[j++]=x;
        }
        return k;//return the no of unique element
    }
    public static void removeDUplicate(int[] array){
        int j=0;
        //first element is always unique
        int n= array.length;
        for(int i=1;i<n;i++){
            if(array[i]!=array[j]){//array[j] is the unique element and array[i] is next element
                array[j++]=array[i];
            }
        }
        int unique=j+1; // index of unique element
        System.out.println("unique element are :" + unique);
    }
}
