import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Week605optional {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sahil", "Arshiya", "Sameer", "Ansh", "Shivraj");

        Optional<String> name = list.stream()
                .filter(str -> str.contains("m"))
                .findFirst();

        System.out.println(name);
        // When ever we will perform operations on a null value 
        // we will have null point exception


        // If we do not wANT TO USE optional class 
        // we can use the findFirst() function
        Optional<String> name1 = list.stream()
        .filter(str -> str.contains("m"))
        .findFirst();
        

        System.out.println(name.orElse("Not found"));
    }
}
