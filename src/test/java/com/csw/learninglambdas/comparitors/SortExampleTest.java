package com.csw.learninglambdas.comparitors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortExampleTest {

    static SortExample sortExample;
    static List<String> stringsToSort;

    @BeforeAll
    public static void init() {
        sortExample = new SortExample();
        stringsToSort = Arrays.asList("One", "Two", "Three", "Four", "Five");
    }

    @Test
    public void sortStringsTest() {
        List<String> strings = sortExample.sortStringsAlphabetically(stringsToSort);
        strings.forEach(System.out::println);
        assertEquals("Five", strings.get(0));
    }

    @Test
    public void sortStringsByLengthTest() {
        List<String> strings = sortExample.sortByStringLength(stringsToSort);
        strings.forEach(System.out::println);
        assertEquals("Three", strings.get(strings.size()-1));
    }

    @Test
    public void sortStringsByLengthUsingFunctionTest() {
        List<String> strings = sortExample.sortByFunctionLength(stringsToSort);
        strings.forEach(System.out::println);
        assertEquals("Three", strings.get(strings.size()-1));
    }


}