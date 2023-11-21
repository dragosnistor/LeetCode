import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "aa";
        boolean answer = canConstruct(ransomNote, magazine);
        System.out.println(answer);
    }

    static public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> myMagazineHashMap = new HashMap<>(); // k = 26
        
        for (int i = 0; i < magazine.length(); i++){
            char myKey = magazine.charAt(i);

            int myCount = myMagazineHashMap.getOrDefault(myKey, 0);
            myMagazineHashMap.put(myKey, myCount+1);
        }

        //bounder by m
        for (int j = 0; j < ransomNote.length(); j++){
            char myLetter = ransomNote.charAt(j);

            int myLetterCount = myMagazineHashMap.getOrDefault(myLetter, 0);
            
            if (myLetterCount == 0){
                return false;
            }
            
            myMagazineHashMap.put(myLetter, myLetterCount - 1);
        }

        return true;
    }

    // time complexity = O(m)
    // space complexity = O(1)

    // static public boolean canConstruct(String ransomNote, String magazine) {
    //     HashMap<Character,Integer> myMagazineHashMap = new HashMap<>();
        
    //     for (int i = 0; i < magazine.length(); i++){
    //         char myKey = magazine.charAt(i);
    //         if (myMagazineHashMap.containsKey(myKey)){
    //             Integer count = myMagazineHashMap.get(myKey);
    //             myMagazineHashMap.put(myKey, count+1);
    //         } else {
    //             myMagazineHashMap.put(myKey,1);
    //         }
    //     }

    //     HashMap<Character,Integer> myRansomNoteHashMap = new HashMap<>();
        
    //     for (int j = 0; j < ransomNote.length(); j++){
    //         char myKey = ransomNote.charAt(j);
    //         if (myRansomNoteHashMap.containsKey(myKey)){
    //             Integer count = myRansomNoteHashMap.get(myKey);
    //             myRansomNoteHashMap.put(myKey, count+1);
    //         } else {
    //             myRansomNoteHashMap.put(myKey,1);
    //         }
    //     }

    //     for (char letter : myRansomNoteHashMap.keySet()){
    //         Integer ransomNoteCount = myRansomNoteHashMap.get(letter);
    //         Integer magazineCount = myMagazineHashMap.get(letter);

    //         if (magazineCount == null) {
    //             return false;
    //         }

    //         if (ransomNoteCount > magazineCount) {
    //             return false;
    //         }
    //     }

    //     return true;
    // }

    
}
