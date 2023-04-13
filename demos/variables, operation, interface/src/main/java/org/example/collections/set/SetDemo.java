package org.example.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(){

            Set<Integer> set = new HashSet<>();

            set.add(1);
        set.add(22);
        set.add(30);
        set.add(4);
        set.add(5);
        set.add(6);


        System.out.println(set);
    }
}
