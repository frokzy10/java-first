package baseOfJava.thisMethod;

public class ThisMethod {
    public static void main(String[] args) {
        Info info = new Info();
        info.display();

        MyClass myclass = new MyClass();
        System.out.println("class " + myclass.setX(10));
    }
}
class Info{
    public void display(){
        System.out.println("Me object class " + this);
    }
}
class MyClass {
    private int x;

    public MyClass setX(int x){
        this.x = x;
        return this;
    }
}