package src.Maths;

public class PrintDivisors {
    public static void PrintDivsor(int n){//--->brute force
        int i=1;
        while (i <= n) {
            if(n%i==0){
                System.out.println(i);

            }
            i++;
        }
    }
    public static void PrintDiv(int n){//---->O(sqrt(n))
        int limit=(int)Math.sqrt(n);
        int i=1;
        while (i <=limit) {
            if(n%i==0){
                System.out.println(i);
                if(i!=n/i){
                    System.out.println(n/i);
                }
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int n=36;
        PrintDiv( n);
        PrintDivsor(n);
    }
}
