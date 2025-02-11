package Arrays;

public class CheckSortedOrnot {
    public static void main(String[] args) {
        int[]array={4,3,2,5,6,4,2};
        boolean result=ckeckArrayIssortedORnot(array);
        System.out.println("Is Array sorted-->" + result);
    }
    public static boolean ckeckArrayIssortedORnot(int[] array){
        // i had consider increasing order
        int n=array.length;
        for(int i=0;i<n-1;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
       return true;
        // now for decreasing order
//        for(int i=0;i<n-1;i++){
//            if(array[i]<array[i+1]){
//                return false;
//            }
//
//        return true;
   }
}
