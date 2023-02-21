package homeworks3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task2 {public static void main(String[] args) {
    // Пусть дан произвольный список целых чисел, удалить из него четные числа

    // ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-3, 4, 9, 23, 6, 38, -8, -24));
    ArrayList<Integer> numbers = getRandomList(15, 30);
    System.out.printf("Первоначальный список: %s\n", numbers.toString());
    System.out.printf("Список нечетных элементов: %s", getOddList(numbers).toString());
}

private static ArrayList<Integer> getOddList(ArrayList<Integer> list) {

    Iterator<Integer> iteratorList = list.iterator();

    while (iteratorList.hasNext()) {
        int item = iteratorList.next();
        if (item % 2 == 0) iteratorList.remove();
    }
    return list;
}

private static ArrayList<Integer> getRandomList(int size, int upperBond) {
    ArrayList<Integer> list = new ArrayList<>();
    Random rand = new Random();
    for (int i = 0; i < size; i++) {
        list.add(rand.nextInt(upperBond));
    }
    return list;
}
    
}
