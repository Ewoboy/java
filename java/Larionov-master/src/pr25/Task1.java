package pr25;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для манипуляции: ");
        String input = scanner.nextLine();

        System.out.println("Элементы, разбитые по пробелам:");
        String[] elements = splitString(input, "\\s+"); // Разделение по пробелам
        printArray(elements);

        // Пример поиска слов, начинающихся с большой буквы
        System.out.println("Слова, начинающиеся с большой буквы:");
        findWordsStartingWithCapital(input);

        // Пример замены некоторых символов (например, пробелов на дефисы)
        String replaced = input.replaceAll("\\s+", "-");
        System.out.println("Строка с заменёнными пробелами: " + replaced);

        scanner.close();
    }

    // Метод для разделения строки
    private static String[] splitString(String input, String regex) {
        return input.split(regex);
    }

    // Метод для поиска слов, начинающихся с большой буквы
    private static void findWordsStartingWithCapital(String input) {
        Pattern pattern = Pattern.compile("\\b[A-ZА-ЯЁ][a-zа-яё]*\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    // Метод для вывода массива
    private static void printArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }
}
