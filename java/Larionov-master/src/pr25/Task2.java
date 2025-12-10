package pr25;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для проверки: ");
        String input = scanner.nextLine();

        String regex = "^abcdefghijklmnopqrstuv18340$";
        boolean matches = Pattern.matches(regex, input);

        if (matches) {
            System.out.println("Строка соответствует: " + input);
        } else {
            System.out.println("Строка не соответствует.");
        }

        scanner.close();
    }
}
