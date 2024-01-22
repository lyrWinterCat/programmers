package level_1;

public class HidePhoneNumber {
    public String solution(String phone_number) {
        String answer = "";
        String temp = phone_number.substring(phone_number.length()-4,phone_number.length());
        for (int i = 0; i < phone_number.length()-4; i++) {
            answer+="*";
        }
        answer+=temp;
        System.out.println("answer = " + answer);

        return answer;
    }

    public static void main(String[] args) {
        HidePhoneNumber hidePhoneNumber = new HidePhoneNumber();
        String phone_number="01033334444";
        hidePhoneNumber.solution(phone_number);
    }
}
