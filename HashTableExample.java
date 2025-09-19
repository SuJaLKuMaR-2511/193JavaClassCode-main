import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, "Abc");
        table.put(4,"Xyz");
        table.put(2, "pq");

        System.out.println("Our Hashtable is: "+ table);

        System.out.println(table.putIfAbsent(2, "mno"));
    }
}
