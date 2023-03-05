public class Diaper extends HygieneItems {
    protected Integer size;
    protected Integer minWeight;
    protected Integer maxWeight;
    public Diaper(String title, Double price, Integer quantity, String unit, Integer numberOfPieces,Integer size,Integer minWeight,Integer maxWeight) {
        super(title, price, quantity, unit, numberOfPieces);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    @Override
    public String toString() {
        return "Подгузник: " + title + 
                ", Цена: " + price +" руб." + 
                ", Количество: " + quantity  + " " + unit +
                ", Количество штук в упаковке: " + numberOfPieces +
                ", Размер: " + size +
                ", Минимальный вес: " + minWeight +
                ", Максимальный вес: " + maxWeight;
    }
}
