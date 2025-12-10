package pr24.Task2;

class Client {
    private Chair chair;

    public Client() {
    }

    public Client(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        if (chair != null) {
            chair.sit();
        } else {
            System.out.println("Нет стула, чтобы сесть!");
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
        System.out.println("Клиент получил новый стул");
    }

    public Chair getChair() {
        return chair;
    }
}
