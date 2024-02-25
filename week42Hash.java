class Laptop{
    int price;
    String name;

    // public boolean equals(Laptop that){
    //     return(this.name.equals(that.name) && this.price == that.price);
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}

public class week42Hash {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.price = 10000;
        l1.name = "Sahil";

        Laptop l2 = new Laptop();
        l2.price = 10000;
        l2.name = "Sahil";

        boolean result = l1.equals(l2);
        System.out.println(result);
    }

}
