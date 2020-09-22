package superclase;

public abstract class Poligono {//superclase
    protected double calculatearea;

    public Poligono(double calculatearea) {
        this.calculatearea= calculatearea;
    }

    public Poligono() {

    }

    public double getArea() {
        return calculatearea;
    }



    public abstract double area();///metodo abstracto

}
