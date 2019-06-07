package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class PetHandler {
    private Integer numPets;
    private String name = "";
    private String kind = "";
    private ArrayList<Pet> pets = new ArrayList<Pet>();
    Scanner sc = new Scanner(System.in);


    public Integer getNumPets () {
        System.out.println("Please enter num of pets");
        numPets = sc.nextInt();
        return numPets;
    }

    public void getPetInfo(Integer numPets) {
        System.out.println("Please, enter information about each pet you have");
        for (int i = 0; i < numPets; i++) {
            this.name = getName();
            this.kind = getKind();
            addPet(name, kind);
            sc.close();
        }
    }
    public void addPet (String name, String kind) {

        switch (kind.toUpperCase().charAt(0)) {
            case 'D': {pets.add(new Dog(name, kind));break;}
            case 'C': {pets.add(new Cat(name, kind));break;}
            case 'P': {pets.add(new Panda(name, kind));break;}
            default:
                System.out.println("Please Keep you imagine pets inside your head");
        }
    }
    public String printPets () {
        String result = "";
        for (Pet p: pets
             ) {
            result += p.kind + " named " + p.name + " says " + p.speak();
        }
        return result;
    }
    public String getName() {
        System.out.println("Enter pet's name: ");
        sc.nextLine();
        return sc.nextLine();
    }
    public String getKind () {
        System.out.println("Enter kind of animal: ");
        return sc.nextLine();

    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
}
