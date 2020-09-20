package sampleObjects;

public class Bicycle implements Wheel,Chair{ //indico a que interfaces voy a implementar
    public Bicycle() {
    }

    @Override
    public void Advance() {//metodo de interface Wheel
        System.out.println("La bicicleta  avanza");
    }

    @Override
    public void Stop() {//metodo de interface Wheel
        System.out.println("El bicicleta se detiene");

    }
    public void sitDown() { //metodo de interface Chair
        System.out.println("Puedes sentarte por favor");

    }
}

