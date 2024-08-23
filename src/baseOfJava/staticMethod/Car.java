package baseOfJava.staticMethod;

import java.io.FileOutputStream;
import java.io.Serializable;

public class Car {
    static int numberOfCars;

    private String name;
    private String engine;

    public Car(String name,String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}

class MethodMain{
    public static void main(String[] args) {
        Car first = new Car("Nurdin","V8");
        Car second = new Car("Daur","W16");

        System.out.println("Ответ: " + Car.numberOfCars);
    }
}

class Student implements Serializable {
    private static final long serialVersionUID = 1234567890l;
    static int age;
    static transient String faculty;

    String firstName;
    transient boolean examPassed;
}
class SeriazableStudent{
    public static void main(String[] args) {
        Student student = new Student();
        student.firstName = "Игорь";
        student.examPassed = true;
        student.age = 12;
        student.faculty = "nuridn";
    }
}