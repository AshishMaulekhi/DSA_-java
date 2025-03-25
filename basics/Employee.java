//There are class Employee, test, test1

/* TOPICS
1. normal object and anonymous object
2. static block
3. init block

 */

class Employee {
    int emp_id;
    String emp_name;
    String address;
 

    void set_data(int var1, String var2, String var3) {
       this.emp_id = var1;
       this.emp_name = var2;
       this.address = var3;
    }
 
    void get_data() {
       System.out.println("Employee ID : " + this.emp_id);
       System.out.println("Employee name : " + this.emp_name);
       System.out.println("Employee address : " + this.address);
    }
 
    public static void main(String[] args) {

       Employee var1, var2;

       var1 = new Employee(); //normal object declaration
       var1.set_data(12, "Ansh", "23-A");
       var1.get_data();
       System.out.println("Referemce Id of e1 : " + var1); //printing the object id

       var2 = new Employee();
       var2.set_data(13, "Vikash", "Sec-12");
       var2.get_data();
       System.out.println("Referemce Id of e2 : " + var2);
    }
}
 
//Anonymous object
 class test {
    int x = 10;
 
    void show() {
       System.out.println(x); //There will be only one method , for creating a anonymous object
    }
 
    public static void main(String[] args) {
       new test().show(); //anonymous object declaration
       System.out.println(new test());
    }
 }

 //Static block
 class test1{
   static int x = 10; //static variable for static block

   static //static block will be having the highest priority than other blocks
   {
      System.out.println("Static block : "+ x);
   }

   void show(){
      System.out.println(x);
   }

   public static void main(String[] args){
      test1 t1 = new test1();
      t1.show(); //  without calling it it will be printed the "Static block"
   }
 }


 //Init block
 class test2{
   int x = 10;

   { //init block similar to static block but does not static 
      System.out.println("init block : " + x); //high priority
   }

   void show(){
      System.out.println(x);
   }

   public static void main(String[] args){
      test2 t2 = new test2();
      t2.show();
   }
 }
 