package ar.com.ada.online.second.abstractarea;

import superclase.Poligono;

public class Triangle extends Poligono {
    private  double oneSide;
    private double secondSide;
    private double threeSide;

    public Triangle(double oneSide, double secondSide, double threeSide) {
        super(3);
        this.oneSide = oneSide;
        this.secondSide = secondSide;
        this.threeSide = threeSide;
    }

    public double getOneSide() {
        return oneSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThreeSide() {
        return threeSide;
    }

    @Override
    public String toString() {
        return "Triangle: " + super.toString()+
                "\noneSide=" + oneSide +
                ", secondSide=" + secondSide +
                ", threeSide=" + threeSide +
                ", numberSides=" + numberSides
                ;
    }

    @Override
    public double area() {  //metodo abstracto
        double p=(oneSide+secondSide+threeSide)/2;
        return Math.sqrt((p * (p - oneSide) * (p - secondSide) * (p - threeSide)));
    }

}
