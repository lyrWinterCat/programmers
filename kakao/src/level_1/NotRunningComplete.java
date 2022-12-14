package level_1;

import java.util.HashMap;

public class NotRunningComplete {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String,Integer> participant_completion = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            participant_completion.put(participant[i], 0);
        }

        for (int i = 0; i < participant.length; i++) {
            participant_completion.put(participant[i], participant_completion.get(participant[i])+1);
        }

        for (int i = 0; i < completion.length; i++) {
            participant_completion.put(completion[i], participant_completion.get(completion[i])-1);
        }

        for (String s : participant_completion.keySet()) {
            if(participant_completion.get(s)==1){
                return s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        NotRunningComplete notRunningComplete = new NotRunningComplete();
        String[] participat = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String solution = notRunningComplete.solution(participat, completion);
        System.out.println("solution = " + solution);
    }
}
