public class HygieneItems extends Product {
    protected Integer numberOfPieces;
    public HygieneItems (String title, Double price, Integer quantity,String unit,Integer numberOfPieces){
        super(title, price, quantity, unit);
        this.numberOfPieces = numberOfPieces;
    }
    @Override
    public String toString() {
        return "Предметы гигиены" + title + 
                ", цена: " + price +" руб." +  
                ", количество: " + quantity  + " " + unit +
                ", Количество в упаковке: " + numberOfPieces;
    }
    
}
