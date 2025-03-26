package src.Maths;

public class Palindrome {
    public static String PalindromeNum(int n){
        int num=n;
        int rev=0;
        int digit;
        while(n!=0){
            digit=n%10;
            rev=rev*10 + digit;
            n /=10;
        }
        return (num==rev?"yes! it is palindrome":"OOp's, it's not palindrome");
    }
    public static void main(String[] args) {
        int num=121;//1331,4554
        System.out.println(PalindromeNum(num));
    }
}
