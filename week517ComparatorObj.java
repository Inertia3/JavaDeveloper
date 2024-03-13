// By default sort works with Integers because 
// Integer implements something called comparable 
// so if we implement comparable with student we can 
// use the compareTo method aswell
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "Student [age="+age+", name=" +name+"]";
    }
}

public class week517ComparatorObj {
    public static void main(String[] args) {
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j){
                if(i.age>j.age)
                return 1;
                else
                return -1;
            }
        };
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(20, "Sahil Ansari"));
        list.add(new Student(18, "Sameer Ansari"));
        list.add(new Student(19, "Arshiya Rashid"));

        Collections.sort(list, com);
        // System.out.println(list);
        for(Student s :list ){
            System.out.println(s);
        }
    }
}