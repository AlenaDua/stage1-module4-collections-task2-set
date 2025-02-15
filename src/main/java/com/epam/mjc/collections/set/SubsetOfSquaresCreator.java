package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;
public class SubsetOfSquaresCreator {
    public NavigableSet<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squareSet = new TreeSet<>();
        for (int x : sourceList) {
            squareSet.add(x*x);
        }
        return squareSet.subSet(lowerBound,true,upperBound,true);}
}
