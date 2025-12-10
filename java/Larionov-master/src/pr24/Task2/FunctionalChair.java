package pr24.Task2;

class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("Сидим на функциональном стуле");
    }
}
