package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        //여러가지 변수 선언 가능
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }

        //단, 더 좋은 코드는 아래와 같음
        int num = 2;

        for (int count = 1; count <= 10; count++) { //count: 증감식에 쓰일 카운트변수 (다른 용도로 사용하면 번잡해지므로 반복문에만 사용하는게 적합)
            System.out.println(num);
            num += 2;
        }
    }

}
