package baseOfJava.serializableJava;

import java.io.*;

public class TestSerial implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    TestSerial(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Человек{имя=" +
                name + " лет=" + age + "}";
    }
}

class Serial {
    public static void main(String[] args) {
        TestSerial human = new TestSerial("Нурдин", 15);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/nurdinbakytbekov/Desktop/person.ser"))) {
            oos.writeObject(human);

            System.out.println("Пользователь добавлен");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Deserial {
    public static void main(String[] args) {
        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("/Users/nurdinbakytbekov/Desktop/person.ser"))) {
            TestSerial humanDeserial = (TestSerial) oos.readObject();
            System.out.println(humanDeserial);
            System.out.println("Успешная десериализация");
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}