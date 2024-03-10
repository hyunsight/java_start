package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2X3 2차원 배열을 만든다.
        int[][] arr = new int[2][3];

        int i = 1;
        //값 추가
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++; //후위 증감 연산자 사용
            }
        }

        //값 출력
        //이중(중첩) for문의 경우, 2차원 배열과 잘 어울림
        for (int row = 0; row < arr.length; row++) { //행의 길이
            for (int column = 0; column < arr[row].length; column++){ //열의 길이
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); //한 행이 끝나면 라인을 변경한다.
        }
    }
}
