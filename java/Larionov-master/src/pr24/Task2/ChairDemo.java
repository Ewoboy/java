package pr24.Task2;

public class ChairDemo {
    public static void main(String[] args) {
        // Создаем фабрику
        AbstractChairFactory factory = new ChairFactory();

        // Создаем клиента
        Client client = new Client();

        // Создаем разные стулья и тестируем их
        System.out.println("=== Викторианский стул ===");
        VictorianChair victorianChair = factory.createVictorianChair(150);
        client.setChair(victorianChair);
        client.sit();
        System.out.println("Возраст стула: " + victorianChair.getAge() + " лет");

        System.out.println("\n=== Магический стул ===");
        MagicChair magicChair = factory.createMagicChair();
        client.setChair(magicChair);
        client.sit();
        magicChair.doMagic();
        client.sit();
        magicChair.deMagic();
        client.sit();

        System.out.println("\n-Функциональный стул-");
        FunctionalChair functionalChair = factory.createFunctionalChair();
        client.setChair(functionalChair);
        client.sit();
        int result = functionalChair.sum(5, 3);
        System.out.println("Функциональный стул посчитал сумму: " + result);

        System.out.println("\n-Тестирование без стула-");
        Client clientWithoutChair = new Client();
        clientWithoutChair.sit();

        System.out.println("\n-Динамическая смена стульев-");
        // Клиент может менять стулья
        client.setChair(victorianChair);
        client.sit();

        client.setChair(magicChair);
        client.sit();
    }
}