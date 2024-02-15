import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1207 {
    
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,1,1,3};
        boolean ans = uniqueOccurrences2(arr);
        System.out.println(ans);
    }

    static public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> myMap = new HashMap<>();
        Set<Integer> mySet = new HashSet<>();

        for (int i = 0; i < arr.length; i++){
            int count = myMap.getOrDefault(arr[i],0);
            myMap.put(arr[i], count + 1);
        }

        for (int key : myMap.keySet()){
            int value = myMap.get(key);
            if (mySet.contains(value)){
                return false;
            }
            mySet.add(value);
        }
        return true;
    }


    static public boolean uniqueOccurrences2(int[] arr) {
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int num : arr){
            myMap.put(num, myMap.getOrDefault(num,0) + 1);
        }

        Set<Integer> mySet = new HashSet<>(myMap.values());

        return myMap.size() == mySet.size();
    }


}
