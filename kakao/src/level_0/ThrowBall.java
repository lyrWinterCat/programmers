package level_0;

public class ThrowBall {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int temp = k*2-2;

        if(temp<= numbers.length-1){
            answer=numbers[temp];
        }else{
            answer=numbers[temp%(numbers.length)];
        }

//        if(numbers.length>=k*2){
//            for (int i = 0; i < numbers.length; i++) {
//                answer=numbers[k*2-2];
//            }
//        }else{
//            int[] newNumbers = new int[k*2];
//            for (int i = 0; i < newNumbers.length; i++) {
//                if(i< numbers.length){
//                    newNumbers[i]=numbers[i];
//                }else{
//                  newNumbers[i]=numbers[i- numbers.length];
//                }
//                newNumbers[i]=numbers[i];
//
//                answer=newNumbers[k*2-2];
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        ThrowBall throwBall = new ThrowBall();
        int[] numbers={1,2,3,4,5,6};
        int k = 5;
        throwBall.solution(numbers,k);
    }
}
