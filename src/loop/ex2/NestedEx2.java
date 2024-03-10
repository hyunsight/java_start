package loop.ex2;

public class NestedEx2 {
    public static void main(String[] args) {
//        System.out.print("1");
//        System.out.println("2");

        //기대 결과값
        System.out.print("*");
        System.out.println();

        System.out.print("*");
        System.out.print("*");
        System.out.println();

        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.println();

        //풀이
        /*
        int rows = 3;
        String sum = "";

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++ ) {
               sum += "*";
                System.out.println(sum);
            }
        }
        */

        //답안
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
