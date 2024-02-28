class A{
    int a;
    public void show(){
        System.out.println("Inside A ");
    }
    class B{
        public void config(){
            System.out.println("Inside B");
        }
    }
}

public class week45Inner {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        // obj.config();  cannot call config using obj of A

        A.B obj1 = obj.new B();
        obj1.config();

    }
}
