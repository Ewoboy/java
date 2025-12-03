package pr20.Task_1_to_3;

import java.io.Serializable;

// Базовый класс Animal для ограничений в дженериках
public class Animal implements Serializable {
    private String name;
    private int age;

    public Animal() {
        this.name = "Unknown Animal";
        this.age = 0;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + "}";
    }

    // Метод для демонстрации
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
}