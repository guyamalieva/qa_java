package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineClassParameterizedTest {

    private final int kittensCount;
    private final int expected;

    public FelineClassParameterizedTest (int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }
    Feline feline = new Feline();

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][] {
                {1, 1},
                {0, 0},
                {-1, -1},
        };
    }
    @Test
    public void getKittensWithArgumentsTest() {
        int actual = feline.getKittens(kittensCount);
        assertEquals(expected, actual);
    }
}