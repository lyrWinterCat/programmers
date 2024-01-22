package level_1;

public class NumberDescending {
    public long solution(long n) {
        long answer = 0;
        String temp = ""+n;
        int[] arr = new int[temp.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(""+temp.charAt(i));
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]<arr[j+1]){
                    int tempI = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tempI;
                }
            }
        }

        String tempAnswer="";
        for (int i : arr) {
            tempAnswer+=""+i;
        }
        answer=Long.parseLong(tempAnswer);

        return answer;
    }

    public static void main(String[] args) {
        NumberDescending numberDescending = new NumberDescending();
        int n = 118372;
        numberDescending.solution(n);
    }
}
