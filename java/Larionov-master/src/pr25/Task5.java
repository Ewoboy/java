package pr25;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате dd/mm/yyyy: ");
        String input = scanner.nextLine();

        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d\\d$";
        boolean matches = Pattern.matches(regex, input);

        if (matches && isValidDate(input)) {
            System.out.println("Дата корректна: " + input);
        } else {
            System.out.println("Дата некорректна.");
        }

        scanner.close();
    }

    private static boolean isValidDate(String date) {
        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Проверка количества дней в каждом месяце
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: // 31 день
                return day <= 31;
            case 4: case 6: case 9: case 11: // 30 дней
                return day <= 30;
            case 2: // февраль
                if (isLeapYear(year)) {
                    return day <= 29; // Високосный год
                } else {
                    return day <= 28; // Невисокосный год
                }
            default:
                return false; // Неправильный месяц
        }
    }

    private static boolean isLeapYear(int year) {
        // Проверка, является ли год високосным
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
