

public class Newmain implements Cloneable {
    // declare variables
    String Engine;
    int BHP;
    int seat;
    public static void main(String[] args) {
// create an object of Main class
        Newmain obj1 = new Newmain();    //obj1=venuzxi
        obj1.Engine= "998CC";
        obj1.BHP = 886;
        obj1.seat=5;
// print variable
        System.out.println(obj1.Engine);
        System.out.println(obj1.BHP);
        System.out.println(obj1.seat);

        try {
// create clone of obj1=venuzxi
            Newmain obj2 = (Newmain)obj1.clone(); //OBJ2= SamuraiXZ
            System.out.println("After cloning");
            System.out.println(obj2.Engine);
            System.out.println(obj2.BHP);
            System.out.println(obj2.seat);
            obj2.Engine="1000cc";

            obj2.BHP = 100;
            System.out.println("After updation of the fields of object2");
            System.out.println(obj2.Engine);
            System.out.println(obj2.BHP);
            System.out.println(obj2.seat);
            System.out.println("After updation of the fields of object2 the fields of object1 will be:");
            System.out.println(obj2.Engine);
            System.out.println(obj2.BHP);
            System.out.println(obj2.seat);

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}