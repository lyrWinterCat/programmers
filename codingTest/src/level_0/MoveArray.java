package level_0;

public class MoveArray {
    public int[] solution(int[] numbers, String direction) {
        switch(direction){
            case "right":
                int end = numbers[numbers.length-1];
                for (int i = numbers.length-1; i>0 ; i--) {
                    numbers[i]=numbers[i-1];
                }
                numbers[0]=end;
                break;
            case "left":
                int start = numbers[0];
                for (int i = 0; i < numbers.length-1; i++) {
                    numbers[i]=numbers[i+1];
                }
                numbers[numbers.length-1]=start;
                break;
        }

        int[] answer = numbers;
        return answer;
    }
    public static void main(String[] args) {
        MoveArray moveArray= new MoveArray();
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction="left";
        moveArray.solution(numbers,direction);
    }

}
