package variable;

public class Var6 {
    public static void main(String[] args) {
        int a;
        //System.out.println(a); //(지역) 변수 초기화하지 않은 상태에서 바로 실행할 경우, 컴파일 에러 출력
        //컴파일 후 out(class) 폴더에서 int a가 보이지 않는 이유는 자바가 최적화했기 때문에 (변수를 선언했지만 사용하지 않으므로 메모리만 차지 > 따라서 메모리 관리 역할!)
    }
}
