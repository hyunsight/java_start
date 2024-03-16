package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        //함수 사용 통해
        // 1) 입금, 출금에 대한 전체 구조를 한눈에 파악할 수 있음 (목차 느낌, 구조적으로 읽기 쉬움)
        // 2) 입금, 출금 메서드가 명확히 분리되어 있기 때문에 수정 등 유지보수 용이
        //이런 리팩토링을 '메서드 추출'이라고 함
        // - 구조적으로 필요한 부분을 딱 떼어서 메서드로 뽑는 것
        //   : 메서드를 재사용하는 목적이 아니어도 괜찮음
        //   : 구조적으로 비슷한 것을 그룹화, 카테고리화하고 싶은 욕구 (관련된 코드를 묶어둠)
        //좋은 코드란 의도, 목적을 한눈에 알 수 있는 것
        // - 세세하고 지저분한 코드들은 메서드 안으로 숨기고 비즈니스 요구사항을 코드로 바로 읽을 수 있게 만들어내는 것
        //   : 비즈니스의 의도가 이 코드에 바로 보이는 것
        // - 이를 위해 메서드를 적절히 활용

        //입금 1000
        balance = deposit(balance, 1000);

        //출금 2000
        balance = withdraw(balance, 2000);
        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
//            return balance;
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
//            return balance;
        }

        return balance;
    }
}
