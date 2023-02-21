package homeworks3;

import java.util.Arrays;
import java.util.Random;


public class Task1 {public static void main(String[] args) {
    // Реализовать алгоритм сортировки слиянием
    int[] array = createRandomArray(15, -10, 25);
    System.out.printf("Исходный массив: %s\n", Arrays.toString(array));
    mergeSortArray(array);
    System.out.printf("Отсортированный массив: %s\n", Arrays.toString(array));

}

static int[] createRandomArray(int size, int downBound, int upperBond) {
    Random rand = new Random();
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
        array[i] = rand.nextInt(upperBond) - rand.nextInt(Math.abs(downBound));
    }
    return array;
}

static void mergeSortArray(int[] array) {
    if (array.length == 1) return;
    int mid = array.length / 2;
    int[] left = Arrays.copyOfRange(array, 0, mid);
    int[] right = Arrays.copyOfRange(array, mid, array.length);
    mergeSortArray(left);
    mergeSortArray(right);
    sortArray(array, left, right);
}

static void sortArray(int[] array, int[] left, int[] right) {
    int i = 0, j = 0, k = 0;
    while (i < left.length && j < right.length) {
        if (left[i] <= right[j]) array[k++] = left[i++];
        else array[k++] = right[j++];
    }
    while (i < left.length) array[k++] = left[i++];
    while (j < right.length) array[k++] = right[j++];
}
    
}
