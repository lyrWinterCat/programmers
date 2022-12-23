package level_1;


import static java.lang.Integer.toBinaryString;
import static java.lang.Long.toBinaryString;

public class SecretMap {
    public String[] solution(long n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];

        String[] arr1Binary = new String[arr1.length];
        String[] arr2Binary = new String[arr2.length];

        makeBinary(arr1,arr1Binary);
        makeBinary(arr2,arr2Binary);

        for (int i = 0; i < answer.length; i++) {
            answer[i]="";
            for (int j = 0; j < arr1Binary[i].length(); j++) {
                if(arr1Binary[i].charAt(j)=='1' || arr2Binary[i].charAt(j)=='1'){
                    answer[i]+='#';
                }else if(arr1Binary[i].charAt(j)=='0' && arr2Binary[i].charAt(j)=='0'){
                    answer[i]+=' ';
                }
            }
        }

        return answer;
    }

    private void makeBinary(int[] arr, String[] arrBinary) {
        for (int i = 0; i < arr.length; i++) {
            arrBinary[i]=String.format("%"+arr.length+"s",toBinaryString(arr[i])).replaceAll(" ","0");
        }
    }

    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        int n = 5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        secretMap.solution(n,arr1,arr2);
    }
}
