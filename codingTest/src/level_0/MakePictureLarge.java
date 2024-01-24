package level_0;

import java.util.ArrayList;

public class MakePictureLarge {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> answer_storage = new ArrayList<>();
        String[] answer = new String[picture.length*k];
        for (int i = 0; i < picture.length; i++) {
            String line = picture[i];
            for (int j = 0; j < k; j++) {
                String newLine="";
                for (int l = 0; l < line.length(); l++) {
                    for (int m = 0; m < k; m++) {
                        newLine+=line.charAt(l);
                    }
                }
                answer_storage.add(newLine);
            }
        }
        System.out.println(answer_storage);
        for (int i = 0; i < answer.length; i++) {
            answer[i]= answer_storage.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        MakePictureLarge makePictureLarge = new MakePictureLarge();
        String[] picture = {"x.x",".x.","x.x"};
        int k = 3;
        String[] solution = makePictureLarge.solution(picture,3);
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }
        
    }
}
