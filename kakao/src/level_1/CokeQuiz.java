package level_1;

public class CokeQuiz {
    int emptyBottle = 0;

    public int solution(int a, int b, int n) {
        int answer = 0;

        /*
        콜라를 받기 위해 마트에 주어야 하는 병 수 a,
        빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수 b,
        상빈이가 가지고 있는 빈 병의 개수 n
         */
        while (n >= 2) {
            answer += (n / a) * b;
            emptyBottle += n % a;

            if (emptyBottle > 0) {
                if(emptyBottle>=a){
                    answer+=emptyBottle/a;
                    emptyBottle=emptyBottle%a;
                }
            }

            n /= a;
        }

        if(a==2){
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        CokeQuiz cokeQuiz = new CokeQuiz();
        int a = 3;
        int b = 1;
        int n = 20;
        int solution = cokeQuiz.solution(a, b, n);
        System.out.println("solution = " + solution);
    }
}
