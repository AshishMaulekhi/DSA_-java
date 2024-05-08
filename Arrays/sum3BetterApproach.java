package Arrays;



import java.util.*;

public class sum3BetterApproach {
    //better approach
    public static void main(String[] args) {
        int []array={-1,0,1,2,-1,-4};
        List<List<Integer>> Result=Sumof3BetterApproach(array);
        for(List<Integer> item : Result){//here item act as arraylist
            System.out.print("[");
            for(int e:item){//here e act as element of arraylist
                System.out.print(e + " ");
            }
            System.out.println("]");
        }
    }
    public static List<List<Integer>> Sumof3BetterApproach(int[]arr){
        //int []array={-1,0,1,2,-1,-4};
        int n=arr.length;
        Set<List<Integer>> st=new HashSet<>();//it store the list of triplet(sum3)
        for(int i=0;i<n;i++){
            Set<Integer>hashset=new HashSet<>();//store the checked element i.e arr[j]
            for(int j=i+1;j<n;j++){
                int third= -(arr[i]+arr[j]);//it find out the third element
                //arr[i] + arr[j] + arr[k]==0-
                // arr[k]=-(arr[i] + arr[j]); here arr[k] act as third element
                if(hashset.contains(third)){//here it will check that is third element in the hashset or not.
                    List<Integer> temp=new ArrayList<>();
                    temp.add(arr[i]);//add three element in array .
                    temp.add(arr[j]);//and that array act as element of st set.
                    temp.add(third);
                    temp.sort(null);//sort the array element so we don't get duplicate
                    st.add(temp);//now add the array into set st.
                }
                hashset.add(arr[j]);//here after each iteration add arr[j] element into hashset
                //so we can check ----->if(hashset.contains(third)) or not.
            }
        }
        List<List<Integer>> result= new ArrayList<>(st);//now store st set result into 2D list.
        return result;
    }
}
