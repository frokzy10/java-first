package baseOfJava.serializableJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableJava {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/Users/nurdinbakytbekov/Desktop/ser.ser");
        ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);

        SerializableJava serializableJava = (SerializableJava) objInputStream.readObject();

        System.out.println(serializableJava);
    }
}
