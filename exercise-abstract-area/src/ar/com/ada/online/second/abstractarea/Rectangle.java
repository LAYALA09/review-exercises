package ar.com.ada.online.second.abstractarea;

import superclase.Poligono;

public class Rectangle extends Poligono {
    private  double base;
    private double height;

    public Rectangle(double calculatearea, double base, double height) {
        super(calculatearea);
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
        return "Rectangle: "+super.toString()+
                "\nBase rectangle=" + base +
                ", Height rectangle=" + height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.base, base) == 0 &&
                Double.compare(rectangle.height, height) == 0;
    }



    @Override
    public double area() {//met0do abstracto

        return base*height;
    }
}
