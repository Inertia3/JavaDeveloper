class Student<T>{  
    // <T> means This class can work on any type of data 
    // Based on the type safety declared during the object creation 
    // of the class 
    T obj;

    Student(T obj){
        this.obj = obj;
    }

    public void display(){
        System.out.println("Type of data passes here T : "+obj.getClass().getName());
    }
    public T getObj(){
        return obj;
    }
}

public class week520Generic {
    public static void main(String[] args) {
        Student<Integer> st1 = new Student<>(10);
        st1.display();
        System.out.println(st1.getObj());

        Student<String> st2 = new Student<>("Sahil Ansari");
        st2.display();
        System.out.println(st2.getObj());
    }
}
