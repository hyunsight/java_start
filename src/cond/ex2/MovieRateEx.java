package cond.ex2;

public class MovieRateEx {
    public static void main(String[] args) {
        double rating = 7.1; //내가 요청한 평점 (추천된 영화는 해당 평점 이상이 되어야 함)

        //여러개 추천되어야 하므로 if문 묶으면 안됨
        if(rating <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }

        if (rating <= 8) {
            System.out.println("'토이스토리'를 추천합니다.");
        }

        if (rating <= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }

    }
}
