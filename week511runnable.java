class A{
    public void show(){
        for(int i=0; i<3; i++){
            System.out.println("Inside class A");
        }
    }
}
class B extends A implements Runnable{
    A obj = new A();
    public void run(){
        obj.show();
        System.out.println("Inside class B run() method");
    }
}
public class week511runnable {
    public static void main(String[] args) {
        B obj = new B();
        Runnable obj1 = new B();
        Thread t1 = new Thread(obj);
        t1.start();

        Thread t2 = new Thread(obj1);
        t2.start();
    }
}
