import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class week514Set {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<Integer>(); doesent provide sorted value
        // to get sorted value
        HashSet<Integer> tset = new HashSet<Integer>();
        tset.add(2);
        tset.add(3);
        tset.add(1);
        tset.add(2);

        System.out.println("Size of the set is "+tset.size());

        // for(int s : tset){
        //     System.out.println(s);
        // }

        // using iterator?
        Iterator<Integer> it = tset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
