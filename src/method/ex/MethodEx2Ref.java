package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printMessage(message, 3);
        //printMessage("Hello, world!", 3);
        printMessage(message, 5);
        printMessage(message, 7);
    }

    //메서드 사용 시, 코드의 중복을 줄일 수 있음
    public static void printMessage(String message, int times) { //반환값 없고, 출력만 하므로 void
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
