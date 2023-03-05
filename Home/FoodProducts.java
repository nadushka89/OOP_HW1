
public class FoodProducts extends Product{
    protected String expirationDate;
    public FoodProducts (String title, Double price, Integer quantity,String unit,String expirationDate){
        super(title, price, quantity, unit);
        this.expirationDate = expirationDate;
    }
    @Override
    public String toString() {
        return "Продукт питания: "  + title + 
                ", цена: " + price +" руб." +  
                ", количество: " + quantity  + " " + unit +
                ", срок годности: " + expirationDate ;
    }
}
