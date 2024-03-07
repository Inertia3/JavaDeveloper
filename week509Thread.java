
class A extends Thread{
    public void run(){
        for(int i=0; i>-1; i++){
            System.out.println("HIIII");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int j=0; j>-1; j++){
            System.out.println("HELLO");
        }
    }
}

public class week509Thread {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        obj.start();
        obj1.start();
    }
}
