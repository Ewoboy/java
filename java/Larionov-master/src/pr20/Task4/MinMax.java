package pr20.Task4;

// Класс для нахождения минимального и максимального элемента массива
public class MinMax<T extends Comparable<T>> {
    private T[] array;

    // Конструктор
    public MinMax(T[] array) {
        this.array = array.clone(); // Создаем копию массива для безопасности
    }

    // Метод для нахождения минимального элемента
    public T findMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    // Метод для нахождения максимального элемента
    public T findMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    // Метод для вывода информации о массиве
    public void printArrayInfo() {
        System.out.println("Размер массива: " + array.length);
        System.out.println("Минимальный элемент: " + findMin());
        System.out.println("Максимальный элемент: " + findMax());
    }
}