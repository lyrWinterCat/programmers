package level_1;

public class CokeQuiz {
    int emptyBottle = 0;

    public int solution(int a, int b, int n) {
        while(n>=a){
            emptyBottle+=n/a*b;
            n=(n/a)*b + (n%a);
            System.out.println("emptyBottle = " + emptyBottle);
        }

       return emptyBottle;
    }

    public static void main(String[] args) {
        CokeQuiz cokeQuiz = new CokeQuiz();
        int a = 5;
        int b = 3;
        int n = 21;
        int solution = cokeQuiz.solution(a, b, n);
        System.out.println("solution = " + solution);
    }
}
