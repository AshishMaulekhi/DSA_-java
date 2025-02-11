package Arrays;

import java.util.Arrays;

public class matrixSet_zero {
    public static void main(String[] args) {
        int[][]matrix={{1,1,2,3},{2,0,1,1},{3,4,0,5},{0,1,2,3}};
        int[][]Matrix=  setmatrixZero(matrix);
        for(int[]array:Matrix){
            System.out.println(Arrays.toString(array));
        }
    }
    public static int[][] setmatrixZero(int[][]matrix){
        //optimal approach
        //complexity-->O(n^2)

        // {{1,1,2,3}    ----> {{0,0,0,3}
        // ,{2,0,1,1}          ,{0,0,0,0},
        // ,{3,4,0,5}           {0,0,0,0}}
        // ,{0,1,2,3}}          {0,0,0,0}}
        // int[]columb=new int[n];--->matrix[0][...]
        // int[]row=new int[m];------>matrix[...][0]
        int n=matrix.length;
        int m=matrix[0].length;
        int col_0=1;//ye element mera first element h matrix[0][0] wala
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    //mark the i-th row
                    matrix[i][0]=0;
                    //mark the j-th col
                    if(j!=0) {
                        matrix[0][j] = 0;
                    }
                    else{
                        col_0=0;
                    }
                }
            }
        }
        //ignore the 0-th row and 0-th columb
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++) {
                if (matrix[i][j] != 0) {
                    //check for row and columb
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j]=0;
                    }
                }
            }
        }
        //check for columb
        if(matrix[0][0]==0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(col_0==0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
        return matrix;
    }
}
