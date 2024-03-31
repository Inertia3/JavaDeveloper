import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    private int id;
    private String name;
    private int age;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name = " + name);
        System.out.println("Id = "+id);
        System.out.println("Age = "+age);
    }
}

public class Week618Serialization {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student(13150, "Sahil Ansari", 21);
        s1.display();
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        // To increase the performance we can also add bufferedOutput stream
        BufferedOutputStream bos = null;
        try{
            fos = new FileOutputStream("C:\\Users\\sahil\\Desktop\\MyWork\\Telusko\\seri.txt");
            bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);
    
            oos.writeObject(s1);
            System.out.println("Object has been serialized, Please the chech the respective file!");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            oos.close();
            fos.close();
        }
    }
}
