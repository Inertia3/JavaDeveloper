class Mobile{
    static String brand;
    int price;
    String name;

    public void show(){
        System.out.println("Brand : "+brand+" Price : "+price+" Name : "+name);
    }
}
public class week31 {
    public static void main(String[] args) {
        Mobile.brand = "Samsung";
        Mobile m1 = new Mobile();
        m1.name = "A14"; 
        m1.price = 14000;

        Mobile m2 = new Mobile();
        m2.name = "S22"; 
        m2.price = 1400000;

        Mobile m3 = new Mobile();
        m3.name = "S23"; 
        m3.price = 1900000;

        m1.show();
        m2.show();
        m3.show();
    }
}
