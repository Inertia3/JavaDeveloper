class A{
    int a = 10;
    static int b = 20;
    public void show(){
        System.out.println("Inside Outer-"+a);
    }
    static class B{
        public void config(){
            System.out.println("Inside Inner static class-"+b);
        }
        public void show1(){
            System.out.println("Inside inner method-"+b);
        }
    }
}
public class week46StaticInneer {
    public static void main(String[] args) {
        A.B obj = new A.B();
        // obj.show(); cannot be accessed as it is non static
        obj.config();
        obj.show1();
    }
}
