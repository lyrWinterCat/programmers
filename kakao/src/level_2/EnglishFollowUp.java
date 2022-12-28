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
            answer[0] = (index % n) + 1;
            answer[1] = (index / n) + 1;

        } else if (sameWord) {
            answer[0] = (sameWordIndex % n) + 1;
            answer[1] = (sameWordIndex / n) + 1;

        } else if (wrongWord) {
            answer[0] = (wrongWordIndex % n) + 1;
            answer[1] = (wrongWordIndex / n) + 1;
        }

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
    }
}
