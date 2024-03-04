enum Laptop{
    Mac(2000), XPS(2200), Rog(1500);

    private int price;

    private Laptop(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class week415Enum {
    public static void main(String[] args) {
        Laptop[] l1 = Laptop.values();

        for(Laptop l2 : l1){
            System.out.println(l2+" "+l2.getPrice());
        }
    }
}
