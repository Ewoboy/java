package pr18;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter key: ");
            String key = myScanner.next();

            try {
                if (key.equals("")) {
                    throw new Exception("Key set to empty string");
                }
                System.out.println("data for " + key);
                break; // Выход из цикла при успешном вводе
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage() + ". Try again.");
            }
        }

        myScanner.close();
    }
}
