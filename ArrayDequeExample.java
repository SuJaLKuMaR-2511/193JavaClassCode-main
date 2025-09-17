import java.util.ArrayDeque;

public class ArrayDequeExample {
    
    public static void main(String[] args) {
        //Create an ArrayDeque of Strings
        ArrayDeque<String> deque = new ArrayDeque<>();

        //Add elements
        deque.add("A");
        deque.addFirst("F");
        deque.addLast("L");

        //Add using Offer
        deque.offer("C");
        deque.offerFirst("First");
        deque.offerLast("Last");

        //Access Elements
        System.out.println("First element (peek: )" + deque.peek()); //same as peekFirst()
        System.out.println("First element (peekFirst): " + deque.peekFirst());
        System.out.println("Last element (peekLast): " + deque.peekLast());

        //Remove elements
        System.out.println("\n Removing elements: ");
        System.out.println("Removed First : " + deque.removeFirst());
        System.out.println("Removed Last : " + deque.removeLast());
        System.out.println("Removed First :  "+deque.pollFirst());
        System.out.println("Removed Last : "+ deque.pollLast());

        System.out.println("Deque after removals: ");
        System.out.println(deque);

        
    }
}
