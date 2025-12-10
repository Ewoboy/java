package pr26.Task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Класс, реализующий собственный список
public class CustomList<T> implements Iterable<T> {
    private Object[] elements;
    private int size;

    // Конструктор
    public CustomList() {
        elements = new Object[10];  // Начальный размер массива
        size = 0;
    }

    // Метод добавления элемента
    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    // Метод изменения размера массива
    private void resize() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    // Метод получения размера списка
    public int size() {
        return size;
    }

    // Получение элемента по индексу
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне границ");
        }
        return (T) elements[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    // Внутренний класс для итератора
    private class CustomIterator implements Iterator<T> {
        private int currentIndex = 0;

        // Проверяет, есть ли следующий элемент
        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        // Возвращает следующий элемент
        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Нет больше элементов");
            }
            return (T) elements[currentIndex++];
        }
    }
}


