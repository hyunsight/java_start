package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    //반환 타입
    // - 반환 타입이 있는 메서드는 반드시 return을 사용해서 값 반환 필요
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        }
        //조건문이 false인 케이스(if문 아래)에 대해서도 return 필요 (반환 타입/값 있으므로)
        // - 따라서 조건문과 함께 사용 시 특히 주의해야 함 (컴파일 에러 발생)
        else { //if문 만족하지 않았을 때
            return false;
        }
    }
}
