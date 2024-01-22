package level_2;


public class MaxMin {
    public String solution(String s) {
        String answer = "";
        String[] splitString = s.split(" ");
        int[] numbers = new int[splitString.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= Integer.parseInt(splitString[i]);
        }
        // stream으로 한번에 바꾸고 싶어!

        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            max = Math.max(max,number);
            min = Math.min(min,number);
        }

        return min+" "+max;
    }

    public static void main(String[] args) {
        MaxMin maxMin = new MaxMin();
        String s = "1 2 3 4";
        maxMin.solution(s);
    }
}
