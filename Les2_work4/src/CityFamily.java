import java.util.HashMap;
import java.util.Scanner;

public class CityFamily {
    public static HashMap<String, String> addCitySurname(HashMap<String, String> hm) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Скільки позицій буде введено?");
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println("Введіть місто:");
            String city = scanner.next();
            System.out.println("Введіть прізвище:");
            String name = scanner.next();
            if (!city.isEmpty() && !name.isEmpty())
                hm.put(city, name);
        }
        return hm;
    }
}
