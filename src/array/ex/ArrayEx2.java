package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
//        numbers[0] = scanner.nextInt();
//        numbers[1] = scanner.nextInt();
//        numbers[2] = scanner.nextInt();
//        numbers[3] = scanner.nextInt();
//        numbers[4] = scanner.nextInt();

        //for문 사용 방안
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
//            if(i != 4) {
              //정답 방안
              if(i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
