abstract class A{
    public void config(){
        System.out.println("Inside the abstract class config function");
    }

    public void init(){
        System.out.println("Inside the abstrsct class init function");
    }
}

public class week48AbstInner {
    public static void main(String[] args) {
        A obj = new A() {
            public void config(){
                System.out.println("Inside the anonymous class config");
            }
            public void init(){
                System.out.println("Inside the anonymous class init");
            }
        };
        obj.config();
        obj.init();
    }
}
