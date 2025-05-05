package src.sorting;

public class insertion_sort {
    public static void main(String[] args) {
        int [] array={5,4,3,6,7,1};
        int n=array.length;
        insertionSort(array,n);

    }
    public static void swap(int[]arr,int first ,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    public static void insertionSort(int[] arr,int n){
        //first element put in your pocket
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Shift elements to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert key at correct position
            arr[j + 1] = key;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }

}
