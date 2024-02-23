class Mobile{
    static String brand;
    int price;
    String name;

    public static void show(Mobile m){
        System.out.println("Brand : "+brand+" Price : "+m.price+" Name : "+m.name);
        // so here brand is common for all the object but 
        // name and price is different for different objects
        // so if we call Mobile.show() how can we differentiate
        // which price and which name we want 
        // to eliminate this error we can pass object reference
    }
}

public class week32 {
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

        Mobile.show(m1);
        Mobile.show(m2);
        Mobile.show(m3);
    }
}
