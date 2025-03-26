package src.Maths;

public class GCD {
    public static int GCDofNum(int n1,int n2){//--->O(min(n1,n2))
        //loop will run up to smaller digit
        int mini=Math.min(n1,n2);
        int count=1;
        int res=0;
        while(count<=mini){
            if(n1%count==0 && n2%count==0){
                res=count;
            }
            count++;
        }
        return res;
    }
    public static int GCDofNum2(int n1,int n2){//--->O(min(n1,n2)) start from greatest possible factor

        int count=Math.min(n1,n2);
        int res=1;
        while(count>=1){
            if(n1%count==0 && n2%count==0){
                res=count;
                return res;
            }
            count--;
        }
        return res;
    }
    public static int GCDofNum3(int n1,int n2){//--->O(min(n1,n2)) start from greatest possible factor
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }
        return (n1==0?n2:n1);
    }
    public static void main(String[] args) {
        int n1=9,n2=12;
        System.out.println(GCDofNum(n1,n2));
        System.out.println(GCDofNum2(n1,n2));
        // Euclidean Algorithm -->GCD of two numbers remains the same even if the smaller number is subtracted from the larger number.
        System.out.println(GCDofNum3(n1,n2));
    }
}
