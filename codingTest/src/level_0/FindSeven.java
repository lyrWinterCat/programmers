package level_0;

public class FindSeven {
    public int solution(int[] array) {
        int answer = 0;
        for (int i : array) {
            String temp = ""+i;
            for (int j = 0; j < temp.length(); j++) {
                if(Integer.parseInt(""+temp.charAt(j))==7){
                    answer++;
                }
            }
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        FindSeven findSeven = new FindSeven();
        int[] array = {7,77,17};
        findSeven.solution(array);
    }
}
