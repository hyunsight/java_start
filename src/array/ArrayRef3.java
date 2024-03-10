package array;

public class ArrayRef3 {
    public static void main(String[] args) {
        //int형 배열
        int[] students; //배열 변수 선언, 하나만 선언
        students = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화
        //배열 기능 2. '초기화'
        // - 배열 생성 시, 값을 넣어둘 수 있음

        System.out.println(students); //I: int형 배열이라는 의미, @ 뒷부분: 메모리의 참조값(메모리 주소) / 16진수로 표현
        System.out.println(students.length);


        //리팩토링
        // - 밖에서 볼 때는 기능은 똑같은데, 내부 코드의 구조 개선
        //변수 값 사용
        // - 배열의 사이즈가 정해져 있으므로 for문과 같이 사용하면 좋음(적합)
        //배열 기능 1. '.length'
        // - 배열의 길이를 반환 (조회만 가능, 대입 불가능)
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수 = " + students[i]);
        }
    }
}
