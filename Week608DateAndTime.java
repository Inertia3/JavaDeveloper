// import java.util.Date;
public class Week608DateAndTime {
    public static void main(String[] args) {
        // Date date = new Date();
        // can be directly imported and used
        java.util.Date date = new java.util.Date();
        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);

        java.sql.Date sdate = new java.sql.Date(time);
        System.out.println(sdate);
    }
}
