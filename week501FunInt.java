@FunctionalInterface
interface A{
    void show();
}

// class demo implements A{
//     public void show(){
//         System.out.println("functional Interface");
//     }
// }
public class week501FunInt {
    public static void main(String[] args) {
        // A obj = new demo();
        // obj.show();

        //anonymous class
        A obj = new A(){
            public void show(){
                System.out.println("Anonymous class");
            }
        };

        obj.show();
    }
}
