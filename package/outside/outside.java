package outside;
// Outside.java in the /outside directory
import inside.inside;

public class outside {
    public static void main(String[] args) {
        inside obj = new inside();
        obj.display();  // Calling the method from Inside class
    }
}
