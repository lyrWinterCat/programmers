package level_0;

public class AlienWord {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        // dic이 spell의 모든 원소를 포함하고 있고 dic의 단어와 spell의 사이즈가 같다면 answer=1;
        for (int i = 0; i < dic.length; i++) {
            if(dic[i].length()==spell.length){
                int cnt=0;
                for (int j = 0; j < spell.length; j++) {
                    if(dic[i].contains(spell[j])){
                        cnt++;
                        System.out.println("cnt = " + cnt);
                    }
                    if(cnt==spell.length){
                        answer=1;
                    }
                }
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        AlienWord alienWord = new AlienWord();
        String[] spell = {"z","d","x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        alienWord.solution(spell,dic);
    }
}
