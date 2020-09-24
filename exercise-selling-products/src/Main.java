import ar.com.ada.online.second.sellingproducts.Food;
import ar.com.ada.online.second.sellingproducts.wetakeoutaneyeonyou.Products;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        ArrayList<Product> product = new ArrayList<>();
        loadingFood();//llenar productos
        showResult();//mostrar resultado
    }

    //llenar productos
    public static void fillProducts(ArrayList<Product> product) {
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
            } while (option < 1 || option > 5);///solo ejecuta mientras que la opcion sea entre 1y 4
            switch (option) {
                case 1:
                    loadingFood();// cargar alimentos  //FALTA ALGO
                    break;
                case 2:
                    // loadingClothes(); // cargar prendas
                    break;
                case 3:
                    // loadingTools(); //cargar herramientas
                case 4:
                    //loadingToys(); //cargar juguetes
                    break;
            }
            System.out.print("\nYou want to introduce another product(s/n: ");
            response = keyboard.next().charAt(0);///guarda solo un caracter, y declarmos la variable tipo char
            System.out.println("");
        } while (response == 's' || response == 'S');
    }


    //llenado de food
    public static void loadingFood(ArrayList<Product> product) {

        int day;
        int cp = 0;
        double code, price;
        double totalsindesc = 0;
        double priced = 0;
        double totalPriced = 0;
        System.out.print("\nEnter day");
        day = keyboard.nextInt();
        System.out.print("\nEnter code of the product");
        code = keyboard.nextDouble();
        System.out.print("\nEnter price of the product");
        price = keyboard.nextDouble();
        if (day == 2 || day == 4) {
            cp = cp + 1;
            totalsindesc += price;
            priced = price - (price * 0.25);
            totalPriced += priced;
        } else {
            priced = price;
            totalPriced += priced;
            cp = cp + 1;
        }
        Food food = new Food();//instancie clase Food


        //guardamos alimentos dentro de productos
        product.add(food);


    }


    public static void showResult(ArrayList<Product> product) { //metodo para mostrar resultados
        //recorriendo la lista de producto
        for (Product codi : product) {
            System.out.println(codi.toString());

            System.out.println("");
        }
    }
}






