package level_0;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueArray {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];

//        int[] answerEx = Arrays.stream(numlist).boxed().sorted(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                int newO1 = Math.abs(o1 - n);
//                int newO2 = Math.abs(o2 - n);
//                if (newO1 == newO2)
//                    return o2 - o1;
//                return newO1 - newO2;
//            }
//        }).mapToInt(i -> i).toArray();
//        for (int anInt : answerEx) {
//            System.out.println("anInt = " + anInt);
//        }

//        int [] numAbs = new int[numlist.length];
//        for (int i = 0; i < numAbs.length; i++) {
//            numAbs[i]=Math.abs(n-numlist[i]);
//        }
        HashMap<Integer, ArrayList<Integer>> numAbs = new HashMap<>();
        for (int i = 0; i < numlist.length; i++) {
            int key = Math.abs(numlist[i]-n);
            if(!numAbs.containsKey(key)){
                numAbs.put(key,new ArrayList<>());
            }
            numAbs.get(key).add(numlist[i]);
        }
//        System.out.println("numAbs = " + numAbs);

        ArrayList<Integer> keyList = new ArrayList<>(numAbs.keySet());
        Collections.sort(keyList);

        int index=0;
        for (Integer nowKey : keyList) {
            ArrayList<Integer> values = numAbs.get(nowKey);
            Collections.sort(values,Collections.reverseOrder());

            for (Integer value : values) {
                answer[index++] = value;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        UniqueArray uniqueArray = new UniqueArray();
        int[]  numlist = {1,2,3,4,5,6};
        int n = 4;
        int[] solution = uniqueArray.solution(numlist, n);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
