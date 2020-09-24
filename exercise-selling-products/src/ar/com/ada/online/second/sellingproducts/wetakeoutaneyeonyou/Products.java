package ar.com.ada.online.second.sellingproducts.wetakeoutaneyeonyou;

public  abstract class   Product {
    protected double price;

      public Product(){

      }

    public Product(double price) {
        this.price = price;
    }

    public  double getPrice() {
        return price;
    }

    public abstract double Cprice();//abstracto
}
