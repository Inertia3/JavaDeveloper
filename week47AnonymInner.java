class A{
    int a;
    public void show(){
        System.out.println("Inside the outer class-");
    }
}

public class week47AnonymInner {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("Inside the main public class-");
            }
        };
        obj.show();
    }
    //this class is called anonymous class because whenever we compile this code a class
    //file will be created in our folder week47AnonymInner$1.java
}
