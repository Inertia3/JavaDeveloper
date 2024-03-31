class Student{
    private int id;
    private String name;
    private int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }  
}

public class Week610IO {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Arshiya Rashid", 19);

        System.out.println(s1);

        Student s2 = new Student(2, "Sahil Ansari", 21);
        System.out.println(s2);
    }   
}
