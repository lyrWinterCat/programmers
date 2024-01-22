package level_1;

import java.util.ArrayList;

public class SplitString {
    public int solution(String s) {
        ArrayList<String> splitList = new ArrayList<>();

        makeSplitList(s, splitList);
        System.out.println("splitList = " + splitList);
        String result = "";
        for (String s1 : splitList) {
            result+=s1;
        }

        if(result.equals(s)){
            return splitList.size();
        }

        return splitList.size()+1;
    }

    private void makeSplitList(String s, ArrayList<String> splitList) {
        int firstNum = 1;
        int nextNum = 0;

        for (int i = 1; i < s.length(); i++) {
            char first = s.charAt(0);
            if(s.charAt(i)!=first){
                nextNum++;
            }
            if(s.charAt(i)==first){
                firstNum++;
            }

            if(nextNum==firstNum){
                splitList.add(s.substring(0,i+1));
                String newS= s.substring(i+1);
                makeSplitList(newS,splitList);
                break;
            }
        }
    }


    public static void main(String[] args) {
        SplitString splitString = new SplitString();
        String s = "abracadabra";
        int solution = splitString.solution(s);
        System.out.println("solution = " + solution);
    }
}
