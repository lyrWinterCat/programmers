package level_1;

public class WierdWord {
    public String solution(String s) {
        String answer = "";

        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println("word = " + word);
            if(word.contains(" ")){
                answer+=word;
            }else{
                for (int i = 0; i < word.length(); i++) {
                    if(i%2==0){
                        answer+=String.valueOf(word.charAt(i)).toUpperCase();
                    }else{
                        answer+=String.valueOf(word.charAt(i)).toLowerCase();
                    }
                }
            }
            answer+=" ";
        }
        answer=answer.substring(0,answer.length()-1);
        if(answer.length()!=s.length()){
            for (int i = answer.length(); i <s.length(); i++) {
                answer+=" ";
            }
        }
        System.out.println("answer = " + answer);

        return answer;
    }

    public static void main(String[] args) {
        WierdWord wierdWord = new WierdWord();
        String s = "  tRy hello  WORLD    ";
        wierdWord.solution(s);
    }
}
