class Test {
    public static void main(String[] args){
        String s = "hello";
        String s1 = "hello";
        if(s == s1){ //compares the reference
            System.out.println("Match");
        }else {
            System.out.println("Not match");
        }
    }
}

class Test1 {

    public static void main(String[] args){
        String s =new String("Hello"); //s will go to heap region
        //Hello will go to pool of String class, both have different reference both have different memory location

        String s1 = "Hello";
        //both s and s1 will point to same Hello in the memeory as of same value
        String s2 = s.intern();
        System.out.println(s2);
        if(s.intern() == s1.intern()){ //pointing to same memory location
            System.out.println("True");
        }

        String s3 = new String("World");
        if(s.intern() == s3.intern()){ //s and s3 points to different memory location
            System.out.println("True"); 
        }else {
            System.out.println("False");
        }
    }
}


//WAP to count total no. of character in a string 
//Reverse of a string
//vowel count
class Test2 {

    public static void main(String[] args) {
        String s = "Hello, World";
        int l = s.length(); //using length
        System.out.println(l);

        String s1 = "Ansh Sharma";
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != ' '){ //does'nt count the spaces
                count++;
            }
        }
        System.out.println("Total count : " + count);


        int r = 0;
        int m = s1.length() - 1;
        char swap;
        StringBuilder nm = new StringBuilder(s1); // Use StringBuilder for mutability

            while (r <= m) {
                swap = nm.charAt(r);
                nm.setCharAt(r, nm.charAt(m)); // Swap the characters
                nm.setCharAt(m, swap);
                r++;
                m--;
            }

            String reversedString = nm.toString(); // Convert back to String if needed
            System.out.println(reversedString);

    }
}