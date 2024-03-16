package method;

public class MethodValue2 {
    //main도 메서드
    // - 처음 프로그래밍을 시작하는 메서드 (java 시작하려면 약속이 있어야 하므로)
    // - 따라서 main 메서드는 '이걸로 시작할거야'라는 의미/역할의 메소드
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);
        changeNumber(number); //값 복사 후 전달
        System.out.println("4. changeNumber 호출 후, number: " + number); //5
        //각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 변수
        // - 이름이 같아도 완전히 다른 변수로 서로 완전히 다른 영역이 생성됨
        //   : 완전히 다른 메모리 공간에 생성 (main, changeNumber 영역 각각 생성됨) > 그 안에 변수 생성 (지역 변수)
        //   : 메서드 안에서 선언되는 걸 지역 변수라고 함 > 매개변수도 지역 변수임
    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number: " + number);

        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number);
    }
}
