package ar.com.ada.online.second.abstractarea;

import superclase.Poligono;

import java.util.Objects;

public class Circle extends Poligono {

    private double area;
    private double radio;


    public Circle(double radio) {
        super(1);

        this.radio = radio;

    }

    public double getArea() {
        return area;
    }


    @Override
    public String toString() {
        return "Circle: " +
                "\nRadio=" + radio;
    }

    @Override
    public double area() {
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }


}
