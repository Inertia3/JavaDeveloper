
public class week507Throws {
    static int a = 10;
    static int b = 0;
    static int c = 5;

    public static void div() throws Exception{
        System.out.print("Inside div()-");
        int r = a/c;
        System.out.println(r);
    }

    public static void div1() throws Exception{
        System.out.print("Inside div1()");
        int r = a/b;
        System.out.println(r);
    }
    public static void main(String[] args) {
        try{
            System.out.println("Trying div()");
            div();
            System.out.println("Trying div1()");
            div1();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
