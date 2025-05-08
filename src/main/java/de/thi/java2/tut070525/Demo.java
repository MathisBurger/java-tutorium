package de.thi.java2.tut070525;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class Demo<T, E> {

    public T getSomething(E params) {
        return null;
    }

    public static void main(String[] args) {
        Demo<String, Boolean> demo1 = new Demo<String, Boolean>();
        Demo<Object, String> demo2 = new Demo<Object, String>();


        List<Notenblatt> list = new ArrayList();
        List<Object> list2 = new ArrayList();
        List<Sachtext> list3 = new ArrayList();

        Collection<Sachtext> collection = new ArrayList();
    }
}
