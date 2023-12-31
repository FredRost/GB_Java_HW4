package HW_Java4;

import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> elements = new LinkedList<>();

    public MyQueue() {}

    public MyQueue(LinkedList<T> linkedList) {
        this.elements = linkedList;
    }

    // Метод помещает элемент в конец очереди
    public void enqueue(T element) {
        elements.addLast(element);
    }

    // Метод возвращает первый элемент из очереди и удаляет его
    public T dequeue() {
        return elements.pollFirst();
    }

    // Метод возвращает первый элемент из очереди, не удаляя его
    public T first() {
        return elements.peekFirst();
    }
}

public class Task2 {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println(myQueue.first());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.first());
    }
}