package pr19.Task1;

public class OrderProcessor {
    public void processOrder(String name, String inn) throws InvalidINNException {
        if (!isValidINN(inn)) {
            throw new InvalidINNException("Недействительный ИНН: " + inn);
        }
        // Дальнейшая обработка заказа
        System.out.println("Заказ успешно оформлен для: " + name);
    }

    private boolean isValidINN(String inn) {
        // Пример проверки: ИНН должен содержать 12 цифр
        return inn != null && inn.matches("\\d{12}");
    }
}
