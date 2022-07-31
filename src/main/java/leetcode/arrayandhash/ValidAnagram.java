package leetcode.arrayandhash;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> sMap = generateCharMap(s);
        Map<Character, Integer> tMap = generateCharMap(t);

        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            Integer sv = entry.getValue();
            Integer tv = tMap.get(entry.getKey());
            if (!sv.equals(tv)) {
                return false;
            }
        }

        return true;
    }

    private Map generateCharMap(String value) {
        Map<Character, Integer> charMap = new HashMap();

        for (char c : value.toCharArray()) {
            charMap.merge(c, 1, Integer::sum);
        }

        return charMap;
    }

}
