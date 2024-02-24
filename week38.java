

public class week38 {
    public static void main(String[] args) {
        week38SciCalc sc = new week38SciCalc();
        int a=sc.add(5,4);
        int b=sc.sub(9,3);
        int c=sc.mul(2,3);
        int d=sc.div(8,3);
        double e= sc.power(2,5);
        double f= sc.squareRoot(25);

        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
    }
}
