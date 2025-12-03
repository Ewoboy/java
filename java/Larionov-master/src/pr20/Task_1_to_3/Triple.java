package pr20.Task_1_to_3;

import java.io.Serializable;

public class Triple<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T first;
    private V second;
    private K third;

    // Конструктор
    public Triple(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    // Метод для вывода имен классов
    public void printClassNames() {
        System.out.println("Тип T: " + first.getClass().getSimpleName());
        System.out.println("Тип V: " + second.getClass().getSimpleName());
        System.out.println("Тип K: " + third.getClass().getSimpleName());
    }
}