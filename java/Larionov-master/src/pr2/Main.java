package pr2;

public class Main {
    public static void main(String[] args) {
        //author();
        //ball();
        dog();
    }
    static void author(){
        Author garry = new Author();
        Author tom = new Author("Tom@gmail.com", "Tom", 'm');
        System.out.println(garry);
        System.out.println(tom);
        garry.setEmail("Garry@gmail.com");
        garry.setName("Garry");
        garry.setGender('m');
        System.out.println(garry);
        System.out.println(garry.getEmail());
    }
    static void ball(){
        Ball first = new Ball(2, 1);
        first.setXY(2.1, 3.2);
        System.out.println(first);
        first.move(4, 5);
        System.out.println(first);
        System.out.println(first.getX());
    }
    static void dog(){
        Dog red = new Dog("Red", 3);
        System.out.println(red);
        System.out.println(red.ageConverted());
    }
}