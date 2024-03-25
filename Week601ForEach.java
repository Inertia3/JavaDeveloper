
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Week601ForEach {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // an easy way to do it is 

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        
        // so foreach method belongs to consumer class

        // Consumer<Integer> con = new Consumer<Integer>() {

        //     @Override
        //     public void accept(Integer t) {
        //         t = t*2;
        //         System.out.println(t);
        //     }
        // };
        // list.forEach(con);

        // we also know the consumer interface is a functional interface 
        // so we can use lambda expression here 

        // Consumer<Integer> con = (Integer t) -> {
        //     t = t*5;
        //     System.out.println(t);
        // };
        // list.forEach(con);

                // // for each method 
        list.forEach(n-> n=n*2);
        list.forEach(t->System.out.println(t));

    }
}
