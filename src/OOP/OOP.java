package OOP;

public class OOP {
//    Инкапсуляция - это принцип который принимает в себе методы и данные в одном классе
    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
    }
    public static void main(String[] args){
//        Наследование
        Employee emp = new Employee("Daur",17);
        emp.work();
        Manager mgr = new Manager("Nurel",16,3);
        mgr.work();
        Developer dev = new Developer("Nurdin",15,"Java/JavaScript");
        dev.work();
//        Полиморфизм
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
    }
}
//Наследование - это приницп который наследуется от отного классы и может принимать в себе его
//параметры
class Employee{
    private String name;
    private int age;

    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void work(){
        System.out.println(name + " is working");
    }
}
class Manager extends Employee {
    private int TeamSize;

    public Manager(String name,int age,int TeamSize){
        super(name,age);
        this.TeamSize = TeamSize;
    }

    @Override
    public void work(){
        System.out.println(getName() + " is managing a team of " + TeamSize + " employees");
    }
}
class Developer extends Employee{
    private String Language;

    public Developer(String name,int age,String Language){
        super(name,age);
        this.Language = Language;
    }

    @Override
    public void work(){
        System.out.println(getName() + " is writing code on " + Language);
    }

    public String getLanguage(){
        return Language;
    }
}
//Полиморизм - это принцип который может переопределять объекты в зависимости
//от их базового классы а моем случае это Animal .И здесь классы Cat и Dog наследуется он Animal
//и делает переопределение(override)
class Animal {
    public void makeSound(){
        System.out.println("Some sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}
