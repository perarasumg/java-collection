import java.util.ArrayList;
import java.util.List;

class Main {
    // addfunction
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(1, 88);
        System.out.println(li);
        li.set(1, 2);
        ArrayList<Integer> li1 = new ArrayList<Integer>();
        li1.add(31);
        li1.add(41);
        li.addAll(li1);
        System.out.println(li);
        ArrayList<Integer> li2 = new ArrayList<Integer>();
        li2.add(111);
        li2.add(222);
        li2.add(333);
        li.addAll(2, li2);
        System.out.println(li);
        System.out.println(li.lastIndexOf(2));
        System.out.println("size of the array : " + li.size());
        Integer obj[] = new Integer[li.size()];
        Integer obj1[] = new Integer[li.size()];
        obj1 = li.toArray(obj);
        for (Integer in : obj1) {
            System.out.println(in);
        }
        int j[] = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            j[i] = li.get(i);
        }
        // changing the non primitive primitive
        for (int i : j) {
            System.out.println("---" + i);
        }
    }
}