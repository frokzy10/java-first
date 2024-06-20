package calculatorTest;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int n1 = calculator.nextInt();
        System.out.println("Введите второе число: ");
        int n2 = calculator.nextInt();
        System.out.println("Введите единицу калькулятора!");
        char operator = calculator.next().charAt(0);

        if ('+' == operator) {
            System.out.println("Ответ: " + (n1 + n2));
        } else if ('-' == operator) {
            System.out.println("Ответ: " + (n1 - n2));
        } else if ('*' == operator) {
            System.out.println("Ответ: " + (n1 * n2));
        } else if ('/' == operator) {
            System.out.println("Ответ: " + (n1 / n2));
        } else {
            System.out.println("Непридвиденная ошибка. Выберите единицу калькулятора!");
        }
    }
}