public class Lemonade extends Drinks {
    public Lemonade(String title, Double price, Integer quantity,String unit,Double volume){
        super(title, price, quantity, unit, volume);
    }
    @Override
    public String toString() {
        return "Лимонад "  + title + 
                ", цена: " + price +" руб." +  
                ", количество: " + quantity   + " " + unit +
                ", объем: " + volume;
    }
}
