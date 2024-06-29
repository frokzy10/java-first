package baseOfJava.TypeReturnMethod;

public class TypeReturnMethod {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 30;
        person1.name = "Nurdin";
        int year1 = person1.calculateAgeToRetirement();
        System.out.println("Вам осталось до пенсии " + year1 + " лет");
    }
}

class Person {
    String name;
    int age;

//    Этот тип метода возращает только тот тип который указан в методе это создано для строгой
//    типизации! Вот пример правильной
    int calculateAgeToRetirement() {
        int years = 65 - age;
        return years;
    }
//    А вот не правивльная, тут указан тип string а значение внутри него имеет int
//    String calculateAge(){
//        int age = age;
//        return age;
//    }
}