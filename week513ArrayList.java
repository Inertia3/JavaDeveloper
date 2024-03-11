import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;
public class week513ArrayList {
    public static void main(String[] args) {
        // Collection<Integer> list = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();


        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // System.out.println("Value at index 2 is "+((ArrayList<Integer>) list).get(2));
        System.out.println("Value at index 2 is "+list.get(2));


        System.out.println("Index of value 40 is "+((ArrayList<Integer>) list).indexOf(40));
        // So we have created a list but we have not specified the type
        // to do that we can do the type casting 

        // for(Object n : list ){
        //     int num = (int)n;
        //     System.out.println(num);
        // }

        // know the actual way to solve the problem
        for(int num : list){
            System.out.println(num);
        }
    }
}
