package arrays;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyClass {
//    static void main() {
//        int[] numbers = {10, 20 ,30};
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
//    }

    static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(3);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers.size());
        numbers.add(40);
        numbers.remove(3);

        System.out.println(numbers.size());
        System.out.println(numbers);

    }
}
