import java.util.Arrays;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++)
            if (!participant[i].equals(completion[i]))
                return participant[i];
        return participant[participant.length - 1];
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
