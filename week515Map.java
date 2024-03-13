import java.util.HashMap;
import java.util.Map;

public class week515Map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Sahil Ansari");
        map.put(2, "Arshiya Rashid");
        map.put(3, "Sameer Anasri");
        map.put(4, "Random Anasri");

        System.out.println(map);

        System.out.println(map.keySet());

        for(Integer name : map.keySet()){
            System.out.println(name+" : "+map.get(name));
        }
    }
}
