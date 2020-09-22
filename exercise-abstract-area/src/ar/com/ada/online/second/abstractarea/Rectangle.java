package ar.com.ada.online.second.abstractarea;

import superclase.Poligono;

public class Rectangle extends Poligono {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        super();

        this.base = base;
        this.height = height;
    }

    public double getheightRectangle() {
        return height;
    }

    public double getbaseRectangle() {
        return base;
    }

    @Override
    public String toString() {
        return "Rectangle: "+
                "\nBase=" + base +
                ",\nHeight=" + height;
    }


    @Override
    public double area() {//met0do abstracto

        return base * height;
    }
}
