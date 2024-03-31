import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Week604ParallelStream {
    public static void main(String[] args) {
        int n = 1000000;
        List<Integer> list = new ArrayList<>(n);
        Random rn = new Random();
        for(int i=0; i<n; i++){
            list.add(rn.nextInt(100));
        }
        // System.out.println(list);

        // int sum = list.stream()
        //         .filter(t-> t%2==0)
        //         .map(t-> t*2)
        //         .reduce(0, (c,e) -> c+e);
        // // System.out.println(sum);

        // If we dont want to use this complex method reduce we can also use 
        // sum method which belongs to another object so we can use mapToInt 
        // method which can convert the stream to integer type
        
        // Sequential Stream
        long startSeq = System.currentTimeMillis();
        int sum1 = list.stream()
                .filter(t-> t%2==0)
                .map(t-> t*2)
                .mapToInt(i -> i)
                .sum();
        long endSeq = System.currentTimeMillis();
        
        // Parallel Stream
        long startpara = System.currentTimeMillis();
        int sum2 = list.parallelStream()
                .filter(t-> t%2==0)
                .map(t-> t*2)
                .mapToInt(i -> i)
                .sum();
        long endpara = System.currentTimeMillis();
        
        // Print sums and time taken
        System.out.println(sum1+" "+sum2);
        System.out.println("seq - "+ (endSeq-startSeq));
        System.out.println("par - "+ (endpara-startpara));
    }
}
