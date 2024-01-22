package kakao2021;

/*
[조건]은 "개발언어 and 직군 and 경력 and 소울푸드" 형식의 문자열입니다.
언어는 cpp, java, python, -  : 중 하나입니다.(4)
직군은 backend, frontend, - :중 하나입니다. (3)
경력은 junior, senior, - :중 하나입니다. (3)
소울푸드는 chicken, pizza, - :중 하나입니다. (3)
점수 : integer
'-' 표시는 해당 조건을 고려하지 않겠다는 의미입니다.
X는 코딩테스트 점수를 의미하며 조건을 만족하는 사람 중 X점 이상 받은 사람은 모두 몇 명인 지를 의미합니다.
각 단어는 공백문자(스페이스 바) 하나로 구분되어 있습니다.
예를 들면, "cpp and - and senior and pizza 500"은 "cpp로 코딩테스트를 봤으며, 경력은 senior 이면서
소울푸드로 pizza를 선택한 지원자 중 코딩테스트 점수를 500점 이상 받은 사람은 모두 몇 명인가?"를 의미합니다.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RankSearch {

    //user마다 - language, job, career, food, score 정보를 담고 있어야 함
    String[] language = {"cpp","java","python"}; //0,1,2
    String[] job = {"backend","frontend"}; //0,1
    String[] career= {"junior","senior"}; //0,1
    String[] food = {"chicken","pizza"}; //0,1

    //점수입력

    int index;

    HashMap<String, ArrayList<Integer>> userInfoMap = new HashMap<>();
    
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];

        //초기화
        for (int i = 0; i < language.length; i++) {
            for (int j = 0; j < job.length; j++) {
                for (int k = 0; k < career.length; k++) {
                    for (int l = 0; l < food.length; l++) {
                        userInfoMap.put(language[i]+" "+job[j]+" "+career[k]+" "+food[l]+" "+"-",new ArrayList<Integer>());
                    }
                }
            }
        }

        //info 넣어주기
        for (int i = 0; i < info.length; i++) {
            String[] splitInfo = info[i].split(" ");
            int score = Integer.parseInt(splitInfo[4]);
            String key = splitInfo[0]+" "+splitInfo[1]+" "+splitInfo[2]+" "+splitInfo[3]+" "+"-";
            userInfoMap.get(key).add(score);
        }

        for (String s : userInfoMap.keySet()) {
            Collections.sort(userInfoMap.get(s));
        }


        for(int i=0;  i< query.length; i++){
            int pass=0;
            String[] splitQ = query[i].replaceAll(" and","").split(" ");

            for (String userKey : userInfoMap.keySet()) {
                boolean check=true;

                for (int j = 0; j < splitQ.length-1; j++) {
                    String keyWord=splitQ[j];

                    if(!userKey.contains(keyWord)){
                        check=false;
                    }
                }
                //check=true이고 점수가 splitQ[4]보다 크면 answer에 값 넣어주기
                if(check){
                    ArrayList<Integer> value = userInfoMap.get(userKey);
                    pass+=makePass(value,Integer.parseInt(splitQ[4]));
                }
            }
            answer[i]=pass;
        }
        return answer;
    }

    private int makePass(ArrayList<Integer> arrayList, int score) {
        int count = arrayList.size();
        int min=0;
        int max=count;
        while(min<max){
            int mid=(max+min)/2;
            if(arrayList.get(mid)>=score){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return count-min;
    }


    public static void main(String[] args) {
        RankSearch rankSearch = new RankSearch();
        
        String[] info={"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150",
                "cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        
        String[] query={"java and backend and junior and pizza 100","python and frontend and senior and chicken 200",
                "cpp and - and senior and pizza 250","- and backend and senior and - 150",
                "- and - and - and chicken 100","- and - and - and - 150"};
        int[] solution = rankSearch.solution(info, query);
        for (int i : solution) {
            System.out.println("i = " + i);
        }


    }
}
