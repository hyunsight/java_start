package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        //a는 10보다 크고 20보다 작다
//        boolean result = a > 10 && a < 20; //(a > 10) && (a < 20)
        boolean result = 10 < a && a < 20; //위와 동일한 문장이나, 가독성 측면에서 좋음
        System.out.println("result = " + result);
    }
}