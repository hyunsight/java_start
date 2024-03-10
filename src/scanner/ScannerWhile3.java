package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0; //사용자 입력 계속 더해야하므로, [참고] while문은 밖에서 선언, while문 안에서 선언할 시 계속 초기화

        while (true) {
            System.out.print("정수를 입력하세요. (0을 입력하면 종료): ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
        }
        //while문 빠져나갔을 때의 최종 결과
        System.out.println("입력한 모든 정수의 합: " + sum);

    }
}
