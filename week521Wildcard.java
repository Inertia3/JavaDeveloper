
import java.util.ArrayList;
class Teacher{
    public void show(){
        System.out.println("This is a teacher type class");
    }
}

class Student extends Teacher{
    public void show(){
        System.out.println("This is a student type class");
    }
}

public class week521Wildcard {
    public static void main(String[] args) {
        Student st1 = new Student();
        Teacher te1 = new Teacher();

        // ArrayList<Student> sl1 = new ArrayList<>();
        // ArrayList<Student> sl2 = new ArrayList<>();
        // sl1 = sl2;
        // ArrayList<Teacher> t1 = new ArrayList<>();
        // sl1 = t1;
        // This doesn't works (sl1 = t1) and this can  be resolved using wildcard generic

        ArrayList<? extends Teacher> teacherlist1 = new ArrayList<>();
        // not this collection can work with any references of teacher or 
        // any child classes of Teacher
        ArrayList<Student> studentlist2 = new ArrayList<>();
        ArrayList<Teacher> teacherlist2 = new ArrayList<>();
        teacherlist1 = studentlist2;
        teacherlist1 = teacherlist2;

        // SO this is called UpperBound and can refer to teacher and child classes of Teacher


        ArrayList<? super Teacher> teacherlist01 = new ArrayList<>();
        // not this collection can work with any references of teacher and parent class of teacher
        ArrayList<Student> studentlist01 = new ArrayList<>();
        ArrayList<Teacher> teacherlist02 = new ArrayList<>();

        teacherlist01 = teacherlist02;
        // teacherlist01 = studentlist01; // not accessiable

        ArrayList<Object> objectlist = new ArrayList<>();
        teacherlist01 = objectlist;


        // Now lets understand generics with methods

        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();

        Student s1 =  new Student();
        Student s2 = new Student();

        


    }
}
