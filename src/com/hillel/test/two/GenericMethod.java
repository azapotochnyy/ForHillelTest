package com.hillel.test.two;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by A.Zapotochnyy on 28.03.2018.
 */
//Task№2
public class GenericMethod {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        String[] array = new String[2];
        array[0] = "Amigo";
        array[1] = "Jose";

        fromArrayToCollection(array, list);

    }

    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o);
        }

    }

}
