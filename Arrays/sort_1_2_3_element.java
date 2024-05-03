package Arrays;

import java.util.Arrays;

public class sort_1_2_3_element {
    public static void main(String[] args) {
        int []array={1,0,2,1,2,0,1,1,2,0,2};//why error generated by last 2
        System.out.println(Arrays.toString(sort_array(array)));

        //another way by three pointer
        //int count_1,count_2,count_3=0;
        //By for loop count the no of appearance of each number and assign to count variable
        //by another three for loop which are run up to count_1,(count_1+count_2),(n) and
        // assign the value 0,1,2 according to loop

    }
    public static int[] sort_array(int[]arr){
        //optimal approach
        //Dutch national flag algo
        //index[0]----> index[low-1]==0
        //index[low]---->index[mid-1]==1
        //index[min]----> index[high]==random number(0/1/2)
        //index[high+1]---->index[n-1]==2
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){//i==mid;

            if(arr[mid]==0){
                //swap mid with low and increment low++ and mid++
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){//swap mid with high and increment mid++ and decrement high--;
                int temp_2=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp_2;
                high--;
                mid++;
            }

            else{
                System.out.println("array have other element than 1,0,2:");
                return  null;
            }

        }

        return arr;
    }

}