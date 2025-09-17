import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> number = new LinkedHashSet<>();
        number.add(12);
        number.add(34);
        number.add(13);

        System.out.println("LinkedHashSet is : " + number);

        LinkedHashSet<Integer> n1 = new LinkedHashSet<>();
        n1.add(11);
        n1.add(21);
        n1.add(26);

        System.out.println("New LinkedHashSet is : " + n1);
    }    
}
