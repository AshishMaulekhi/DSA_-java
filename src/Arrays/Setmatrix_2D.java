package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Setmatrix_2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> Matrix=new ArrayList<>();
        Matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));//we passing three object as element in matrix
        Matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));//as a list
        Matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        int n= Matrix.size();
        int m=Matrix.get(0).size();
        ArrayList<ArrayList<Integer>> Newmatrix=Zeromatrix(Matrix,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(Newmatrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> Zeromatrix(ArrayList<ArrayList<Integer>> matrix,int n,int m){
        int []row=new int[n];//for to store 1 in that row box in which matrix has zero element
        int []columb=new int[m];//for to store 1 in that columb box in which matrix has zero element
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    row[i]=1;
                    columb[j]=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1|| columb[j]==1){
                    matrix.get(i).set(j,0);//i row m aaoo aur j columb m 0(zero) set ker do
                }
            }
        }

        return matrix;
    }
}
