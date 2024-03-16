package method;

public class MethodValue1 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1: " + num1);
        changeNumber(num1); //num1 값 '복사'해서 전달 (원본 건드리지 않음)
        System.out.println("4. changeNumber 호출 후, num1: " + num1); //5, num1과 num2는 관련 없음 (따라서 num2 값이 변경되더라도 num1은 기존 값 유지)

    }

    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2: " + num2);

        num2 = num2 * 2;
        System.out.println("3. changeNumber 변경 후, num2: " + num2);
    }
}
