package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2)); //int형 함수 주석 처리해도 자동 형변환으로 가능
        //기본적으로는 본인의 타입에 맞는 함수를 찾는 것이 1순위 > 없다면 자동 형변환(casting)으로 가능한 함수를 찾음
        System.out.println("2: " + add(1.2, 1.5));
    }

    //매개 변수의 타입이 다른 오버로딩 #2
//    public static int add(int a, int b) {
//        System.out.println("1번 호출");
//        return a + b;
//    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
