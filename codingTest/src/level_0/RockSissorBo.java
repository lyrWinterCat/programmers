package level_0;

public class RockSissorBo {
    public String solution(String rsp) {

        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            String temp = ""+rsp.charAt(i);
            switch(temp){
                case "2":
                    answer+="0";
                    break;
                case "0":
                    answer+="5";
                    break;
                case "5":
                    answer+="2";
                    break;
            }
        }
        return answer;
    }
}
