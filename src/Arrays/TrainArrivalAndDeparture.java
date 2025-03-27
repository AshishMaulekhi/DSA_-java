package src.Arrays;

public class TrainArrivalAndDeparture {
    public static int PlatFormNeeded(int[]arr,int[]dep){
        int maxPlatform=1;
        int neededPlatform=0;
        int n=arr.length;
        int i=0,j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){//arrival of first train is less than departure of first train
                neededPlatform++;
                i++;
            } else if (arr[i]>dep[j]) {//second train arrival greater than departure of first train
                neededPlatform--;
                j++;
            }
           maxPlatform= Math.max(neededPlatform,maxPlatform);
        }

        return maxPlatform;
    }
    public static void main(String[] args) {
        int[]arr={ 900, 940, 950, 1100, 1500, 1800};
        int[]dep={910, 1200, 1120, 1130, 1900, 2000};
        int NO_of_platform_need=PlatFormNeeded(arr,dep);
        System.out.println(NO_of_platform_need);
    }
}
