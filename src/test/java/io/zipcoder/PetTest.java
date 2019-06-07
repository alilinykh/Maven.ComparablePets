package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void compareToTest() {
        Pet p1 = new Cat("Zetta","cat");
        Pet p2 = new Dog("Alfa","dog");
        Pet p3 = new Cat("Alfa","cat");

        ArrayList <Pet> expected = new ArrayList<Pet>() {};
        expected.add(p2);
        expected.add(p3);
        expected.add(p1);

        ArrayList <Pet> actual = new ArrayList<Pet>() {};
        actual.add(p1);
        actual.add(p2);
        actual.add(p3);

        Collections.sort(actual);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void compareTest1() {
        Comparator<Pet> comparator = (Comparator<Pet>) new CompareByType();
        Pet p1 = new Cat(null, "cat");
        Pet p2 = new Dog(null,"dog");

        Integer comparisonValue = comparator.compare(p1,p2);
        Assert.assertTrue(comparisonValue < 0);
    }
}