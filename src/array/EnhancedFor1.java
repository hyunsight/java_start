package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //단축키: iter
        // - 향상된 for문 생성
//        for (int number : numbers) {
//
//        }

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for ~ each문
        // - 실무에서 가장 많이 사용
        for (int number : numbers) {
            System.out.println(number);
        }

        //for ~ each문(향상된 for문)을 사용할 수 없는 경우 (예외 케이스), 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]); //index 값 필요 (몇번째 결과 출력)
        }
        //향상된 for문에서는 i(카운트 변수)가 없으므로 사용 불가
        //따라서 증가하는 인덱스를 루프 안에서 직접 써야할 때는 for ~ each문 사용 불가 및 기존 for문 사용 필요
        // - int i = 0;을 밖에서 선언 후 향상된 for문을 사용하는 것은 가능하나, for문 안에서만 사용되는 변수이므로
        //   이 경우 일반 for문 사용하는 것이 나음
    }
}
