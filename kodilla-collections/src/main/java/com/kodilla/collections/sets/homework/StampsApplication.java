package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Apple", 4, 5, true));
        stamps.add(new Stamp("Egg", 2,4, true));
        stamps.add(new Stamp("Man", 4, 4, false));
        stamps.add(new Stamp("Apple", 1, 5, true));
        stamps.add(new Stamp("Flower", 3, 5, false));
        stamps.add(new Stamp("Castle", 3, 4, true));
        stamps.add(new Stamp("Egg", 2, 4, false));
        stamps.add(new Stamp("Egg", 2, 4, false));
        stamps.add(new Stamp("Egg", 2, 4, false));
        stamps.add(new Stamp("Egg", 2, 4, false));
        stamps.add(new Stamp("Egg", 2, 4, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
