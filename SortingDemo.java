import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(22);
        arr.add(32);
        arr.add(14);
        arr.add(56);


        System.out.println("ArrayList is: " + arr);

        Collections.sort(arr);
        System.out.println("After sortng ArrayList is : "+ arr);

        Integer []array = {2,5,1,4,8,3};
        System.out.println("Array is: + "+ Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("After sorting Array is: "+ Arrays.toString(array));

        
    }
}
