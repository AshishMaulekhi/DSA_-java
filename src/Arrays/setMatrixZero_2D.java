package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class setMatrixZero_2D {
    public static void main(String[] args) {
        int[][]array={{1,2,3},{2,0,1},{3,4,5}};
        int n=array.length;
        int m=array[0].length;
        int [][] arr=SetZero(array,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static int[][] SetZero(int[][]arr ,int n,int m){
        //ager koi bhi element zero h to uska columb and row bhi zero ker do
        // {{1,2,3}    ----> {{1,0,3}
        // ,{2,0,1}          ,{0,0,0},
        // ,{3,4,5}}          {3,0,5}}

        //time complexity O(n*m) * O(n+m) + O(n*m)------->O(n^3)
        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                   changeRow(arr,n,m,i);
                   changeColumb(arr,n,m,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }

        return arr;
    }
    public static void changeRow(int[][]arr, int n,int m,int i){
        for(int r=0;r<n;r++){
            if(arr[i][r]!=0){
                arr[i][r]=-1;
            }
        }
    }
    public static void changeColumb(int[][]arr, int n,int m,int j){
        for(int r=0;r<n;r++){
            if(arr[r][j]!=0){
                arr[r][j]=-1;
            }
        }
    }
}
