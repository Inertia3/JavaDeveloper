public class week503Exception {
    public static void main(String[] args) {
        int i = 0;
        int r = 0;

        try{
            r = 18/i;
        }

        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("18/i = "+r);
        System.out.println("End of the programm");
    }
}
