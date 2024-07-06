package BinarySearch;

public class flowerGarden {
    public static void main(String[] args) {
        int[]blommedFlower={7,7,7,7,9,13,12,7};//flower blommed in A[i]days
        int bucket=2;
        int no_of_flower=3;// no of flower in each bucket
        //return the day A[i] in which we get two bucket of flower .
        //each bucket have 3 flower
        System.out.println(minDays(blommedFlower,bucket,no_of_flower));
        
    }

        public static int minDays(int[] bloomDay, int m, int k) {
            int n=bloomDay.length;
            long value=(long)m*k;
            //m-->bouquets
            //k-->no.of adjacent flowers from garden
            //for to making m bouquets we need (flower>=m*k)
            if(n<value){
                return -1;
            }
            else{
                int ans=0;
                int low=minimum(bloomDay);
                int high=maximum(bloomDay);
                while(low<=high){
                    int mid=(low+high)/2;
                    int no_of_bouquets=flower_bloomed(bloomDay,mid,k ,m);
                    if(no_of_bouquets>=m){
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
                }
                return low;

            }
        }
        public static int flower_bloomed(int[]arr,int day,int k,int m){
            int no_of_days=0;
            int n=arr.length;
            int count=0;
            for(int i=0;i<n;i++){
                if(arr[i]<=day){
                    count+=1;
                }
                else{
                    no_of_days +=(count/k);
                    count=0;
                }
            }
            no_of_days +=(count/k);
            return no_of_days;
        }
        public static int minimum(int[]arr){
            int n=arr.length;
            int mini=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]<mini){
                    mini=arr[i];
                }
            }
            return mini;
        }
        public static int maximum(int[]arr){
            int n=arr.length;
            int maxi=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]>maxi){
                    maxi=arr[i];
                }
            }
            return maxi;
        }
}


