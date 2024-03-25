import java.util.ArrayList;

class Student{
    private String name;
    private int age;

    public Student(String  name, int age){
        this.name = name;
        this.age = age;
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String  name, int age){
        this.name = name;
        this.age = age;
    }
}


public class week519Generic {
    public static void main(String[] args) {
        Student st1 = new Student("Sahil Ansari", 20);
        Student st2 = new Student("Sameer Ansari", 18);

        Employee emp = new Employee("Ansh Kant", 18);

        ArrayList<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        // list.add(emp);
        //Because we have already implemented the type saftey of Student in our collection class ArrayList 
        // we cannot add employee object in that list 

    }
}
