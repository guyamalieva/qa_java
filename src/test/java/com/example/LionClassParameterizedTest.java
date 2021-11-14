package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionClassParameterizedTest {

    private final String sexLion;
    private final boolean expected;

    public LionClassParameterizedTest (String sexLion, boolean expected) {
        this.sexLion = sexLion;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void getLionMaleTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(sexLion, feline);
        assertEquals(expected, lion.doesHaveMane());
    }
}
