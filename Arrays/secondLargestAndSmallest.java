package Arrays;

public class secondLargestAndSmallest {
    public static void main(String[] args) {
        int[]array={2,3,4,5,6,7,8,9,10};
        int[] result= new int[2];
        result=SecondLargest_and_smallest(array);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public static int[] SecondLargest_and_smallest(int[]array){
        int[]temp=new int[2];
        int min=Integer.MAX_VALUE;
        int second_min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]<=min){
                min=array[i];
            }
            else{
                max=array[i];
            }
        }
        for(int j=0;j<array.length;j++){
            if(array[j]<=second_min && array[j]!=min){
                second_min=array[j];
            }
            if (array[j]>= second_max && array[j]!=max){
                second_max=array[j];
            }

        }
        temp[0]=second_min;
        temp[1]=second_max;
        return temp;
    }

}
