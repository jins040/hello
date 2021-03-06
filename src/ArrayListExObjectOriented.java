import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ArrayListExObjectOriented {

    public static void main(String[] args) {

        String review =
                "오늘의 2번째 포스팅역시 맛집! 주말에 남자친구랑 너무 맛있게 " +
                        "먹고온 구로 초밥뷔페를 추천해드리려고하는데요!! " +
                        "구로 초밥뷔페집의 이름은 스시메이진 이라는 곳이에요^^♥";

        // 1. review 스트링을 리스트로 변환
        // 공백을 기준으로 분리 (공백을 딜리미터로 분리)
        List<String> stringArrayList = Arrays.asList(review.split("\\s"));  // 공백은 "\\s"로 해도 되고 " "로 해도 된다.

        System.out.println("1. review 스트링을 리스트로 변환");

        System.out.println(stringArrayList + "\n");

        // 2. 리스트를 순회해서 전체 단어의 글자수의 평균을 구한다.

        double totalAverage = findingAverageOfChar(stringArrayList);    // 함수화1

        System.out.printf("2. 전체 단어 글자 수의 평균은 %.2f입니다.\n\n", totalAverage);

        // 3. 단어가 5자 이하인 새로운 리스트를 생성한다.

        List<String> listUnderFiveLetter = findingConditionalLetter(stringArrayList);   // 함수화2

        System.out.println("3. 단어가 5자 이하인 새로운 리스트");

        System.out.println(listUnderFiveLetter);

    }

    public static double findingAverageOfChar(List<String> strArrayList) {

        int totalSum = 0;
        double totalAverage = 0;

        for (String e : strArrayList) {
            totalSum += e.length();
        }

        totalAverage = (double)totalSum / strArrayList.size();   // Array List에서는 length() 대신 size()

        return totalAverage;

    }

    public static List<String> findingConditionalLetter(List<String> strArrayList) {

        List<String> listUnderFiveLetter = new ArrayList<>();

        for (String e : strArrayList) {
            if(e.length() <= 5 ) {
                listUnderFiveLetter.add(e);
            }
        }

        return listUnderFiveLetter;

    }

}
