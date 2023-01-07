package level_0;

public class CurseThree {
    public int solution(int n) {
//        int answer = 0;
//        int[] notThree = new int[101];
//        notThree[1] = 1;
//        for (int i = 2; i < notThree.length; i++) {
//            notThree[i] = notThree[i - 1] + 1;
//            if (notThree[i] % 3 == 0) {
//                notThree[i]++;
//            }
//            if(String.valueOf(notThree[i]).contains("3")){
//                notThree[i]++;
//            }
//
//            System.out.println("notThree[i] = " + notThree[i]);
//        }

        int target = n;
        int num = 0;
        while(target > 0){
            num++;
            if (num % 3 == 0 || String.valueOf(num).contains("3")) {
                continue;
            }
            target--;
        }

        return num;
    }

    public static void main(String[] args) {
        CurseThree curseThree = new CurseThree();
        int n = 40;
        int solution = curseThree.solution(n);
        System.out.println("solution = " + solution);

    }
}
