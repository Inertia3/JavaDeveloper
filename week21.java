class addition{
    public int add(int n1, int n2){
        return n1+n2;
    }
}

class week21{
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        //creating reference
        addition a;

        // object
        a = new addition();
        int r = a.add(num1, num2);
        System.out.println(a.add(num1, num2));
    }
}