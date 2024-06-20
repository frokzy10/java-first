import OOP.OOP;

public class Main {
    public static void main(String[] args){
        OOP.Person person = new OOP.Person("Nurdin",15);

        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
    }
}
