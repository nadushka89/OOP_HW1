public class Bread extends FoodProducts {
    protected String typeOfFlour;

    public Bread(String title, Double price, Integer quantity, String unit, String expirationDate,String typeOfFlour) {
        super(title, price, quantity, unit, expirationDate);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return "Хлеб:  " + title +
                ", Цена: " + price +" руб."  +
                ", Количество: " + quantity  + " " + unit +
                ", Срок годности: " + expirationDate +
                ", Тип муки: " + typeOfFlour;

    }
}
