package level_0;

public class MosCode {
    public String solution(String letter) {
        String [] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        // a = 97;
        // mos[0]=a=97;

        String [] temp = letter.split(" ");
        String answer = "";

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < mos.length; j++) {
                if(temp[i].equals(mos[j])){
                    answer+=(char)(j+97);
                }
            }
        }
        System.out.println("answer = " + answer);

        return answer;
    }

    public static void main(String[] args) {
        MosCode mosCode = new MosCode();
        String letter = ".... . .-.. .-.. ---";
        mosCode.solution(letter);
    }
}
