package ar.com.ada.online.second.abstractarea;

import superclase.Poligono;

import java.util.Objects;

public class Circle extends Poligono {
    private static double PI=3.14;
    private double area;
    private double radio;


    public Circle( double radio) {
        super(1);

        this.radio=radio;

    }

    public double getArea() {
        return area;
    }

    public static double getPI() {
        return PI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(area);
    }

    @Override
    public String toString() {
        return "Circle:" +super.toString()+
                "area=" + area ;
    }

    @Override
    public double area() {
        area=Math.PI * Math.pow(radio,2);
        return area;
    }


}
