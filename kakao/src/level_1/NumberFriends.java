package level_1;

public class NumberFriends {
    public String solution(String X, String Y) {
        String answer = "";

        int[] numsX = new int[10];
        int[] numsY = new int[10];

        X.chars().forEach(i->numsX[i-'0']++);
        Y.chars().forEach(i->numsY[i-'0']++);

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            sb.append(String.valueOf(i).repeat(Math.min(numsX[i],numsY[i])));
        }

        if(sb.toString().trim().isEmpty()){
            return "-1";
        }

        answer = sb.toString();

        if(answer.charAt(0)=='0'){
            return "0";
        }




//        for (int x : numsX) {
//            System.out.println("x = " + x);
//        }
//        System.out.println("mapX = " + mapX);
//        System.out.println("mapY = " + mapY);

//        HashSet<Integer> correctSet = new HashSet<>();
//        for (Integer integer : mapX.keySet()) {
//            correctSet.add(integer);
//        }
//        for (Integer integer : mapY.keySet()) {
//            correctSet.add(integer);
//        }
//
//        if(correctSet.size()== mapX.size()+mapY.size()){
//            // 일치하는 요소가 없는 경우
//            return "-1";
//        }else{
//            //일치하는 요소를 찾아야 해
//            //일치하는 key값의 value가 작은 것을 받아와야함
//            ArrayList<Integer> answerList = new ArrayList<>();
//            for (Integer integer : mapX.keySet()) {
//                if(mapY.keySet().contains(integer)){
//                    int min = Math.min(mapX.get(integer),mapY.get(integer));
//                    for (int i = 0; i < min; i++) {
//                        answerList.add(integer);
//                    }
//                }
//            }
//            System.out.println("answerList = " + answerList);
//            if(answerList.get(answerList.size()-1)==0){
//                return "0";
//            }else{
//                for (int i = answerList.size()-1; i >=0 ; i--) {
//                    answer+=answerList.get(i);
//                }
//            }
//        }

        return answer;
    }

//    private HashMap<Integer, Integer> makeMap(String x) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < 10; i++) {
//            map.put(Integer.parseInt(String.valueOf(x.charAt(i))),0);
//        }
//        for (int i = 0; i < x.length(); i++) {
//            map.put(Integer.parseInt(String.valueOf(x.charAt(i))),map.get(Integer.parseInt(String.valueOf(x.charAt(i))))+1);
//        }
//        return map;
//    }

    public static void main(String[] args) {
        NumberFriends numberFriends = new NumberFriends();
        String X = "5525";
        String Y = "1255";
        String solution = numberFriends.solution(X, Y);
        System.out.println("solution = " + solution);
    }
}
