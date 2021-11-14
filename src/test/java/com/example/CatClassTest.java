package com.example;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
public class CatClassTest {

    @Test
    public void getSoundCat() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getFoodCat() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline); //объект для изоляции теста
        List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = cat.getFood();
        assertEquals(expectedFoodList, actualFoodList);
    }
}

