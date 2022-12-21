/*Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
 * 1. Створити перелік рядків.
 * 2. Ввести рядки з клавіатури та додати їх до списку.
 * 3. Вводити з клавіатури рядки, доки користувач не введе рядок "end".
 * "end" не враховувати.
 * 4. Вивести рядки на екран, кожен з нового рядка.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        String num;
        System.out.println("Введіть рядки слів:");
        while (true) {
            num = sc.nextLine();
            arrayList.add(num);
            if (num.equals("end")) {
                arrayList.remove(arrayList.size() - 1);
                break;
            }
        }
        for (String a : arrayList) {
            System.out.println(a + "\n");
        }
    }
}