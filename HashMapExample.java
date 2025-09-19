import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> aiml = new HashMap<>();

        //Adding the values
        aiml.put(1,"Akash");
        aiml.put(2,"Astha");
        aiml.put(6, "Shreya");
        aiml.put(7,"Varun");
        aiml.put(5,"Shreya");
        aiml.put(3,null);
        aiml.put(4,null);
        aiml.put(null,"Laxmi");

        //Printing the values
        System.out.println(aiml);

        System.out.println("Map elements with for-each loop");

        System.out.println("Traversing via key");
        for(Integer key : aiml.keySet()){
            System.out.println(key + " " + aiml.get(key));
        }

        System.out.println("Traversing via entry");
        for(Map.Entry<Integer, String> entry : aiml.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Iterator<Map.Entry<Integer, String>> itr = aiml.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println();

    }
}
