package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RansomNoteTest {

    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;

        Map<Character, Integer> ransom = makeHashMap(ransomNote);
        Map<Character, Integer> maga = makeHashMap(magazine);

        for(char key : ransom.keySet()){
            if(maga.get(key) == null || !maga.get(key).equals(ransom.get(key))) return false;
        }
        return true;
    }

    private Map<Character, Integer> makeHashMap(String target) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for(int i=0; i < target.length(); i++){
            char key = target.charAt(i);
            if(hashMap.containsKey(key)){
                hashMap.put(key, hashMap.get(key)+1);
            }
            else{
                hashMap.put(key, 1);
            }
        }
        return hashMap;
    }
}
