package baseOfJava.classes;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введи что нибудь");
        String str = s.nextLine();
        System.out.println("Вы ввели " + str);
    }
}