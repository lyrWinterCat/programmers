package level_2;

import java.util.*;

public class EnglishFollowUp {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        boolean sameWord = false;
        boolean wrongWord = false;

        Set<String> wordsSet = new HashSet<>(List.of(words));
        int sameWordIndex = 0;
        if (wordsSet.size() != words.length) { // 중복된 단어가 나올 시
            sameWord = true;
            sameWordIndex = findSameword(words);
        }

        int wrongWordIndex = 0;
        for (int i = 0; i < words.length - 1; i++) { //앞 사람의 끝단어와 다른 단어로 시작했을 시
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                wrongWord = true;
                wrongWordIndex = i + 1;
                break;
            }
        }

        if (sameWord && wrongWord) {
            int index = Math.min(sameWordIndex, wrongWordIndex);
            answer = makeAnswer(index, n);
        } else if (sameWord) {
            answer = makeAnswer(sameWordIndex, n);
        } else if (wrongWord) {
            answer = makeAnswer(wrongWordIndex,n);
        }

        return answer;
    }

    private int[] makeAnswer(int index, int n) {
        int[] answer = new int[2];
        answer[0] = (index % n) + 1;
        answer[1] = (index / n) + 1;
        return answer;
    }

    private int findSameword(String[] words) {
        int index = 0;
        ArrayList<String> wordsList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (!wordsList.contains(words[i])) {
                wordsList.add(words[i]);
            } else {
                return i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        EnglishFollowUp englishFollowUp = new EnglishFollowUp();
        int n = 3;
        String[] words = {"tank", "kick", "aaak", "kick", "kasw", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] solution = englishFollowUp.solution(n, words);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
        int[] solution2 = englishFollowUp.solution2(n, words);
        for (int i : solution2) {
            System.out.println("i2 = " + i);
        }
    }
    public int[] solution2(int n, String[] words) {
        int[] answer = new int[2];
        int index=0;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < words.length; i++) {
            if(!stack.isEmpty() && stack.contains(words[i])){
                index=i;
                break;
            }
            if(!stack.isEmpty() && stack.peek().charAt(stack.peek().length()-1)!=words[i].charAt(0)){
                index=i;
                break;
            }
            stack.push(words[i]);
        }

        if(index>0){
            answer[0] = (index % n) + 1;
            answer[1] = (index / n) + 1;
            return answer;
        }

        return answer;
    }

}
