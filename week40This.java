class A{
    A(){
        super();
        System.out.println("Inside A");
    }
    A(int a){
        super();
        System.out.println("Inside INT A");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("Inside B");
    }
    B(int b){
        this();
        System.out.println("Inside INT B");
    }
}

public class week40This {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}

