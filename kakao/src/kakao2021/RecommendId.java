package kakao2021;

import java.util.regex.Pattern;

public class RecommendId {

    /*
    1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
    2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
    4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
    5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
    6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
    7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
     */


    public String solution(String new_id) {
        //1단계
        String user_id = new_id.toLowerCase();

        //2단계
        String pattern = "[^a-z\\d-_.]";
        user_id=user_id.replaceAll(pattern,"");

        //3단계
        user_id=user_id.replaceAll("\\.{2,}",".");

        //4단계
        user_id=user_id.replaceAll("^\\.|\\.$","");

        //5단계
        user_id=user_id.equals("")?"a":user_id;

        //6단계
        int length = user_id.length(); //자주쓰는 값 변수로 뽑아내기
        user_id= length >=16?user_id.substring(0,15).replaceAll("\\.$",""):user_id;

        //7단계
        if(length <3){
            for (int i = 0; i < 3- length; i++) {
                user_id+=user_id.charAt(length -1);
            }
        }

        String answer = user_id;
        return answer;
    }

    public static void main(String[] args) {
        RecommendId recommendId = new RecommendId();
        String new_id = "c";
        System.out.println("recommendId = " + recommendId.solution(new_id));
    }

}
