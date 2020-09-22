package superclase;

public abstract class Poligono {//superclase
    protected double calculatearea;

    public Poligono(double calculatearea) {
        this.calculatearea= calculatearea;
    }

    public double getarea() {
        return calculatearea;
    }

    @Override
    public String toString() {
        return "Area=" + calculatearea;
    }

    public abstract double area();///metodo abstracto

}
