import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> number = new LinkedHashSet<>();
        number.add(12);
        number.add(34);
        number.add(13);
        System.out.println("LinkedHashSet is : " + number);
        
        HashSet<Integer> hs= new HashSet<>();
        hs.add(11);
        hs.add(21);
        hs.add(26);
        System.out.println("HashSet is : " + hs);

        
        LinkedHashSet<Integer> n1 = new LinkedHashSet<>();
        n1.add(11);
        n1.add(21);
        n1.add(26);
        System.out.println("New LinkedHashSet is : " + n1);

        
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(11);
        ts.add(21);
        ts.add(26);
        System.out.println("TreeSet is: "+ ts);
    }    
}
