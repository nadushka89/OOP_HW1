public class ToiletPaper extends HygieneItems {
    protected Integer numberOfLayers;
    public ToiletPaper(String title, Double price, Integer quantity, String unit, Integer numberOfPieces,Integer numberOfLayers) {
        super(title, price, quantity, unit, numberOfPieces);
        this.numberOfLayers = numberOfLayers;
        
    }
    @Override
    public String toString() {
        return "Туалетная бумага " + title +
                ", цена: " + price +" руб. " +
                ", количество: " + quantity + " " + unit +
                ",  Количество в упаковке: " + numberOfPieces +
                ", Количество слоёв: " + numberOfLayers;
    }
}
