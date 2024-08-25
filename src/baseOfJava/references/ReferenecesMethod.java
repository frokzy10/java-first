package baseOfJava.references;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ReferenecesMethod {
    public static void main(String[] args) {
        Object obj = new Object();

//        SoftReference<Object> softReference = new SoftReference<>(obj);
        WeakReference<Object> weakReference = new WeakReference<>(obj);
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Object> phantomReference = new PhantomReference<>(obj,referenceQueue);

        obj = null;

        System.out.println("\nTry to call GC");
        System.gc();
        System.out.println("After call GC\n");

        System.out.println("Сильная сслыка: " + obj);
//        System.out.println("Мягкая ссылка: " + softReference.get());
        System.out.println("Слабая ссылка: " + weakReference.get());
        System.out.println("Фантомная ссылка: " + phantomReference.get());

        System.out.println("Очередь фантомной ссылка: " + referenceQueue.poll());
    }
}
