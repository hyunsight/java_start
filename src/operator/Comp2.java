package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); //리터럴 비교
        boolean result2 = str1.equals("문자열1"); //문자열 변수와 리터럴 비교
        boolean result3 = str1.equals(str2); //문자열 변수 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("hello" == "hello");
        //이 경우는 true로 나오나, 간혹 어떤 특정한 조건이 되면 안나올 때가 있어 문자열끼리는 ==으로 비교하면 안 됨

        //단축키 command + shift + enter : 문장 자동 완성
        System.out.println(result1);
    }
}
