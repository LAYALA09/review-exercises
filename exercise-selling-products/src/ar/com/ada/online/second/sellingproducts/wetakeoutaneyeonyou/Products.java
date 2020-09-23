package ar.com.ada.online.second.sellingproducts.wetakeoutaneyeonyou;

public  abstract class   Products {
    protected double price;
      public Products(){

      }

    public Products(double price) {
        this.price = price;
    }

    public  double getPrice() {
        return price;
    }
    public abstract double Cprice();//abstracto
}
