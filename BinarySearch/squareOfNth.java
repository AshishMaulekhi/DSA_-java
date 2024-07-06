package BinarySearch;

public class squareOfNth {
    public static void main(String[] args) {
        int target=126;
        int root=3;
        //nth root of number
        //n-->2,3,4,5,6...
        int result=nth_root(target,root);
        System.out.println(result);
    }
    public static int nth_root(int target,int root){
        //range from 1 to target
        int low=1;
        int high=target;
        int ans=1;
        while(low<=high){

            int mid=(low+high)/2;
            int multi=nth_power(mid,root);//mid*mid*mid....
            if(multi==target){//ager square ya cube ya quad beraber aaya target
                return mid;//return uska index(mid)
            }
            else if(multi<target){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static int nth_power(int num,int root){
        int multiply=1;
        for(int i=1;i<=root;i++){
            multiply*=num;
        }
        return multiply;
    }
}
