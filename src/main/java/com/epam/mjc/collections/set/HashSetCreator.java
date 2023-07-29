package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultSet = new HashSet<>();

        for (int element : sourceList) {
            if (element % 2 == 0) {
                int temp = element;
                while (temp % 2 == 0) {
                    resultSet.add(temp);
                    temp /= 2;
                }
            } else {
                resultSet.add(element);
                resultSet.add(element * 2);
            }
        }

        return resultSet;
    }
}
