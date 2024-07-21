package org.example;

public class DeiselEngine implements Engine{

    DeiselEngine()
    {
        System.out.println("DeiselEngine constructor...");
    }
    public int start() {
        System.out.println("Deisel Engine Start...");
        return 1;
    }
}
