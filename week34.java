class employee{
    private int age;
    private String name;

    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
public class week34 {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.setAge(20);
        emp.setName("Sahil Ansari");
        System.out.println(emp.getName());
        System.out.println(emp.getAge());    
    }
}
