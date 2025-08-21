import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        System.out.println("Количество совпадений: ");
        int occurrences = scanner.nextInt();

        System.out.println(countOccurrences(str, occurrences));
    }

    public static String countOccurrences(String str, int o) {
        StringBuilder result = new StringBuilder();

        String[] temp = str.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < temp.length; i++) {
            if (map.containsKey(temp[i])) {
                map.put(temp[i], map.get(temp[i]) + 1);
            } else
                map.put(temp[i], 1);
        }
        for (var entry : map.entrySet()) {
            if (entry.getValue() == o)
                result.append(entry.getKey()).append(" ");
        }

        return result.toString().trim();
    }
}
