package method;

public class MethodCasting2 {
    //자동 형변환
    // - 메서드를 호출할 때 매개변수에 값을 전달하는 것도 결국 변수에 값을 대입하는 것
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); //자동 형변환: double형 매개변수에 int형 인자를 전달하는 것은 문제 없음
    }

    public static void printNumber(double n) { //double n = number과 동일
        System.out.println("숫자: " + n);
    }
}
