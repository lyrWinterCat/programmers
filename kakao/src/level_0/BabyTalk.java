package level_0;

public class BabyTalk {
    public int solution(String[] babbling) {
        String [] canTalk = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < canTalk.length; j++) {
                if(babbling[i].contains(canTalk[j])){
                    babbling[i] = babbling[i].replaceAll(canTalk[j]," ");
                }
            }
        }

        int answer = 0;
        for (String s : babbling) {
            s = s.replaceAll(" ","");
            System.out.println("s = " + s);
            if(s.isEmpty()){
                answer++;
            }
        }
        System.out.println("answer = " + answer);

        return answer;
    }

    public static void main(String[] args) {
        BabyTalk babyTalk = new BabyTalk();
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        babyTalk.solution(babbling);
    }
}
