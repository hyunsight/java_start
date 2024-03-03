package cond;

public class If1 {

    public static void main(String[] args) {
        int age = 20; //사용자 나이

        if (age >= 18) { //true
            //조건이 참일 시의 실행 코드 블록
            System.out.println("성인입니다.");
        }

        if (age < 18) {
            System.out.println("미성년자입니다."); //false이므로 해당 코드 블록을 실행하지 않고, 바로 코드 블록 끝으로 옴
        }
    }
}
