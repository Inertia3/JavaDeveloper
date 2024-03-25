import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Week602Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        // Stream<Integer> s1 = list.stream();
        // s1.forEach(n -> System.out.println(n));

        // // why we use stream because it has multiple methods
        // // which we can use to make our job easier

        // Stream<Integer> s2 = list.stream();
        // Stream<Integer> s3 = s2.filter(n -> n%2==0);
        // Stream<Integer> s4 = s3.map(n-> n*2);

        // int result =  s4.reduce(0, (c,e) -> (c+e));
        // System.out.println(result);

        // We can combine all this into a single block of code

        // list.stream()
        // .filter(n -> n % 2 == 0)
        // .map(n -> n * 2)
        // .reduce(0, (c, e) -> c + e);

        int result = list.stream()
            .filter(n-> n%2==0)
            .map(n-> n*2)
            .reduce(0,(c,e) -> (c+e));

        System.out.println(result);
    }
}
