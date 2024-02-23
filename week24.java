// array of objects
class student{
    String name;
    int rollno;
    int marks;
       
}
public class week24 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Sahil Ansari";
        s1.rollno = 23;
        s1.marks = 100;

        student s2 = new student();
        s2.name = "Sameer Ansari";
        s2.rollno = 21;
        s2.marks = 98;

        student s3 = new student();
        s3.name = "Arshiya Rashid";
        s3.rollno = 22;
        s3.marks = 99;

        student st[] = new student[3];
        st[0] = s1;
        st[1] = s2;
        st[2] = s3;

        for(int i=0; i<3; i++){
            System.out.println(st[i].name+" : "+st[i].rollno+" : "+st[i].marks);
        }

        for(student std : st){
            System.out.println(std.name+" : "+std.rollno+" : "+std.marks);
        }
    }
}
