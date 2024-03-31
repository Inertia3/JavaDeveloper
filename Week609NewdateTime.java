import java.time.*;
public class Week609NewdateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int dom = date.getDayOfMonth();
        int doy = date.getDayOfYear();
        int year =date.getYear();
        int month = date.getMonthValue();

        System.out.println("day of month = "+dom);
        System.out.println("Day of year = "+doy);
        System.out.println("Month = "+month);
        System.out.println("Year = "+year);

        int hour = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();
        int nano = time.getNano();
        System.out.println("Hour - "+hour+" min - "+min+" sec - "+sec+" nano - "+nano);
    }
}
