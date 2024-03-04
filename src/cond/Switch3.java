package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break; //break하지 않을 시, 조건 만족해도 밑에 있는 코드까지 실행됨

            case 2:
            case 3:
                coupon = 3000;
                break;

            default: //else
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
