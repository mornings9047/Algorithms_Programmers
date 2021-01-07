package level01;

import java.util.HashMap;
import java.util.Map;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String p : participant)
            map.put(p, map.getOrDefault(p, 0) + 1);
        for (String c : completion)
            map.put(c, map.getOrDefault(c, 0) - 1);

        for (String m : map.keySet())
            if (map.get(m) == 1) {
                answer = m;
                break;
            }
        return answer;
    }

    public static void main(String[] args) {
        Marathon marathon = new Marathon();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        System.out.println(marathon.solution(participant, completion));

        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"marina", "josipa", "nikola", "filipa"};
        System.out.println(marathon.solution(participant2, completion2));

        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "mislav", "ana"};
        System.out.println(marathon.solution(participant3, completion3));
    }
}
