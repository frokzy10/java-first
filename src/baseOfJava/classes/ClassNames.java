package baseOfJava.classes;

public class ClassNames {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Barsik";
        cat.age = 12;
        System.out.println("Моего кота зовут " + cat.name + " и ему " + cat.age + " лет");

        Animal dog = new Animal();
        dog.name = "Rex";
        dog.age = 10;
        System.out.println("Мою собаку зовут " + dog.name + " и ему " + dog.age + " лет");
    }
}

class Animal {
    String name;
    int age;
}