package level_0;


public class NotPermitDouble {
    public String solution(String my_string) {
        String answer="";
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.indexOf(my_string.charAt(i))==i){
                answer+=my_string.charAt(i);
            }
        }
//        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        NotPermitDouble notArrowDouble = new NotPermitDouble();
        String my_string = "We are the world";
        notArrowDouble.solution(my_string);
    }
}
