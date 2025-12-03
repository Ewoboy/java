package pr18;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число: ");
            int num = Integer.parseInt(scanner.next());
            System.out.println(100 / num);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат числа!");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        } finally {
            scanner.close();
        }
    }
}

