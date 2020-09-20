package sampleObjects;

public class Main {

    public static void main(String[] args) {
	Car c=new Car();//esta clase instancio interfaz Wheel
	Bicycle b= new Bicycle();//esta  clase instancio interfaz Wheel y Chair con metodos Advance y sitDown

	c.Advance();
	b.Advance();
	b.sitDown();

    }
}
