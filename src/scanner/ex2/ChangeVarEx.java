package scanner.ex2;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        /*
        temp = b;
        b = a;
        a = temp;
        */

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
