package ar.com.ada.online.second.sellingproducts;

import ar.com.ada.online.second.sellingproducts.wetakeoutaneyeonyou.Products;

public class Food extends Products {

    private double code;
    private int day, cp;
    private double priced, totalPriced, totalsindesc;

    public Food() {

    }



    public Food( int day,double code,double price) {
        this.day=day;
        this.code = code;
        this.price=price;

    }


    public double getCode() {
        return code;
    }


    public double getPrice() {
        return price;
    }

    @Override
    public double Cprice() {//metodo abstracto
       /*if (day == 2 || day == 4) {
            cp = cp + 1;
            totalsindesc += price;
            priced = super.price - (price * 0.25);
            totalPriced += priced;
        } else {
            priced = super.price;
            totalPriced += priced;
            cp = cp + 1;
        }
        return null

        code + priced + +cp + +totalsindesc + +totalPriced;*/
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
