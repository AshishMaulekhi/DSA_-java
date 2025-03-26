package src.Maths;

public class ReverseNumber {
    public static int ReverseNum(int n){
        int rev=0;
        int digit;
        while(n!=0){
            digit=n%10;
            rev=rev*10 + digit;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num=23433000;
        System.out.println(ReverseNum(num));
    }
}
