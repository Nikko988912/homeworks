package Geography;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Country {
    public static void main(String[] args) {
        List<String> rivers = Arrays.asList("Amazon", "Nile", "Yangtze", "Mississippi", "Danube", "Main", "Ganges");

        List<String> longRivers = rivers.stream()
                .filter(river -> river.length() > 7) // Оставляем только те, у которых больше 7 букв
                .collect(Collectors.toList()); // Собираем результат в список

        System.out.println(longRivers);
    }
}