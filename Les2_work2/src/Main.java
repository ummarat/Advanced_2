/*Використовуючи колекцію, підвойте слово:
 * 1. Введіть із клавіатури 5 слів до списку рядків.
 * 2. Метод doubleValues повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.
 * 3. Використовуючи цикл for виведіть результат на екран, кожне значення нового рядка.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, (list.get(i) + ", " + list.get(i)));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Введіть 5 слів");
        for (int i = 0; i < 5; i++) {
            al.add(scanner.next());
        }
        System.out.println(al + " ");

        doubleValues(al);
        for (String s : al) {
            System.out.println(s);
        }
    }
}