package pr24.Task2;

class MagicChair implements Chair {
    private boolean hasMagic = true;

    public void doMagic() {
        System.out.println("Магический стул совершает магию!");
        hasMagic = true;
    }

    public void deMagic() {
        System.out.println("Магия стула развеяна!");
        hasMagic = false;
    }

    public boolean hasMagic() {
        return hasMagic;
    }

    @Override
    public void sit() {
        if (hasMagic) {
            System.out.println("Сидим на магическом стуле. Чувствуется магическая энергия!");
        } else {
            System.out.println("Сидим на обычном стуле. Магия исчезла.");
        }
    }
}