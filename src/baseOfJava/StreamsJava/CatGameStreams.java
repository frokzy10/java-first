package baseOfJava.StreamsJava;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CatGameStreams {
    public static void main(String[] args) {
        System.out.println("Консоль для боя котиков");

        List<Cat> catThread = new ArrayList<>();
        int life = 9;

        Collections.addAll(catThread,
                new Cat("Tom", life, "Thread tom"),
                new Cat("Clecatra", life, "Clecatra thread"),
                new Cat("Toodles", life, "Toodles thread"),
                new Cat("Dupli", life, "Dupli thread"));

        for(Cat cat :catThread)
            cat.getThread().start();

        for(Cat cat : catThread){
            try {
                cat.getThread().join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(String.format("кот пободитель: %s!!!.",Cat.cats.get(0)));
    }
}

class Cat implements Runnable {
    public static final List<Cat> cats = new CopyOnWriteArrayList<>();

    private String name;
    private volatile int life;
    private Thread thread;

    public Cat(String name, int life, String threadName) {
        this.name = name;
        this.life = life;
        Cat.cats.add(this);
        thread = new Thread(this, threadName);

        System.out.println(String.format("Кот %s создан. HP: %d", this.name, this.life));
    }

    public static synchronized void attack(Cat thisCat,Cat enemyCat){
//        если нету жизней не начинай процесс
        if(thisCat.getLife() <= 0) {return;}

        if(enemyCat.getLife() > 0){
            enemyCat.decrementlife();
            System.out.println(String.format("Кот %s атаковал кота %s . жизни &<s: %d",thisCat.getName(),enemyCat.getName(),enemyCat.getLife()));
//            если у котенка нет жизней
            if(enemyCat.getLife() <= 0){
                Cat.cats.remove(enemyCat);

                System.out.println(String.format("Кот %s покидает бой.",enemyCat.getName()));
                System.out.println(String.format("Оставшиеся коты: %s",Cat.cats));
                System.out.println(String.format("%s завершает свою работу.",enemyCat.getThread().getName()));
                enemyCat.getThread().interrupt();
            }
        }
    }

    private Cat getRandomEnemyCat(Cat deleteThisCat){
        List<Cat> copyCats = new ArrayList<>(Cat.cats);
        copyCats.remove(deleteThisCat);

        return copyCats.get(new Random().nextInt(copyCats.size()));
    }

//    метод декремента жизней
    public synchronized void decrementlife() {
        life--;
    }

    @Override
    public String toString(){return name;}
//    getters,setters
    public String getName() {return name;}
    public int getLife() {return life;}
    public Thread getThread() {return thread;}

    @Override
    public void run() {
        System.out.println(String.format("Кот %s идет в бой.",name));
        while(Cat.cats.size() > 1){
            Cat.attack(this,getRandomEnemyCat(this));
        }
    }
}