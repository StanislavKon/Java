package homeworks.4;

import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
        // “перевернутый” список. Постараться не обращаться к листу по индексам.

        LinkedList<Integer> integerLinkedList = createList(10);
        System.out.print("Cозданный LinkedList: ");
        System.out.println(integerLinkedList);
        integerLinkedList = reverseList(integerLinkedList);
        System.out.print("Перевернутый LinkedList: ");
        System.out.println(integerLinkedList);
    }

    static LinkedList<Integer> createList(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(i + 1);
        }
        return linkedList;
    }

    static LinkedList<Integer> reverseList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> newList = new LinkedList<>();
        while (linkedList.size() > 0 ) {
            newList.add(linkedList.pollLast());
        }
        return newList;
    }
    
}
