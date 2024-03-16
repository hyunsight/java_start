package method;

public class MethodValue0 {
    //메서드 호출과 값 전달 1
    // - ***[중요]*** 자바의 대원칙: 자바는 항상 변수의 값을 복사해서 대입

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        //값을 복사해서 대입 (num1에 있는 기존 값은 유지되므로 / num1 변수 자체가 num2에 들어간 것이 아님)
        // - 따라서 num1에 있는 값을 num2에 대입한다고 표현 > 실제로 값을 복사해서 대입
        // - 그러므로 num1과 num2는 서로 연관 관계(관련) 없음
        num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}
