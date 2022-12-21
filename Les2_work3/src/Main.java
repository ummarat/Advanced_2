/*Мінімальне з N чисел (використовувати LinkedList):
 * 1. Введіть із клавіатури число N.
 * 2. Зчитати N цілих чисел і заповнити ними список - метод getIntegerList.
 * 3. Знайти мінімальне число серед елементів списку – метод getMinimum.*/

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість цифр");
        int n = scanner.nextInt();

        MinList.getIntegerList(n, list);
        for (Integer a : list) {
            System.out.print(a + " ");
        }
        System.out.println("\n" + "Мінімальне значення - " + MinList.getMinimum(list));
    }
}
