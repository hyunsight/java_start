package scanner.ex3;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt();
            input.nextLine();
            //input.nextLine(); 쓰는 이유
            //1) '10\n' 입력 시 nextInt는 숫자만, 즉 10만 가져가서 '\n' 남음
            //2) '\n'가 사용자 입력으로 남아 아무 글자가 없는 것으로 처리되어 nextLine에서 "" 빈문자로 들어가게 됨
            //   (nextLine은 line까지 읽어오는 것)
            //3) 빈문자 읽어주고 버리는 역할

            System.out.println("입력한 이름: " + name + ", 나이: " + age);

        }
    }
}
