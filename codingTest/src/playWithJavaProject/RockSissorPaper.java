package playWithJavaProject;

import java.util.*;

public class RockSissorPaper {

    List<String> computer_role = new ArrayList<String>(List.of("가위","바위","보"));
    Scanner sc = new Scanner(System.in);

    int user_win = 0;
    int computer_win = 0;
    int draw = 0;

    String userInput = "";
    String computer = "";


    public int makeComputerRole(){
        Random random = new Random();
        return random.nextInt(2);
    }

    public void run(){

        System.out.println("가위바위보 게임을 시작합니다.\n 5판 중 3판을 먼저 이기면 승리합니다. " +
                "\n 현재 스코어 : \n 컴퓨터 : "+computer_win+"\n 사용자 : "+ user_win+"\n 비김 : "+draw+
                "\n 가위 바위 보 셋 중 하나를 입력해주세요.");
        userInput = sc.next();
        if(validateUser(userInput)){
            computer = computer_role.get(makeComputerRole());
            System.out.println("computer = " + computer);
            makeScoreUp(whoIsWin(userInput,computer));
        }else{
            System.out.println("가위 바위 보 셋 중 하나를 입력해 주세요.");
            run();
        }
    }

    private void makeScoreUp(String whoIsWin) {
        if(whoIsWin.equals("user")){
            user_win++;
        }else if(whoIsWin.equals("computer")){
            computer_win++;
        }else{
            draw++;
        }
    }

    private String whoIsWin(String userInput, String computer) {
        int user = 0;
        int computerN = 0;
        for (int i = 0; i < computer_role.size(); i++) {
            if(userInput.equals(computer_role.get(i))){
                user=i;
            }
            if(computer.equals(computer_role.get(i))){
                computerN=i;
            }
        }
        switch (user-computerN){
            case 0 :
                return "draw";
            case 1: case 2:
                return "user";
            case -1: case -2:
                return "computer";
        }
        return "";
    }

    private boolean validateUser(String userInput) {
        if(userInput.equals("가위")||userInput.equals("바위")||userInput.equals("보")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RockSissorPaper rockSissorPaper = new RockSissorPaper();

    }


}
