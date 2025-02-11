package BinarySearch;

public class minimumCapacityOfShip {
    public  void main(String[] args) {
        //Input Format:
        // N = 5, weights[] = {5,4,5,2,3,4,5,6}, d = 5
        //Result:
        // 9
        int[]weights={5,4,5,2,3,4,5,6};
        int d=5;
        System.out.println(shipWithinDays(weights,d));
    }

        public int shipWithinDays(int[] weights, int days) {
            //i have to find the minimum wait capacity of ship
            //so ship  deliver the package with in d days;
            //weights = [1,2,3,4,5,6,7,8,9,10], days = 5
            //range of capacity is from maximum(weights) ---to---sumition(weights)
            int maxi=Integer.MIN_VALUE;
            int sum=0;
            for(int i=0;i<weights.length;i++){
                //maximum element
                if(weights[i]>maxi){
                    maxi=weights[i];
                }
                //sumition of all array element
                sum +=weights[i];
            }
            int low=maxi;
            int high=sum;

            while(low<=high){
                int mid=(low+high)/2;
                int required_days=requiredDays(weights,mid);
                if(required_days<=days){

                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return low;
        }

        public int requiredDays(int[]arr,int capicity){
            //i have to find no of days required to deliver the package
            int day=1;
            int load=0;
            for(int i=0;i<arr.length;i++){
                if(load+arr[i]>capicity){
                    day=day+1;
                    load=arr[i];
                }
                else{
                    load=load+arr[i];
                }

            }
            return day;
        }
    }

