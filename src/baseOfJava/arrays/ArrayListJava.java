package baseOfJava.arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayListJava {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        String animal = animals.get(1);
        System.out.println(animal);
    }
}
