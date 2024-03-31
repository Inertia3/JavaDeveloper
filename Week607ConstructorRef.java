import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int age;

    // constructors
    public Student() {
    }
    public Student(String name) {
        this.name = name;
        // this.age = age;
    }
    // getters and setteres
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
}

public class Week607ConstructorRef {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Sahil", "Ansari", "Arshiya", "Raashid");
        // List<Integer> age = Arrays.asList(21,999,19,999);

        // creating array of students witha name and age
        List<Student> st = new ArrayList<>();
        // int i = 0;
        // while(i< Math.max(name.size(), age.size())){
        //     st.add(new Student(name.get(i), age.get(i)));
        //     i++;
        // }
        // System.out.println(st);
        
        for(String names : name){
            st.add(new Student(names));
        }
        // System.out.println(st);
        st = name.stream()
                .map(n -> new Student(n))
                .toList();
        // System.out.println(st);

        st = name.stream()
        .map(Student::new)
        .toList();
        System.out.println(st);
    }
}
