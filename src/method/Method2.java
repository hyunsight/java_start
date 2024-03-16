package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader(); //반환 타입이 없으므로 반환 값(예시. 'int sum =')을 받으면 안 됨
        System.out.println("프로그램이 동작합니다");
        printFooter();
    }

    //매개 변수 없고, 반환 타입 없는 메서드
    // - 모든 메서드는 항상 return 호출 필요하나, 반환 타입 void의 경우, return 생략 가능
    //   : 자바 컴파일러가 반환 타입이 없는 경우, 자동으로 return을 마지막줄에 넣어줌
    //   : 참고로 return 만나면 함수 종료
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 = ");
    }
}
