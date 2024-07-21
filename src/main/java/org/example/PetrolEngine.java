package org.example;

public class PetrolEngine implements Engine {

    PetrolEngine()
    {
        System.out.println("Petrol engine constructor...");
    }

    public int start() {
        System.out.println("petrol engine start...");
        return 1;
    }
}
