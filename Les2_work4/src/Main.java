/*Програма визначає, яка сім'я (прізвище) живе у місті:
 * Приклад введення:
 * · Київ
 * · Петрови
 * · Лондон
 * · Абрамовичі
 * Приклад введення:  · Лондон
 * Приклад виведення: · Абрамовичі*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> cityName = new HashMap<>();
        CityFamily.addCitySurname(cityName);

        for (Map.Entry<String, String> tmp : cityName.entrySet()) {
            System.out.println(tmp.getKey() + " - " + tmp.getValue());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть назву міста, яке вас цікавить ");
        String city = sc.next();
        System.out.println(cityName.get(city));
    }
}