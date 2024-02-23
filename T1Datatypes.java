
class T1Datatypes{
    public static void main(String[] args) {
        int num = 8;   
        byte num1 = 10;
        short num2 = 4;
        long num3 = 54345l;
        double num4 = 54.54;   // in java the float values are by default double because of double provide more precesion
        float num5 = 3435.34f; // so to we have to declare the float value explicitly 
        char c = 'c';          // size of character is of two byytes because java support unicode
                               // we can even increment and decrement characters in java 
        boolean b = true;
        System.out.println(num+" "+num1+" "+num2+" "+num3+" "+num4+ ""+num5+" "+c+" "+b);
    }
}