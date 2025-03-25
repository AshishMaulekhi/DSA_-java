import java.util.ArrayList;

public class MyList {
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1); //1
        l1.add(2); //1,2
        l1.addAll(0, l1);// 1,2,1,2

        for(int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i) + " ");
        }
        System.out.println("\n" + l1.get(3));
        System.out.println("" + l1.indexOf(1));
        System.out.println("" + l1.lastIndexOf(2));
        System.out.println("" + l1.remove(2)); // removes 1

        for(int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i) + " ");
        }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        
        // Print the ArrayList
        System.out.print("\nArr is : ");
        System.out.print(arr);
        int sum = 0;
        //Running sum of array
        for(int i = 0; i < arr.size(); i++){
            sum = sum + arr.get(i);
        }
        System.out.println("\nSum of all array is : " + sum);
    }
}
