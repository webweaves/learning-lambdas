package com.csw.learninglambdas.comparitors;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class SortExample {

    public List<String> sortStringsAlphabetically(List<String> stringsToSort) {
        Comparator<String> comparator = (c1, c2) -> c1.compareTo(c2);
        stringsToSort.sort(comparator);

        //below is the equivalent of the comparator above
        Comparator<String> comparator2 = String::compareTo;
        Comparator<String> comparator3 = Comparator.naturalOrder();

        return stringsToSort;
    }

    public List<String> sortByStringLength(List<String> stringsToSort) {
        Comparator<String> comparator = (c1, c2) -> Integer.compare(c1.length(), c2.length());
        stringsToSort.sort(comparator);

        //below is the equivalent of the comparator above
        Comparator<String> comparator2 = Comparator.comparingInt(String::length);

        return stringsToSort;
    }

    public List<String> sortByFunctionLength(List<String> stringsToSort) {
        Function<String, Integer> lengthFunction = string -> string.length();
        Comparator<String> comparator = Comparator.comparing(lengthFunction);
        stringsToSort.sort(comparator);
        return stringsToSort;
    }
}
