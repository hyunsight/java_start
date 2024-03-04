package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if(price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인"); //여기서 조건 만족하므로 실행 완료
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

        if (false)
            System.out.println("if문에서 실행됨"); //코드가 한 줄일때 중괄호(블록) 생략 가능
            System.out.println("if문에서 실행 안됨");

        /*
        동일
        if (false)
            System.out.println("if문에서 실행됨"); //코드가 한 줄일때 중괄호(블록) 생략 가능

        System.out.println("if문에서 실행 안됨");
        */

        //단, 생략을 권장하지 않는 이유
        // - 위와 같이 두줄 작성한 상태에서 블록을 안넣을 경우, 위의 코드 한 줄만 실행됨
        // - 따라서 두번째 코드는 if문과 무관하게 실행됨
        // - 따라서 두줄 모두 if문 안으로 포함하려면 코드 블록 추가 필요
    }
}
