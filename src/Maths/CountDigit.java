package src.Maths;

public class CountDigit {
    public  static  int  countDigit(double d){
        //efficent way-->O(logn)
        //log10(n) +1
        return ((int)Math.log10(d) +1);
    }
    public  static int CountDigits(int d){//--->O(logn)
        int count=0;
        while(d !=0){
            d=d/10;
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        double digit=12322;
        int Digit=12322;
        System.out.println(countDigit(digit));
        System.out.println(CountDigits(Digit));
    }
}
