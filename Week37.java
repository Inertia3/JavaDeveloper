class Anonymous{
    Anonymous(){
        System.out.println("Inside default constructor");
    }
    Anonymous(int a){
        System.out.println("Inside parmeterized constructor"+a);
    }
}
public class Week37 {
    public static void main(String[] args) {
        new Anonymous();
        new Anonymous(4);
    }
}
