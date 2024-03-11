class sharedVariable{
    int cnt;
    public void increment(){
        cnt = cnt+1;
    }
}
public class week512RaceThread {
    public static void main(String[] args) throws InterruptedException {
        sharedVariable sv = new sharedVariable();

        Runnable obj1 = () -> {
            for(int i=0; i<100; i++){
                sv.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int j=0; j<100; j++){
                sv.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sv.cnt);
    }
}
