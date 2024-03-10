package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; //임시 변수
        // 문제점
        // - if문에서만 사용할 변수인데, main 블록에서 선언 시 불필요하게 메모리 사용(유지)
        // - if 블록 안에서 선언하였을 시, if 코드 블록 종료 시점에 메모리에서 제거
        // - 추가로 코드 복잡성 증가 (핵심)

        //m이 0 이상인 경우, 2배 값 출력 코드
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
