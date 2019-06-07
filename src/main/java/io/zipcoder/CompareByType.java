package io.zipcoder;

import java.util.Arrays;
import java.util.Comparator;

public class CompareByType implements Comparator<Pet>{

    public int compare(Pet o1, Pet o2) {
        if (o1.kind.compareTo(o2.kind) > 0) {return 1;}
        else if (o1.kind.compareTo(o2.kind) < 0) {return -1;}
        else {
            if (o1.name.compareTo(o2.name) > 0) {
                return 1;
            } else if (o1.name.compareTo(o2.name) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
