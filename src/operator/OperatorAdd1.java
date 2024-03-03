package operator;

public class OperatorAdd1 {

    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); //1

        a = a + 1;
        System.out.println("a = " + a); //2

        //증감 연산자 (실무에서 변수 값 하나씩 증가하는 업무를 많이 하다보니 편의 제공)
        ++a; // a = a + 1
        System.out.println("a = " + a);
        ++a; // a = a + 1
        System.out.println("a = " + a);

        --a;
        System.out.println("a = " + a);
    }
}
