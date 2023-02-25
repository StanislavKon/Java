package homeworks.4;

import java.util.Arrays;


public class Task2 {
        public static void main(String[] args) {
        // Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент
        // в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() -
        // возвращает первый элемент из очереди, не удаляя.

        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.doString()); // добавила метод для вывода в консоль
        System.out.println(queue.first()); // 1
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.dequeue()); // 2
        System.out.println(queue.first()); // 3
    }
    
}
