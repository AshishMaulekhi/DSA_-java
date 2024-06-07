package linkedList;

public class interfaceAshish2 {
    interface walkable{
        void run();
        void name();
    }
    interface swimable{
        void sound();
        void name();
    }
    class roboticPet implements walkable ,swimable{

        String name;
        int run;
        String sound;
        roboticPet(String name,int run, String sound){
            this.run=run;
            this.name=name;
            this.sound=sound;
        }

        @Override
        public void run() {
            System.out.println("ashish is still running for :"+ run);
        }
        public void name(){
            System.out.println("his name is :"+ name);
        }
        public void sound(){
            System.out.println("he sound like :"+ sound);
        }

    }
class interfaceAshish2{
    public static void main(String args[]){
    roboticPet obj1= new roboticPet("ashish",23,"high");
    obj1.run();
    obj1.name();
    obj1.sound();
}
    }

}
