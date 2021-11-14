package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class FelineClassTest {

    @Test
    public void getEatMeatFeline() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = feline.getFood("Хищник");
        assertEquals(expectedFoodList, actualFoodList);
    }

    @Test
    public void getFamilyFeline() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensCountFeline() {
        Feline feline = new Feline();
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        assertEquals(expectedCount, actualCount);
    }
}