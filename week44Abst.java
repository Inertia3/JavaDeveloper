abstract class Animal{
    public abstract void sound();
    public abstract void legs();
    public void multiCellular(String str){
        System.out.println(str+" is a multi cellular organism");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
    public void legs(){
        System.out.println("A dog have 4 legs");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("Cat Meaows");
    }
    public void legs(){
        System.out.println("A cat have 4 legs");
    }
}
public class week44Abst {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.sound();
        dg.legs();
        dg.multiCellular("Dog");

        Cat ct = new Cat();
        ct.sound();
        ct.legs();
        ct.multiCellular("Cat");
    }
}
