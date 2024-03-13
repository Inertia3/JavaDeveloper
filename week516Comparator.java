import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class week516Comparator {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10)
                return 1;
                else
                return -1;
            }
        };
        List<Integer> list = new ArrayList<Integer>();
        list.add(19);
        list.add(27);
        list.add(33);
        list.add(40);
        list.add(55);

        Collections.sort(list, com);
        System.out.println(list);
    }
}
