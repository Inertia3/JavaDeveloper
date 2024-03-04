interface A{
    public void config();
}

interface B{
    public void init();
}

interface C extends B{
    public void show();
}

class MultiInterface implements A, C{
    public void config(){
        System.out.println("Configuring the git repo");
    }

    public void init(){
        System.out.println("Initializing the git commands");
    }

    public void show(){
        System.out.println("Showing the added files");
    }
}
public class week411Interface {
    public static void main(String[] args) {
        C obj = new MultiInterface();
        // obj.config();  cannot call
        obj.init();
        obj.show();

        A obj1 = new MultiInterface();
        obj1.config();

    
    }
}
