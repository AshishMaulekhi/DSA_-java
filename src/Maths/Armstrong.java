package src.Maths;

public class Armstrong {
    public static String ArmstrongNum(int n){
        int k=String.valueOf(n).length();
        int num=n;
        int arm=0;
        int digit;
        while(n!=0){
            digit=n%10;
            arm = arm +(int ) Math.pow(digit,k);
            n/=10;
        }
        return (arm==num?"Yes it is armstrong num.":"OOP's it's not armstrong num");
    }
    public static void main(String[] args) {
        int digit=9474;//371,153
        System.out.println(ArmstrongNum(digit));
    }
}
