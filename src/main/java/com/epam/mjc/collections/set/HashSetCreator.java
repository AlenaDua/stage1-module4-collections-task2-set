package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (int element : sourceList) {
            if (element % 2 == 0) {
                int twoDividedElement = element;
                result.add(twoDividedElement);
                while (twoDividedElement > 0 && twoDividedElement / 2 > 0) {
                    twoDividedElement /= 2;
                    result.add(twoDividedElement);
                }
            } else {
                result.add(element);
                result.add(2 * element);
            }
        }
        return result;
    }
}