package dynamicArrays;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        list.indexOf(20);

        System.out.println(list);
    }
}
