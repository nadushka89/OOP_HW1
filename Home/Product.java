

public class Product {
    protected String title;
    protected Double price;
    protected Integer quantity;
    protected String unit;
   
    public Product(String title, Double price, Integer quantity,String unit){
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

      @Override
    public String toString() {
        return "Продукт питания " + title +
        ", цена '" + price +" руб." +
        ", количество " + quantity + " " + unit;
    }
}
