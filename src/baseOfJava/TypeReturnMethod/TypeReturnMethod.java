package baseOfJava.TypeReturnMethod;

public class TypeReturnMethod {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Nurdin");
        person1.setAge(15);
        person1.say();
        int year1 = person1.calculateAgeToRetirement();
        System.out.println("Вам осталось до пенсии " + year1 + " лет");
    }
}

class Person {
    String name;
    int age;

    void setName(String username){
        name = username;
    }
    void setAge(int userAge){
        age = userAge;
    }
    void say(){
        System.out.println("Привет я "+name+" мне "+ age+" лет");
    }
    int calculateAgeToRetirement() {
        int years = 65 - age;
        return years;
    }
}