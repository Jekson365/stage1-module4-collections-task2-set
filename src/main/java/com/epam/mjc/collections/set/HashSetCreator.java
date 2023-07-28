package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> h = new HashSet<>();

        for (int x : sourceList) {
            if (x % 2 == 0) {
                int value = x;
                while (value % 2 == 0) {
                    h.add(value);
                    value /= 2;
                }
            } else {
                h.add(x);
                h.add(2 * x);
            }
        }

        return h;
    }
}
