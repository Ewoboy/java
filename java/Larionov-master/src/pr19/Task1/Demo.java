package pr19.Task1;

public class Demo {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        try {
            processor.processOrder("Иван Иванов", "1234516789012");
        } catch (InvalidINNException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
