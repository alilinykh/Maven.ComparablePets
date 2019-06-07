package io.zipcoder;

public class Cat extends Pet {
    public Cat(String name, String kind) {
        super(name, kind);
    }

    public Cat() {
        name = "nameCat";
        kind = "kindCat";
    }

    //@Override
    public String speak() {
        return "Bonjour";
    }
}
