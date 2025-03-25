import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Emp {
    int id;
    String name;
    float sal;

    Emp(int id, String name, float sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(sal);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Id  : ");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Enter your Name : ");
        String name = br.readLine();
        System.out.println("Enter the Salary : ");
        float sal = Float.parseFloat(br.readLine());
        Emp e1 = new Emp(id, name, sal);
        e1.display();

    }
}
