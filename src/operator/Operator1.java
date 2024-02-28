package operator;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        //"문자열" + 숫자(등) = 문자열로 출력
        System.out.println("a + b = " + sum); //출력 a + b = 7

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        //곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈
        // - 인트형끼리 계산하면 결과값으로 인트형이 나옴 > 소수점 표현 불가 (정수만 표현)
        int div = a / b;
        System.out.println("a / b = " + div);

        //나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);

        //0으로 나누기 > 컴파일 에러 발생 > 프로그램 종료(이후 코드 실행 안됨)
        //int z = 10 / 0;
    }
}
