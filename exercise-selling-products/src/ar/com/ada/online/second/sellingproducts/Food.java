package ar.com.ada.online.second.sellingproducts;

import ar.com.ada.online.second.sellingproducts.wetakeoutaneyeonyou.Products;

public class Food extends Products {
    private double price;
    private int code1;
    private int code2;
    private int code3;


    public Food(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double Cprice() {
        return 0;
    }

    @Override
    public String toString() {
        return "Food{" +
                "price=" + price +
                '}';
    }

}
