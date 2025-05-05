package src.sorting;

public class Selection {
    public static void swap(int[]arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void SelectionSort(int[]arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            swap(arr,min_idx,i);
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    public static void main(String[] args) {
        int[]arr={4,3,7,4,8,2};
        SelectionSort(arr);
    }
}
