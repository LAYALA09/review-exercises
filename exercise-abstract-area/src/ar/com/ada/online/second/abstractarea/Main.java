package ar.com.ada.online.second.abstractarea;




import superclase.Poligono;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();///arreglo dinamico al estar fuera de main tiene que ser static y hay q importar la clase de ArrayList.
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        fillPolygon();//llenar poligono
        showResult();//mostrar resultado

    }
//llenar poligono
    public static void fillPolygon(){
        int option;
        char response;
        do {
            do {
                System.out.println("Digitize what polygon you want");
                System.out.println("1. Triangle");
                System.out.println("2. Rectangle");
                System.out.println("3. Circle");
                System.out.print("Option: ");
                option = keyboard.nextInt();

            } while (option < 1 || option > 3);
            switch (option) {
                case 1:
                    fullOfTriangle();// llenar triangulo
                    break;
                case 2:
                    fullOfRectangle(); // llenar rectangulo
                    break;
                case 3:
                    fullOfCircule(); //llenar circulo
                break;
            }
            System.out.print("\nYou want to introduce another poligono(s/n: ");
            response = keyboard.next().charAt(0);///guarda solo un caracter, y declarmos la variable tipo char

            System.out.println("");

        } while (response == 's' || response == 'S');


    }
    //llenado de triangulo
    public static void fullOfTriangle() {
        double side1, side2, side3;
        side1 = keyboard.nextDouble();
        System.out.print("\nType the side 2 triangle");
        side2 = keyboard.nextDouble();
        System.out.print("\nType the side 3 triangle ");
        side3 = keyboard.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);//intanciar subclase Triangle
        //guardamos un triangulo dentro de poligono
        poligono.add(triangle);
    }
    //llenado de rectangulo
    public static void fullOfRectangle() {
        double side1, side2;
        System.out.print("\nType the side 1 rectangle ");
        side1= keyboard.nextDouble();
        System.out.print("\nType the side 2 rectangle");
        side2 = keyboard.nextDouble();

        Rectangle rectangle=new Rectangle(side1,side2);//intanciar subclase Rectangle
        //guardamos un rectangulo dentro de poligono
        poligono.add(rectangle);
    }
    //llenado de circulo
    public static void fullOfCircule() {
        double radio,area;

        System.out.print("\nType radio ");
        radio = keyboard.nextDouble();


        Circle circle = new Circle(radio);//intanciar subclase Circle
        //guardamos un rectangulo dentro de poligono
        poligono.add(circle);
    }
    public static void showResult() { //metodo para mostrar resultados
        //recorriendo el arreglo de poligono
        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("Area =  " + poli.area());
            System.out.println("");
        }
    }

        }

