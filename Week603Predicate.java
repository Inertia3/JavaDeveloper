import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Week603Predicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,5,4,3,2,1);

        // Predicate is an interface which have a method test 
        // which returns boolean value
        // predicate itself is a functional interface 
        // therefore we can use lambda expression here 
        // we can also remove the type casting part if we have only one variable

        // Predicate<Integer> p = new Predicate<Integer>() {

        //     @Override
        //     public boolean test(Integer t) {
        //         if(t%2 ==0)
        //         return true;
        //         else 
        //         return
        //         false;
        //     }
            
        // };

        Predicate<Integer> p = (Integer t) ->  {
                if(t%2==0)
                   return true;
                else
                   return false;
            };

        // Function<Integer, Integer> fun = new Function<Integer, Integer>() {

        //     @Override
        //     public Integer apply(Integer t) {
        //         return t*2;
        //     }
        // };

        Function<Integer, Integer> fun = t -> t * 2;
        // since Function is a functional interface we can use lambda expression here
        int result = list.stream()
            // .filter(n-> n%2==0)
            .filter(p)
            // .map(n-> n*2)
            .map(fun)
            .reduce(0,(c,e) -> (c+e));
        System.out.println(result);

        // we have a sort function aswell
        Stream<Integer> s1 = list.stream()
                .filter(n -> n%1==0)
                .sorted();

        s1.forEach(n -> System.out.println(n));
    }
}
// let's undeerstand reduce so let's say we have 1,2,3,4,5,6 to add
// so add = 0; c,e = (1,2) and then (c+e) will be stored in add
// add = 3; c,e = (3,3) and then add = 6; c,e = (6,4) and add = 10
// c,e = (10,5) and add = 15; c,e = (15,6) and add = 21;
