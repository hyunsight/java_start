package array;

public class ArrayRef1 {
    public static void main(String[] args) {
        //int형 배열
        int[] students; //배열 변수 선언, 하나만 선언
        students = new int[5]; //배열 생성, int가 5개 연결되어 있는 길다란 그릇 연상
        System.out.println(students); //I: int형 배열이라는 의미, @ 뒷부분: 메모리의 참조값(메모리 주소) / 16진수로 표현

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        //students[5] = 40; //ArrayIndexOutOfBoundsException 에러 발생

        //변수 값 사용
        System.out.println("학생1 점수 = " + students[0]);
        System.out.println("학생2 점수 = " + students[1]);
        System.out.println("학생3 점수 = " + students[2]);
        System.out.println("학생4 점수 = " + students[3]);
        System.out.println("학생5 점수 = " + students[4]);

        //이 상태에서 for문 사용 불가
        // - 변수명 변경 불가
    }
}
