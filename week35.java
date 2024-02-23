class employee{
    private int age;
    private String name;

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
public class week35 {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.setAge(20);
        emp.setName("Sahil Ansari");
        System.out.println(emp.getName());
        System.out.println(emp.getAge());    
    }
}

