package ar.com.ada.online.second.sellingproducts;

import ar.com.ada.online.second.sellingproducts.wetakeoutaneyeonyou.Products;

public class Food extends Product {

    private double code;
    private int day, cp;
    private double priced, totalPriced, totalsindesc;

    public Food() {

    }


    public Food(int day, double code, double price) {
        this.day = day;
        this.code = code;
        this.price = price;

    }


    public double getCode() {
        return code;
    }


    public double getPrice() {
        return price;
    }

    @Override
    public double Cprice() {//metodo abstracto

        return price;
    }

    @Override
    public String toString() {
        return "Tienda te saco un ojo" +
                "\nCod:" + code +
                "\nPrice=" + priced +
                "\nCantidad de productos:" + cp +
                "\nTotal sin descuento" + totalsindesc +
                "\nTotal a pagar" + totalPriced;

    }

}
