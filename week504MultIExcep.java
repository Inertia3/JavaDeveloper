public class week504MultIExcep {
    public static void main(String[] args) {
        int i = 4;
        int j = 0;

        int arr[] = new int[5];
        String str = null;

        try{
            j = 18/i;

            arr[0] = 10;
            // arr[5] = 20;
            j = str.length();
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println(aie);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println(j);
        System.out.println(arr[0]);
    }
}
