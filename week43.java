class Animal{
    void sound1(){
        System.out.println("Animal makes Sound");
    }
}

class Dog extends Animal{
    void sound2(){
        System.out.println("Dog Barks");
    }
}
public class week43 {
    public static void main(String[] args) throws Exception{
        // upcasting
        Animal a = (Animal)new Dog();
        a.sound1();
        // a.sound2();

        //downcasting
        Dog d = (Dog)a;
        d.sound1();
        d.sound2();
    }
}
