package loop;

public class While1_1 {
    public static void main(String[] args) {
        int count = 0;

        count = count + 1;
        System.out.println("현재 숫자는:" + count);
        count = count + 1;
        System.out.println("현재 숫자는:" + count);
        count = count + 1;
        System.out.println("현재 숫자는:" + count);
        //반복 작성에 따른 비효율성(및 에러 발생 가능 여지) + 유지보수 악영향
    }
}
