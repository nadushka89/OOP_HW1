public class Nipple extends ChildrenProducts {

    public Nipple(String title, Double price, Integer quantity, String unit, Integer minimumAge,
            String hypoallergenic) {
        super(title, price, quantity, unit, minimumAge, hypoallergenic);
        
    }
    @Override
    public String toString() {
        return "Соска " + title + 
                ", цена: " + price +" руб. " +  
                ", количество: " + quantity + " "+ unit +
                ", Минимальный возраст: " + minimumAge +
                ", Гипоаллергенность: " + hypoallergenic;
    }
    
}
