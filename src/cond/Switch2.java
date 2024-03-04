package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;

        //if문과 다르게 switch문은 논리로 나오는 조건이 아닌 단순한 값이 들어감
        switch (grade) {
            case 1:
                coupon = 1000;
                break;

            case 2:
                coupon = 2000;
                break;

            case 3:
                coupon = 3000;
                break;

            default: //else
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
