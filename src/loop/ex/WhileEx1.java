package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 10) {
            System.out.println(count);
            count++;
            //System.out.println(count++);도 가능
        }
    }
}
