package programmers.etc.hash;

import java.util.HashMap;
import java.util.Map;

public class NotFinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> completionMap = new HashMap();
        for (String s : completion) {
            completionMap.put(s, completionMap.getOrDefault(s, 0) + 1);
        }

        for (String s : participant) {
            if (completionMap.getOrDefault(s, 0) <= 0) {
                answer = s;
                return answer;
            } else {
                completionMap.computeIfPresent(s, (k, v) -> completionMap.get(k) - 1);
            }
        }

        return answer;
    }
}
