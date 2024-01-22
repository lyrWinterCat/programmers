package level_1;

public class TestExam {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};

        int[] studentScore = {3};

        studentScore[0]= makeScore(student1,answers);
        studentScore[1]= makeScore(student2,answers);
        studentScore[2]= makeScore(student3,answers);

        return answer;
    }

    private int makeScore(int[] student, int[] answers) {
        int score = 0;
        if(student.length>answers.length){

        }
        if(student.length< answers.length){

        }
        return 0;
    }

    public static void main(String[] args) {
        TestExam testExam = new TestExam();
        int[] answers = {1,2,3,4,5};
        int[] solution = testExam.solution(answers);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
