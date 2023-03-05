public class Masks  extends HygieneItems{

    public Masks(String title, Double price, Integer quantity, String unit, Integer numberOfPieces) {
        super(title, price, quantity, unit, numberOfPieces);
        
    }
    @Override
    public String toString() {
        return "Маска " + title + 
                ", цена: " + price +" руб." + 
                ", количество: " + quantity  + " " + unit +
                ",  Количество в упаковке: " + numberOfPieces; 
    }
}
