package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 0;

        //count = 1, count = 2 / count = 3일 때 false이므로 while문 끝으로 가서 빠져나옴
        while (count < 3) {
            count = count + 1;
            System.out.println("현재 숫자는:" + count);
        }
    }
}
