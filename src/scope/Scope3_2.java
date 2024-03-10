package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;

        //군더더기 없는 코드
        if (m > 0) {
            int temp = m * 2; //임시 변수
            System.out.println("temp = " + temp);
        } //temp 생존 종료

//        System.out.println(temp); //접근 불가
        System.out.println("m = " + m);
    }
}
