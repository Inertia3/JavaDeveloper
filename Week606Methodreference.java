import java.util.Arrays;
import java.util.List;

public class Week606Methodreference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sahil", "Arshiya", "Sameer");

        List<String> uname = names.stream()
                .map(String::toUpperCase)
                .toList();
        // System.out.println(uname);
        // uname.forEach(str -> System.out.println(str))
        uname.forEach(System.out::println);
        
    }
}
