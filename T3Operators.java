public class T3Operators {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        // assign first and then increment
        int a = x++;
        System.out.println(a);
        // increment first and then assign
        int b = ++y;
        System.out.println(b);
    }
}
