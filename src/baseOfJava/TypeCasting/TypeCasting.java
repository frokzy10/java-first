package baseOfJava.TypeCasting;

class Animal {
    public void bark(){
        System.out.println("Bark");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("Eat");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
//          Upcasting
//        Dog dog = new Dog();
//        Animal animal = dog;
//        dog.bark();
//        dog.eat();

//          DownCasting
//        Dog dog2 = (Dog) animal;
//        dog2.bark();
//          ErrorCasting
        Animal a = new Animal();
        Dog d = (Dog) a;
        d.eat();
    }
}