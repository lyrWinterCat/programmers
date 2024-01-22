package level_0;

public class ChangeIndex {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char temp = my_string.charAt(num1);
        for (int i = 0; i < my_string.length(); i++) {
            if(i==num1){
                answer+=my_string.charAt(num2);
            } else if(i==num2){
                answer+=temp;
            } else{
                answer+=my_string.charAt(i);
            }

        }
//        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        ChangeIndex changeIndex = new ChangeIndex();
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        changeIndex.solution(my_string,num1,num2);
    }
}
