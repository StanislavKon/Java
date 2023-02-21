package homeworks3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {public static void main(String[] args) {
    // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее
    // арифметическое этого списка.

    ArrayList<Integer> numbers = getRandomList(15, 100);
    int maxValue = Collections.max(numbers);
    int minValue = Collections.min(numbers);
    double averageValue = getAverageValue(numbers);
    System.out.printf("Полученный список: %s\n", numbers.toString());
    System.out.printf("Максимальное значение в списке: %d\nМинимальное значение списка: %d\n" +
            "Среднее арифмитеческое элементов списка: %.2f", maxValue, minValue, averageValue);
}

private static ArrayList<Integer> getRandomList(int size, int upperBond) {
    ArrayList<Integer> list = new ArrayList<>();
    Random rand = new Random();
    for (int i = 0; i < size; i++) {
        list.add(rand.nextInt(upperBond));
    }
    return list;
}

private static Double getAverageValue (ArrayList<Integer> list) {
    int sum = list.stream().mapToInt(Integer::intValue).sum();
    double averageValue = (double) sum / list.size();
    return averageValue;
}
    
}
