package scope;

public class Scope1 {

    //지역 변수: 본인의 코드 블록 안에서만 생존 (블록 벗어나면 제거)
    //스코프: 변수의 접근 가능한 범위
    public static void main(String[] args) {
        int m = 10; //m 생존 시작 (main문 {} 블록 안에서)

        if(true) {
            int x = 20; //x 생존 시작 (if문 {} 블록 안에서)
            System.out.println("if m = " + m); //if문 안에서도 접근 가능
            System.out.println("if x = " + x);
        } //x 생존 종료
        //System.out.println("main x = " + x); //생존 불가로 컴파일 오류 발생
        System.out.println("main m = " + m);
    } //m 생존 종료
}
