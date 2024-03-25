// import java.util.*;
@FunctionalInterface
interface A{
    int init(int a);
}

interface B{
    void show();
}

interface C{
    int config(int a, int b);
}

public class week502Lambda {
    public static void main(String[] args) {
        B obj1 = () -> {
            System.out.println("Inside the lambda expression");
            System.out.println("Insode the anonymous class");
        };
        obj1.show();

        A obj = (int i) -> i*2;
        // if we have multiple bracket we do not neet to add brackets aswell
        System.out.println(obj.init(2));

        C obj2 = (x,y) ->{
            return x*y;
        };
        System.out.println(obj2.config(2, 3));        
    }
}
