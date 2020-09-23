package ar.com.ada.online.second.sellingproducts;

import ar.com.ada.online.second.sellingproducts.wetakeoutaneyeonyou.Products;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Products> product = new ArrayList<Products>();///arreglo dinamico al estar fuera de main tiene que ser static y hay q importar la clase de ArrayList.
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        fillProducts();//llenar productos
        showResult();//mostrar resultado
    }
    //llenar poligono
    public static void fillProducts() {
        int option;
        char response;
        do {
            do {
                System.out.println("Digit that product wants to enter");
                System.out.println("1. Food");
                System.out.println("2. Clothes");
                System.out.println("3. Tools");
                System.out.println("4. Toys");
                System.out.print("Option: ");
                option = keyboard.nextInt();
            } while (option < 1 || option > 5);///solo ejecuta mientras que la opcion sea entre 1y 3
            switch (option) {
                case 1:
                    loadingFood();// cargar alimentos
                    break;
                case 2:
                    loadingClothes(); // cargar prendas
                    break;
                case 3:
                    loadingTools(); //cargar herramientas
                case 4:
                    loadingToys(); //cargar juguetes
                    break;
            }
            System.out.print("\nYou want to introduce another product(s/n: ");
            response = keyboard.next().charAt(0);///guarda solo un caracter, y declarmos la variable tipo char
            System.out.println("");
        } while (response == 's' || response == 'S');
    }



    //llenado de food
    public static void loadingFood() {
        int option;
        char response;
        do {
            do {
                int code1, code2, code3;
                System.out.print("\nEnter code 1");
                code1 = keyboard.nextInt();
                System.out.print("\nEnter code 2");
                code2 = keyboard.nextInt();
                System.out.print("\nEnter code 3");
                code3 = keyboard.nextInt();
                Food food = new Food(code1, code2, code3);//intanciar subclase Food
                //guardamos food en product
                product.add(food);
            } while (option < 1 || option > 4);///solo ejecuta mientras que la opcion sea entre 1y 3
            switch (option) {
                case 1:
                    System.out.print("\nEnter day:");
                    int day = keyboard.nextInt();
                    if (day == 1 || day == 4) {

                    }
                case 2:
                    loadingClothes(); // cargar prendas
                    break;
            } else{
                break;
            }
            case 3:
                loadingTools(); //cargar herramientas
            case 4:
                loadingToys(); //cargar juguetes
                break;
        }

            System.out.print("\nYou want to introduce another product(s/n: ");
            response = keyboard.next().charAt(0);///guarda solo un caracter, y declarmos la variable tipo char
            System.out.println("");
        } while (response == 's' || response == 'S');
    }




