
abstract class Computer{
    public abstract void code();

}


class Laptop extends Computer{
    public void code(){
        System.out.println("code.. compile.. Run.. using Laptop");
    }
}

class Dextop extends Computer{
    public void code(){
        System.out.println("Code.. Compile.. Run.. using Dextop");
    }
}

class Developer{
    public void devApps(Computer cmp){
        cmp.code();
    }
}
public class week49NeedInterfa {
    public static void main(String[] args) {
        Computer c1 = new Laptop();
        Computer c2 = new Dextop();
        // Laptop l1 = new Laptop();
        Developer d1 = new Developer();

        d1.devApps(c1);
        d1.devApps(c2);
    }
}
