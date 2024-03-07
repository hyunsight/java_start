package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;

        //for문 용도
        // - i(카운트 변수)는 반복문을 위한 변수로 for문 밖에서는 사용 불가 (명확)
        // - 반대로 while문에서는 i를 반복문 밖에서 선언하므로 밖에서도 사용 가능 (범위가 무조건 쓸데없이 넓은 것은 좋은 것이 아님)
        for (int i = 1; ; i++) {//무한 반복
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i =" + i + " sum =" + sum);
                break;
            }
        }
    }
}
