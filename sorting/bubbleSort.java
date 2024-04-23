package sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a={3,2,5,8,6};
        int n=a.length;
        bubble_sort(a,n);
    }
    public static void bubble_sort(int[]array,int n){
         for(int j=0;j<n;j++) {
             for (int i = 0; i < n - j - 1; i++) {
                 if (array[i] >= array[i + 1]) {
                     int temp = array[i];
                     array[i] = array[i + 1];
                     array[i + 1] = temp;
                 }
             }
         }
         for(int r=0;r<n;r++){
             System.out.print(array[r]);
             if(r<n-1){
                 System.out.print(",");

             }
         }
    }
}
