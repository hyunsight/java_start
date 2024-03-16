package method;

public class Method1Ref {
    public static void main(String[] args) {
        //계산1
        // - 메서드 호출
        // - 메서드 호출하는 순간 메모리 공간 할당
        int sum1 = add(5, 10); //5, 10: argument (=인수, =인자) / 넘기는 값
        //함수 호출 완료되면 파라미터, 변수 모두 폐기처분. 따라서 함수 다시 호출되었을 때 새로운 변수 생성 (함수 호출했을 때마다 메모리 상에서 생성, 제거 반복)
        System.out.println("결과1 출력: " + sum1);

        //계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);

        add(100, 200); //반환값 필요 없거나 받고 싶지 않을 때 호출만 해도 무방
    }
    // - 메서드 호출 종료: 사용한 메모리 낭비할 이유 없으므로 메서드 정의에 따라 사용한 파라미터 변수 및 안에서 정의한 변수(int sum) 모두 제거

    //add 메서드 (=함수)
    // - add 메서드 정의: 메서드 이름, 반환 타입, 매개변수(파라미터) 목록
    // - 매개변수도 각각의 형(타입) 존재
    public static int add(int a, int b) { //int a, int b: 매개변수(파라미터) / 메서드 정의할 때 선언한 변수, 인수가 대입되는 곳, 메서드 호출부와 메서드 내부 사이에서 값을 전달하는 역할의 변수
        // - 메서드 본문: 메서드가 수행해야 하는 코드 블록 (블랙박스)
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum; //결과 출력(반환)
     }

     //단축키 정보
     // - 함수명 누른 상태에서 command + b: 함수 찾아가기
}
