package io.zipcoder;

public class Dog extends Pet {
    public Dog(String name, String kind) {
        super(name, kind);
    }
    @Override
    public String speak() {
        return "Bark Morning!";
    }
}
