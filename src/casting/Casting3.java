package casting;

public class Casting3 {
    //형변환과 오버플로우 -> 오버플로우 자체가 문제!
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue); //모든 숫자 그대로 출력

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting = " + intValue); //오버플로우 시 int의 제일 작은 범위로 다시 시작 (시계와 같이)
    }
}
