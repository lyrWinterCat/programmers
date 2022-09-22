package kakao2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ReportNum {

    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String,Integer> reportCount = new HashMap<>();

        for (String s : id_list) {
            reportCount.put(s,0);
        }

        //report 에서 신고한 아이디 신고당한 아이디 기준
        // 동일 인물이 여러번 신고하면 한번으로 카운트됨

        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));

        for (String s : reportSet) {
            String[] reportId = s.split(" ");
            reportCount.put(reportId[1],reportCount.get(reportId[1])+1);
        }

        for (String s : reportCount.keySet()) {
            Integer value = reportCount.get(s);
            if(value>=k){
                
            }
        }

        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        ReportNum reportNum = new ReportNum();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report={"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k=2;

        reportNum.solution(id_list,report,k);
    }
}
