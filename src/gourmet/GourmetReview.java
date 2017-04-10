package gourmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GourmetReview {

    public static void main(String[] args) {

//        // 맛집 객체를 5개 만든다.
//        Gourmet spoon = new Gourmet();
//        spoon.title = "숟가락반상 마실";
//        spoon.mainMenu = "한정식, 떡갈비, 갈비찜";
//        spoon.score = 111;
//        Gourmet sushi = new Gourmet();
//        sushi.title = "스시메이진";
//        sushi.mainMenu = "스시, 스시뷔페";
//        sushi.score = 70;
//        Gourmet chan = new Gourmet();
//        chan.title = "맛찬들";
//        chan.mainMenu = "한정식, 떡갈비, 갈비찜";
//        chan.score = 49;
//        Gourmet choi = new Gourmet();
//        choi.title = "최우영스시";
//        choi.mainMenu = "한정식, 떡갈비, 갈비찜";
//        choi.score = 49;
//        Gourmet ranch = new Gourmet();
//        ranch.title = "철판목장";
//        ranch.mainMenu = "한정식, 떡갈비, 갈비찜";
//        ranch.score = 46;

        // get set 적용
        Gourmet spoon = new Gourmet();                  // Gourmet(): 생성자, Gourmet 클래스에 생략되어있음
        System.out.println("이 라인은 생성자 호출 바로 후에 실행될거에요");    // 개발자 로그
        spoon.setTitle("숟가락반상 마실");
        spoon.setMainMenu("한정식, 떡갈비, 갈비찜");
        spoon.setScore(111);

        Gourmet sushi = new Gourmet();
        sushi.setTitle("스시메이진");
        sushi.setMainMenu("스시, 스시뷔페");
        sushi.setScore(70);

        Gourmet chan = new Gourmet();
        chan.setTitle("맛찬들");
        chan.setMainMenu("한정식, 떡갈비, 갈비찜");
        chan.setScore(49);

        Gourmet choi = new Gourmet();
        choi.setTitle("최우영스시");
        choi.setMainMenu("한정식, 떡갈비, 갈비찜");
        choi.setScore(49);

        Gourmet ranch = new Gourmet();
        ranch.setTitle("철판목장");
        ranch.setMainMenu("한정식, 떡갈비, 갈비찜");
        ranch.setScore(46);

        Gourmet yongho = new Gourmet("용호낙지", "낙새, 낙곱새", 46);


        // 맛집 객체를 리스트(하나의 변수)에 담는다.
        List<Gourmet> list = Arrays.asList(
                spoon, sushi, chan, choi, ranch
        );
//        List<Gourmet> list = new ArrayList<>();
//
//        list.add(spoon);
//        list.add(sushi);
//        list.add(chan);
//        list.add(choi);
//        list.add(ranch);

        // 맛집 점수의 평균

//        int sum = 0;
//
//        for (Gourmet e : list) {
//            sum += e.score;
//        }
//
//        double average = (double)sum / list.size();

        GourmetService averageGourmetScore = new GourmetService();
        double result = averageGourmetScore.calcAverageScore(list);

        System.out.printf("맛집 점수의 평균은 %.1f점입니다.", result);


        // 실행할 때마다 결과 값이 바뀔 수도 있는 함수
        Gourmet g1 = new Gourmet("a", "b", 25);
        Gourmet g2 = new Gourmet("a", "b", 30);

        g1.getScore();
        g2.getScore();  // g1과 g2에서 같은 호출 방식이지만 결과 값이 다르다. (특정 데이터를 사용하기 때문)
                        // 변경 가능한 다른 data를 사용한다 => Method (객체를 '먼저' 생성하고 사용)

    }
}
