import java.util.*;

public class Test {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);
        System.out.println(r.isConsecutive(ls)); // true
        ls.add(8);
        ls.add(10);
        System.out.println(r.isConsecutive(ls)); // false
        System.out.println(ls.toString());
        r.reverse(ls);
        System.out.println(ls.toString());
    }
}
