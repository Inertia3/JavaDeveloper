class A{
    public void show(){
        System.out.println("Inside A");
    }
}
class B extends A{
    public void show(){
        System.out.println("Inside B");
    }
}

class C extends A{
    public void show(){
        System.out.println("Inside C");
    }
}



public class week41DMD{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        obj = new A();
        obj.show();

        obj = new C();
        obj.show();
    }
}