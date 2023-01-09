package level_2;

public class JumpOrTeleport {
    public int solution(int n) {
        int ans = 0;
        while(n>0){
            if(n%2==0){
                n/=2;
            }
            else{
                ans++;
                n--;
                n/=2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        JumpOrTeleport jumpOrTeleport = new JumpOrTeleport();
        int n = 5000;
        int solution = jumpOrTeleport.solution(n);
        System.out.println("solution = " + solution);
    }
}
