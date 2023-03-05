
public class Milk extends FoodProducts {
    protected Double percentageOfFatContent;
    
    public Milk  (String title, Double price, Integer quantity,String unit, Double percentageOfFatContent,String expirationDate){
        super (title, price, quantity,unit,expirationDate);
        this.percentageOfFatContent = percentageOfFatContent;
    }
    @Override
    public String toString() {
        return "Молоко: " + title + 
                ", цена: " + price +" руб. " + 
                ", количество: " + quantity  + " " + unit +
                ", Срок годности: " + expirationDate +
                ", Процент жирности: " + percentageOfFatContent;
    }
}
