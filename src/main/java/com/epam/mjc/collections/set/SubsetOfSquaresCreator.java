package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squaresSet = new TreeSet<>();

        for (Integer num : sourceList) {
            int square = num * num;
            squaresSet.add(square);
        }

        SortedSet<Integer> subset = squaresSet.subSet(lowerBound, true, upperBound + 1, false);

        return new HashSet<>(subset);
    }
}
