package ar.com.ada.online.second.sellingproducts;

import ar.com.ada.online.second.sellingproducts.wetakeoutaneyeonyou.Products;

public class Clothes extends Product {
    private double price;

    public Clothes(double price) {
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
        return "Clothes{" +
                "price=" + price +
                '}';
    }
}
