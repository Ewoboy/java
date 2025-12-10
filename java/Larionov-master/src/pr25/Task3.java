package pr25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3{
    public static void main(String[] args) {
        String text = "25.98 USD, 44 ERR, 10 RUB, 100.00 EUR, 00 EUR, 0.004 EUR.";

        String regex = "\\b(?!0{2,})([1-9]\\d*|[1-9]\\d*(\\.\\d{1,2})?)\\s*(USD|RUB|EUR)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные цены:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}


