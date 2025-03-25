import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyArrayList {

    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(20);
        c.add(40);
        System.out.println("Traversing A : ");
        for(int i = 0; i < a.size(); i++){
            System.out.print(a.get(i) + " ");
        }

        System.out.println("\nCoping A to B : ");
        b.addAll(a);
        System.out.println();
        Collections.reverse(b);

        for(Integer i : a){
            System.out.print(i + " ");
        }

        System.err.println("\nReverse of B : ");
        
        for(Integer j : b){
            System.err.print(j + " ");
        }
        System.out.println("\nC elements are removed from A(removeAll) : ");
        a.removeAll(c);

        for(Integer i : a){
            System.out.print(i + " ");
        }
        System.out.println("\nC is : ");
        for(Integer j : c){
            System.out.print(j + " ");
        }
        b.retainAll(c);
        System.out.println("\nB is(retainAll) : ");
        for(Integer i : b){
            System.out.print(i + " ");
        }

        System.out.println("\nSize of A : " + a.size());

        System.out.print("\n A is : ");
        for (int i = 0; i < b.size(); i++) {
            Iterator<Integer> it = a.iterator();
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
        }
        

    }
}