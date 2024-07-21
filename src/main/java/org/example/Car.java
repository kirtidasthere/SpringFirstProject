package org.example;

public class Car {
    Engine engine;

    Car()
    {
        System.out.println("Car constructor...");
    }
    public void setEngine(Engine engine) {
        System.out.println("Car setter Method...");
        this.engine = engine;
    }

    public void Drive()
    {
        int res=engine.start();
        if(res>=1)
        {
            System.out.println("Car Started with good engine...");
        }
        else
        {
            System.out.println("engine not working...");
        }
    }
}
