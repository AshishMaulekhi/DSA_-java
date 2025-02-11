package Arrays;

public class secondLargestAndSmallest {
    public static void main(String[] args) {
        int[]array={2,3,4,5,6,7,8,9,10};
        int[] result= new int[2];
        result=SecondLargest_and_smallest(array);
        System.out.println(result[0]);
        System.out.println(result[1]);
        //another way -->better approach
        int n=array.length;
        secondLargest(array,n);
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
    // another way  -->better approach
    public static void secondLargest(int []array,int n){
        //let first element is largest element(lar) and second_largest is MIN_VALUE
        //iterate the loop from second element in array and check if current element
        //of loop is  larger than (lar) element.if it is true than replace the (lar)
        //element by current array element;
        //and second_largest element will be the previous largest element
        int second_largest=Integer.MIN_VALUE;
        int largest_element=array[0];
        for(int k=1;k<n;k++){//start from second element
            if(largest_element<array[k]){
                second_largest=largest_element;
                largest_element=array[k];

            }
            // this will check the second_largest element is smaller than array current element
            // or not .and also it will be smaller than larger_element;

            else if(largest_element>array[k] && second_largest<array[k]){
                second_largest=array[k];
            }

        }
        System.out.println("second_largest element is :" +second_largest);
    }

}
