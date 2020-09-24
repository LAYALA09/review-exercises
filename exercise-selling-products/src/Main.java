import ar.com.ada.online.second.sellingproducts.Food;
import ar.com.ada.online.second.sellingproducts.wetakeoutaneyeonyou.Products;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   // static ArrayList<Products> product = new ArrayList<Products>();///arreglo dinamico al estar fuera de main tiene que ser static y hay q importar la clase de ArrayList.
    static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        ArrayList<Products> products = new ArrayList<>();
       // products.loadingFood();//llenar productos
       // showResult();//mostrar resultado
    }

    //llenar productos
    public static void fillProducts(ArrayList<Products> products) {
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
                   // fillProducts.loadingFood();// cargar alimentos
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
    public static void loadingFood(ArrayList<Products> products) {
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
        cp = cp + 1;
        Food food = new Food();
        // Food food = new Food(code);
        // Food food1 = new Food(price);//intanciar subclase alimentos
        //guardamos alimentos dentro de productos
        //product.add(dia);
        products.add(food);
        //product.add(food1);

    }


    public static void showResult(ArrayList<Products> products) { //metodo para mostrar resultados
        //recorriendo el arreglo de producto
        for (Products codi : products) {
            System.out.println(codi.toString());
            System.out.println("Vista" + codi.Cprice());
            System.out.println("");
        }
    }
}






