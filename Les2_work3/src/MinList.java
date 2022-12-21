import java.util.LinkedList;
import java.util.Scanner;

public class MinList {
    public static LinkedList<Integer> getIntegerList(int n, LinkedList<Integer> l) {
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Введіть цифри: ");
            int x = sr.nextInt();
            l.add(x);
        }
        return l;
    }

    public static int getMinimum(LinkedList<Integer> l) {
        int min = l.get(0);
        for (int i = 1; i < l.size() - 1; i++) {
            if (min > l.get(i))
                min = l.get(i);
        }
        return min;
    }
}