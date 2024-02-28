interface A{
    // variable must be final or static
    int age = 20;
    void init();
    void config(); 
}

class Git implements A{
    public void init(){
        System.out.println("Initializing git repository");
    }

    public void config(){
        System.out.println("Configuring the path");
    }
}
public class week410Interface {
    // we can create the reference of abstract class and 
    // interfaces but we cannot create their objects

    public static void main(String[] args) {
        A obj = new Git();
        obj.init();
        obj.config();
        System.out.println(obj.age);
        System.out.println(A.age);
    }
}
