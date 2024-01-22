package level_2;

import java.util.HashSet;
import java.util.Set;

public class FindPrimaryNumber {

    Set<Integer> madeNumbers = new HashSet<>();
    boolean[] cardUsed = new boolean[10];


    public int solution(String numbers) {
        String tempNumber = "";

        createNumber(numbers, tempNumber);

        System.out.println("madeNumbers = " + madeNumbers);

        int answer = countPrime(madeNumbers);
        System.out.println("answer = " + answer);


        return answer;
    }

    private int countPrime(Set<Integer> madeNumbers) {
        int count = 0;

        for (Integer number : madeNumbers) {
            if (isPrime(number)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(Integer number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number >= 2;
    }


    private void createNumber(String numbers, String tempNumber) {

        if (tempNumber.length() == numbers.length()) {
            return;
        }

        for (int j = 0; j < numbers.length(); j++) {
            if (!cardUsed[j]) {
                cardUsed[j] = true;
                tempNumber += numbers.charAt(j);
                Integer number = Integer.parseInt(tempNumber);
                madeNumbers.add(number);
                createNumber(numbers, tempNumber);
                cardUsed[j] = false;
                tempNumber = tempNumber.substring(0, tempNumber.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        FindPrimaryNumber findPrimaryNumber = new FindPrimaryNumber();
        String numbers = "011";
        findPrimaryNumber.solution(numbers);
    }
}
