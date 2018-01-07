package com.jdqm.headfirst.reference;


import java.lang.ref.*;

/**
 * Created by Jdqm on 2018-1-7.
 */
public class ReferenceTest {
    public static void main(String[] args) {
        //String strong = new String("Strong Reference");

        ReferenceQueue referenceQueue = new ReferenceQueue();
        /*SoftReference<Book> softReference = new SoftReference<>(new Book(), referenceQueue);
        Book book = softReference.get();
        System.out.println(book);
        WeakReference<Book> weakReference = new WeakReference(new Book(), referenceQueue);
        Book book1 = weakReference.get();
        System.out.println(book1);
        Reference reference = referenceQueue.poll();
        System.out.println(reference)*/;

        PhantomReference<Book> phantomReference = new PhantomReference<>(new Book(), referenceQueue);
        Book book = phantomReference.get(); //此值为null
        System.out.println(book);
        Reference reference = referenceQueue.poll();
        System.out.println(reference);
    }
}
