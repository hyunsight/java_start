package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; //형변환 (= 명시적 형변환)
        System.out.println(intValue);

        System.out.println(10.5);
        System.out.println((int) 10.5);

        int z = (int) 10.5;
        System.out.println(z);

        System.out.println("doubleValue = " + doubleValue);
        //[중요] 형변환한다고 해서 doubleValue 타입 또는 값 자체가 변경되는 것은 아니며 그대로 유지. 대입연산자 사용 시 외에는 값이 변경되지 않음.
    }
}
