package baseOfJava.wildcards;

import java.util.ArrayList;
import java.util.List;

class Animal{
    private final int id;

    Animal(int id){
        this.id = id;
    }

    public void eat(){
        System.out.println("eating");
    }
    @Override
    public String toString(){
        return String.valueOf(id);
    }
}
class Dog extends Animal {
    Dog(){
        super(0);
    }
}
class Test{
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();

        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfDogs);
        test(listOfAnimals);
    }
    public static void test(List<? extends Animal> list){
        for(Animal a : list){
            a.eat();
        }
    }
}
