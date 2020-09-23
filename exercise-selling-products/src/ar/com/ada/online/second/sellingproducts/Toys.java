package ar.com.ada.online.second.sellingproducts;

import ar.com.ada.online.second.sellingproducts.wetakeoutaneyeonyou.Products;

public class Toys extends Products {
    private double price;

    public Toys(double price) {
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "price=" + price +
                '}';
    }

    @Override
    public double Cprice() {
        return 0;
    }
}
