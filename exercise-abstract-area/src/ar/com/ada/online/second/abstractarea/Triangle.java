package ar.com.ada.online.second.abstractarea;

import superclase.Poligono;

public class Triangle extends Poligono {////hereda de Poligono
    private double basetriangle;
    private double heightTriangle;


    public Triangle(double baseTriangle, double heightTriangle) {
        super(3);

        this.basetriangle = baseTriangle;
        this.heightTriangle = heightTriangle;
    }

    public double getOneSide() {
        return basetriangle;
    }

    public double getSecondSide() {
        return heightTriangle;
    }


    @Override
    public String toString() {
        return "Triangle: "  +//llamo a la herencia con super
                "\nBase=" + basetriangle +
                "\nHeight=" + heightTriangle;


    }

    @Override
    public double area() {  //metodo abstracto

        return basetriangle * heightTriangle / 2;///aplico formula para calcular triangulo
    }

}
