package superclase;

public abstract class Poligono {
    protected int numberSides;

    public Poligono(int numberSides) {
        this.numberSides = numberSides;
    }

    public int getNumberSides() {
        return numberSides;
    }

    @Override
    public String toString() {
        return "Number the sides=" + numberSides ;
    }

    public abstract double area();

}
