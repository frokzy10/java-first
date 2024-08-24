package baseOfJava.exceptionMethod;


import java.util.Arrays;
import java.util.List;

public class ExceptionMethod {
    void print(String s){
        if(s == null){
            throw new NullPointerException("Ошибка s равняется null");
        }
        System.out.println("Внтури метода print: " + s);
    }

    public static void main(String[] args) {
        ExceptionMethod method = new ExceptionMethod();
        List<String> list = Arrays.asList("первый шаг",null,"второй шаг");

        for(String s:list){
            try {
                method.print(s);
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
            }finally{
                System.out.println("блок пройден");
            }
        }
    }
}
