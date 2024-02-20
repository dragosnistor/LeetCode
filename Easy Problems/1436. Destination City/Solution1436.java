import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution1436 {


    public static void main(String[] args) {
        List<List<String>> paths = List.of(
            List.of("London","New York"),
            List.of("New York","Lima"),
            List.of("Lima","Sao Paulo")
        );
        String ans = destCity2(paths);
        System.out.println(ans);
    }

    static public String destCity(List<List<String>> paths) {
        Map<String, Integer> myMap = new HashMap<>();
        
        for (List<String> list : paths) {
            myMap.put(list.get(0), myMap.getOrDefault(list.get(0), 0) + 1);
            myMap.put(list.get(1), myMap.getOrDefault(list.get(1), 0) + 2);
        }

        for (String key : myMap.keySet()){
            if (myMap.get(key) == 2){
                return key;
            }
        }
        return "";
    }

    static public String destCity2(List<List<String>> paths) {
        Set<String> hasOutgoing = new HashSet<>();
        for (int i = 0; i < paths.size(); i++) {
            hasOutgoing.add(paths.get(i).get(0));
        }
        
        for (int i = 0; i < paths.size(); i++) {
            String candidate = paths.get(i).get(1);
            if (!hasOutgoing.contains(candidate)) {
                return candidate;
            }
        }
        
        return "";
    }


}
