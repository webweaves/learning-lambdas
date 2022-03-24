package com.csw.learninglambdas.collect;

import com.csw.learninglambdas.util.SimplePersonFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedCollectTest {

    @Test
    void groupByCountryAndTotalAges() {
        assertTrue(new AdvancedCollect()
                .groupByCountryAndTotalAges(SimplePersonFactory
                        .createPeople())
                .toString().contains("Wales=52")
        );
    }
}