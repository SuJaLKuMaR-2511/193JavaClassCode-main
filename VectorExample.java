import java.util.Vector;
public class VectorExample {
    public static void main(String[] args) {
        //1.
        // Vector <String> vc=new Vector<>();//default size -> 10
        // System.out.println(vc.capacity());
        // vc.add("1");
        // vc.add("2");
        // vc.add("3");
        // vc.add("4");
        // vc.add("5");//when extra element add then double capacity(Memory Wastage)
        // System.out.println(vc.capacity());
        //2.
        // Vector <String> vc=new Vector<>(4);
        // System.out.println(vc.capacity());
        // vc.add("1");
        // vc.add("2");
        // vc.add("3");
        // vc.add("4");
        // vc.add("5");//when extra element add then double capacity(Memory Wastage)
        // System.out.println(vc.capacity());
        //3.
        Vector <String> vc=new Vector<>(4, 1);
        System.out.println(vc.capacity());
        vc.add("1");
        vc.add("2");
        vc.add("3");
        vc.add("4");
        vc.add("5");//when extra element add then double capacity(Memory Wastage)
        System.out.println(vc.capacity());

        //Difference b/w add and add all
        //Add All
        Vector <String> vc2=new Vector<>();
        vc2.add("A");
        vc2.add("B");
        vc2.add("C");

        System.out.println("Second vector is: "+vc2);

        vc.addAll(vc2);
        System.out.println(vc);

        System.out.println("--------------");

        System.out.println("First element is: "+vc );
        
    }

}