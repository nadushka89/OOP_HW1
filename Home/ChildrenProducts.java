public class ChildrenProducts extends Product {
    protected Integer minimumAge;
    protected String hypoallergenic;
    public ChildrenProducts (String title, Double price, Integer quantity,String unit,Integer minimumAge, String hypoallergenic){
        super(title, price, quantity, unit);
        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
    }
    @Override
    public String toString() {
        return "Детский товар: " + title + 
                ", Цена: " + price + " руб." + 
                ", Количество: " + quantity  + " " + unit +
                ", Минимальный возраст: " + minimumAge +
                ", Гипоаллергенность: " + hypoallergenic ;
    }
    
}
