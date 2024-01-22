package level_1;

public class Trainning {
    public int solution(int n, int[] lost, int[] reserve) {

        int[] students = new int[n];

        for (int i = 0; i < students.length; i++) {
            students[i] = 1;
        }

        for (int j : lost) {
            students[j - 1]--;
        }
        for (int i : reserve) {
            students[i - 1]++;
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] == 0) {
                if (i == 0) {
                    if (students[i + 1] == 2) {
                        students[i]++;
                        students[i + 1]--;
                    }
                }
                else if (i == students.length - 1) {
                    if (students[i-1] == 2){
                        students[i]++;
                        students[i-1]--;
                    }
                }
                else {
                    if(students[i-1]==2){
                        students[i]++;
                        students[i-1]--;
                    }
                    else if(students[i+1]==2){
                        students[i]++;
                        students[i+1]--;
                    }
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i]>=1){
                answer++;
            }
        }

        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        Trainning trainning = new Trainning();
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        trainning.solution(n, lost, reserve);
    }
}
