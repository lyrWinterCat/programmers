public class CodingTest {
    public static void main(String[] args) {
        //ip validation with regex

        String ipExample = "";

        String ipRegex = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        //설명
        // 25[0-5] : 250~255
        // 2[0-4][0-9] : 200~249
        // [01]?[0-9][0-9]? : 0~199
        // \\. : . 문자
        // {3} : 3번 반복
        // (25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?) : 0~255

        if(ipExample.matches(ipRegex)){
            System.out.println("Valid IP");
        }else{
            System.out.println("Invalid IP");
        }

        String sample = "..3.";
        String[] split = sample.split("\\.");
        for(String s : split){
            System.out.println(s);
        }
    }
}
