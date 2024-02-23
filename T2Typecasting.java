public class T2Typecasting {
    public static void main(String[] args) {
        int a = 28;
        System.out.println(a);
        byte b = 25;
        System.out.println(b);
        byte c = (byte)a;
        System.out.println(c);
        // we can convert a byte to a integer with no issue because integer has higer range than byte
        // but the in case of the vice versa there might be a data loss
        // for example let's say we have int a = 257; and byte b; if we want to store int into byte if it 
        // goes out of its range then it will do a modulo operation by its range and then stor it;
        // ex b = (byte)a;   257%256 = 1 => b = 1;
        int d = 257;
        byte e = (byte)d;
        System.out.println(e);

        float f = 345.454f;
        int g = (int)f;
        System.out.println(g);

        // Type promotion 
        // so lets say we have byte a = 10; and byte b = 30;
        // The multiplication of a*b goes out of the byte range so java implicitly promet the the value to next big data type
        // int result = a*b;
        byte x = 10;
        byte y = 20;
        int res = x*y;
        System.out.println(res);
     }
}
