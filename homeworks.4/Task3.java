package homeworks.4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        // Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор.

        LinkedList<Integer> integerLinkedList = createRandomList(5, 5);
        int sum = getSumElemList(integerLinkedList);
        System.out.print("Cозданный LinkedList: ");
        System.out.println(integerLinkedList);
        System.out.printf("Cумма всех элементов LinkedList: %d\n", sum);
    }

    static LinkedList<Integer> createRandomList(int size, int upperBond) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random ri = new Random();
        for (int i = 0; i < size; i++) {
            linkedList.add(ri.nextInt(upperBond));
        }
        return linkedList;
    }

    static int getSumElemList(LinkedList<Integer> linkedList) {
        Iterator<Integer> iteratorList = linkedList.iterator();
        int total = 0;
        while(iteratorList.hasNext()) {
            int item = iteratorList.next();
            total+=item;
        }
        return total;
    }
    
}
