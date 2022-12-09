package level_0;

import java.util.ArrayList;

public class OXQuiz {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];


        for (int j = 0; j < quiz.length; j++) {
            String[] splits = quiz[j].split(" ");

            ArrayList<Integer> numbers = new ArrayList<>();
            ArrayList<String> symbols = new ArrayList<>();

            for (int i = 0; i < splits.length; i++) {
                if (i % 2 == 0) {
                    numbers.add(Integer.parseInt(splits[i]));
                } else {
                    symbols.add(splits[i]);
                }
            }
            System.out.println("numbers = " + numbers);
            System.out.println("symbols = " + symbols);

            answer[j] = makeAnswer(numbers, symbols);
        }
        return answer;
    }

    private String makeAnswer(ArrayList<Integer> numbers, ArrayList<String> symbols) {
        if (symbols.get(0).equals("-")) {
            int result = numbers.get(2);
            int calculate = numbers.get(0) - numbers.get(1);
            if (result == calculate) {
                return "O";
            }
            return "X";
        }
        int result = numbers.get(2);
        int calculate = numbers.get(0) + numbers.get(1);
        if (result == calculate) {
            return "O";
        }
        return "X";
    }


    public static void main(String[] args) {
        OXQuiz oxQuiz = new OXQuiz();
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        String[] solution = oxQuiz.solution(quiz);
        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }
}
