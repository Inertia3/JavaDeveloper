
class A extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("HIIII");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int j=0; j<10; j++){
            System.out.println("HELLO");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class week510ThreadMeth {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        System.out.println(obj.getPriority());
        obj.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        obj1.start();
    }
}
