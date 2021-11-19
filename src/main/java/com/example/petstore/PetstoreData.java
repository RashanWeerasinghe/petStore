package com.example.petstore;

import java.util.ArrayList;
import java.util.List;


public class PetstoreData {
    private static PetstoreData myInstance;

    List<Pet> pets = new ArrayList<Pet>();
    Pet pet1 = new Pet();
    Pet pet2 = new Pet();
    Pet pet3 = new Pet();
    private PetstoreData(){
        pet1.setPetId(1);
        pet1.setPetAge(3);
        pet1.setPetName("Boola");
        pet1.setPetType("Dog");


        pet2.setPetId(2);
        pet2.setPetAge(4);
        pet2.setPetName("Sudda");
        pet2.setPetType("Cat");


        pet3.setPetId(3);
        pet3.setPetAge(2);
        pet3.setPetName("Peththappu");
        pet3.setPetType("Bird");

        pets.add(pet1);
        pets.add(pet2);
        pets.add(pet3);
    }





    public static PetstoreData getInstance() {
        if (myInstance == null) {
            myInstance = new PetstoreData();
        }
        return myInstance;
    }
    public void setArrayList(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Pet> getArrayList() {
        return this.pets;
    }

}
