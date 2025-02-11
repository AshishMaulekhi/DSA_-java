package Arrays;

import java.util.Arrays;

public class stock_buy_and_sale {
    public static void main(String[] args) {
        int[]array={7,2,3,1,7,5,3,5,9,10,4};
      //  System.out.println((Stock_Buy_Sale(array)));
        //another way to solve
        System.out.println(buyAndSale(array));
    }
    public static int Stock_Buy_Sale(int[]arr){
        //brute force
        //buy in low price and sale in high price
        //you can't sale previous iterate element
        //buy(1)---->sale(10)===profit(9 rupee)
        int profit=0;
        int n=arr.length;
        for(int i=0; i<n;i++){
            int buy=arr[i];
            for(int j=i;j<n;j++){
                profit=Math.max(arr[j]-buy,profit);//it will find the maximum difference bw two number

            }
        }

        return profit;
        //complexity ---o(n^2)

    }

    public static int buyAndSale(int[]arr){
        //7,2,3,1,7,5,3,5,9,10,4
        int n=arr.length;

        //ager ek bar minimum number mille to usko change mat kerna
        //maximum difference nikalo number ke bich
        int profit=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            //maximum number leke sab se compare ker aur minimum no. nikal le
            min=Math.min(min,arr[i]);//sabse choti value milegi
            max=Math.max(max,arr[i]-min);//profit nikal ke dega

        }
        profit=max;

        return profit;
        //complexity -->o(n)
    }
}
