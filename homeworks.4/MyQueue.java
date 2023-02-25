package java.homeworks4;

import java.util.LinkedList;


public class MyQueue {
    
    private LinkedList<Integer> linkedList = new LinkedList<>();

    // enqueue() - помещает элемент в конец очереди
    void enqueue(int item) {
        linkedList.addLast(item);
    }

    // dequeue() - возвращает первый элемент из очереди и удаляет его.
    Integer dequeue() {
        if (linkedList.size()>0) {
            return linkedList.pollFirst();
        }
        return null;
    }

    //first() - возвращает первый элемент из очереди, не удаляя.
    Integer first() {
        if (linkedList.size()>0) {
            return linkedList.peekFirst();
        }
        return null;
    }

    String doString(){
        return linkedList.toString();
    }

    
}
