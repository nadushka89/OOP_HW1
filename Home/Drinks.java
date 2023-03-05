

public class Drinks extends Product{
    protected Double volume;
    public Drinks (String title, Double price, Integer quantity,String unit,Double volume2){
        super(title, price, quantity, unit);
        this.volume = volume2;
    }
    @Override
    public String toString() {
        return "Напитки " + title + 
                ", Цена: " + price +" руб." +  
                ", Количество: " + quantity  + " " + unit +
                ", Объем: " + volume;
    }
}
