package pr26.Task2;

public class Main {
    public static void main(String[] args) {
        CustomList<String> customList = new CustomList<>();
        customList.add("Первый");
        customList.add("Второй");
        customList.add("Третий");

        // Используем итератор для вывода элементов списка
        for (String item : customList) {
            System.out.println(item);
        }
    }
}
