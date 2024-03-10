package casting;

public class Casting4 {
    //계산과 형변환
    public static void main(String[] args) {
        int div1 = 3 / 2; //1.5 -> int
        System.out.println("div1 = " + div1); //1

        double div2 = 3 / 2; 
        System.out.println("div2 = " + div2); //1.0

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); //1.5
        
        double div4 = (double) 3/ 2;
        System.out.println("div4 = " + div4); //1.5
        
        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); //1.5

        //[참고]
        // - 제약의 끝판왕은 '타입' -> 변수에 아무 값이 들어갈 수 있는 이슈 방지 (없으면 어떤 값이 들어가있는지 예상 불가)
    }
}
