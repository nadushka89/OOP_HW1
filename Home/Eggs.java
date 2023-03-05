public class Eggs extends FoodProducts {
    protected Integer quantityPackage;

    public Eggs(String title, Double price, Integer quantity, String unit, String expirationDate,Integer quantityPackage) {
        super(title, price, quantity, unit, expirationDate);
        this.quantityPackage = quantityPackage;
    }
    @Override
    public String toString() {
        return "Яйцо: " + title +
                ", Цена: " + price +" руб." + 
                ", Количество: " + quantity  + " " + unit +
                ", Срок годности: " + expirationDate +
                ", Количество в упаковке: " + quantityPackage;

    }

    
}
