package pr2;

public class CircleSix {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double calculateLenght(){
        return 2 * Math.PI * getRadius();
    }

}
