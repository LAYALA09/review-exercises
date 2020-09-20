package sampleObjects;

public class Car implements Wheel{ //interfaz con Wheel
    public Car(){

    }


    @Override
    public void Advance() {///solo se declara los metodos
        System.out.println("El auto avanza");
    }

    @Override
    public void Stop() {
        System.out.println("El auto se detiene");

    }
}
