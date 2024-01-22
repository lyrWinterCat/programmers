package level_2;

public class JadenCase {
    public String solution(String s) {
        String answer = "";

        if(!s.contains(" ")){
            if(s.length()==1){
                return s.toUpperCase();
            }
            String notBlank = "";
            notBlank+=String.valueOf(s.charAt(0)).toUpperCase();
            for (int i = 1; i <s.length(); i++) {
                notBlank+=String.valueOf(s.charAt(i)).toLowerCase();
            }
            return notBlank;
        }

        String[] blanks = s.split("[0-9A-Za-z]+");

        String newS = s.replaceAll("\\s+", " ");
        newS=newS.trim();

        String[] s1 = newS.split(" ");
        for (int i = 0; i < s1.length; i++) {
            s1[i] = s1[i].toLowerCase();
            if (s1[i].charAt(0) >= 'a' && s1[i].charAt(0) <= 'z') {
                s1[i] = (char) (s1[i].charAt(0) - 32) + s1[i].substring(1);
            }
        }

        if(s.charAt(0)==' '){
            if(s1.length == blanks.length){
                for (int i = 0; i < s1.length; i++) {
                    answer+=blanks[i]+s1[i];
                }
            }else{
                for (int i = 0; i < s1.length; i++) {
                    answer+=blanks[i]+s1[i];
                }
                answer+=blanks[blanks.length-1];
            }
        }else{
            if (s1.length == blanks.length) {
                for (int i = 0; i < s1.length-1; i++) {
                    answer+=s1[i]+blanks[i+1];
                }
                answer+=s1[s1.length-1];
            }

            if (s1.length < blanks.length) {
                for (int i = 0; i < s1.length; i++) {
                    answer+=s1[i]+blanks[i+1];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        String s = "aa";
        String solution = jadenCase.solution(s);
        System.out.println("solution = " + solution);
    }
}
