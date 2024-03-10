package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2X3 2차원 배열을 만든다.
        int[][] arr = { //new int[][] 생략 가능, 배열 안의 배열
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; //행 2, 열 3

        //이중(중첩) for문의 경우, 2차원 배열과 잘 어울림
        for (int row = 0; row < arr.length; row++) { //행의 길이
            for (int column = 0; column < arr[row].length; column++){ //열의 길이
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); //한 행이 끝나면 라인을 변경한다.
        }
    }
}
