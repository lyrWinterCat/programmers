package level_0;

public class SuccessLogin {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for (int i = 0; i < db.length; i++) {
            String id = db[i][0];
            String pw = db[i][1];
            if(id_pw[0].equals(id) && id_pw[1].equals(pw)){
                answer = "login";
                break;
            }else{
                if(id_pw[0].equals(id)){
                    answer = "wrong pw";
                    break;
                }else{
                    answer =  "fail";
                    break;
                }
            }
        }
        return answer;
    }
}
