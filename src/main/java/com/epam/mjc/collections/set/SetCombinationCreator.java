package com.epam.mjc.collections.set;
import java.util.HashSet;
import java.util.Set;
public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> resultSet = new HashSet<>(thirdSet);
        resultSet.removeAll(firstSet);
        resultSet.removeAll(secondSet);


        Set<String> firstAndSecondNotThird = new HashSet<>(firstSet);
        firstAndSecondNotThird.retainAll(secondSet);
        firstAndSecondNotThird.removeAll(thirdSet);

        resultSet.addAll(firstAndSecondNotThird);

        return resultSet;
    }
}




