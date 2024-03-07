public class week505Throw {
    public static void main(String[] args) {
        int i = 5;
        int j = 0;
        int k = 25;
        try{
            j = k%i;
            // what is there is no exception but still I want to throw one
            // we can achieve thos using throw keyword
            if(j==0)
            throw new ArithmeticException("I want to throw an exception- "+j);
            // this message is transfered to ae
        }
        catch(ArithmeticException ae){
            System.out.println("Inside the catch block - "+ae);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Out of catch block- k/i = "+j);
    }
}
