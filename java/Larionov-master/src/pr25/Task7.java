package pr25;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String input = scanner.nextLine();

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";
        boolean isValid = Pattern.matches(regex, input);

        if (isValid) {
            System.out.println("Пароль надежен!");
        } else {
            System.out.println("Пароль ненадежен.");
        }

        scanner.close();
    }
}
