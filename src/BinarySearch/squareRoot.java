package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class squareRoot {
    public static void main(String[] args) {
        int find=37;//find floor  square root value of number
        System.out.println(findRoot(find));
    }
    public static int findRoot(int find){
        int low=1;//minimum value of square root
        int high=find;
        int ans=1;//minimum square root value of any positive no
        if(find<=0){
            return -1;//square root of negative value is imaginary no.
        }
        while(low<=high){
            int mid=(low+high)/2;
            int value=mid*mid;

            if(value<=find){
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
