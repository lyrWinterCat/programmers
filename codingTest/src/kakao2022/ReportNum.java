package kakao2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ReportNum {

    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String,Integer> reportCount = new HashMap<>();
        HashMap<String,Integer> getMail = new HashMap<>();
        HashMap<String,Integer> id_idx = new HashMap<>();

        for (String s : id_list) {
            reportCount.put(s,0);
            getMail.put(s,0);
        }

        for (int i = 0; i < id_list.length; i++) {
            id_idx.put(id_list[i],i);
        }

        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));

        //멤버별 신고당한 횟수
        for (String s : reportSet) {
            String[] reportId = s.split(" ");
            reportCount.put(reportId[1],reportCount.get(reportId[1])+1);
        }

        for (String s : reportSet) {
            String[] reportId = s.split(" ");

            if(reportCount.get(reportId[1])>=k){
                getMail.put(reportId[0],getMail.get(reportId[0])+1);
            }
        }

        int[] answer = new int[id_list.length];

        for (String s : getMail.keySet()) {
           int idx=id_idx.get(s);
           answer[idx]=getMail.get(s);
        }

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
