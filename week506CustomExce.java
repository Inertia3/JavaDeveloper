class MyException extends Exception{
    public MyException(String str){
        super(str);
        // System.out.println(str);
    }
}
public class week506CustomExce {
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        int k = 0;
        try{
            k = i%j;
            if(k==0){
                throw new MyException("Throwing custom Exception");
            }
        }
        catch(MyException me){
            System.out.println("Inside the catch Block-"+me);
        }

        catch(Exception e){
            System.out.println("Default exception-"+e);
        }

        System.out.println("Out of catch block k = "+k);
    }
}
