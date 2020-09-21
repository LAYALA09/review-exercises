package ar.com.ada.online.second.abstractarea;

import superclase.Poligono;

public class Rectangle extends Poligono {
    private  double oneSide;
    private double secondSide;

    public Rectangle( double oneSide, double secondSide) {
        super(2);
        this.oneSide = oneSide;
        this.secondSide = secondSide;

    }

    public double getOneSide() {
        return oneSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public String toString() {
        return "Rectangle: " + super.toString()+
                "\noneSide=" + oneSide +
                ", secondSide=" + secondSide ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.oneSide, oneSide) == 0 &&
                Double.compare(rectangle.secondSide, secondSide) == 0;
    }



    @Override
    public double area() {//met0do abstracto

        return oneSide*secondSide;
    }
}
