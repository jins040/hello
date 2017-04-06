import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class StringArrayExampleArrayListVer {

    public static void main(String[] args) {

        String[] strArr = {
                "숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지", "은행골", "메이비", "돌배기집"
                , "구로곱창", "두끼", "아비꼬", "마루가메제면", "킹통부대찌개", "바른식탁", "말뚝곱창", "보나베띠", "춘자싸롱"
                , "황제해물보쌈", "호우 양꼬치"
        };

//        List<String> gourmet = new ArrayList<>();
//        gourmet.add("숟가락반상 마실");
//        gourmet.add("스시메이진");
//        ...

        List<String> gourmet = Arrays.asList(
                "숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지", "은행골", "메이비", "돌배기집"
                , "구로곱창", "두끼", "아비꼬", "마루가메제면", "킹통부대찌개", "바른식탁", "말뚝곱창", "보나베띠", "춘자싸롱"
                , "황제해물보쌈", "호우 양꼬치"
        );

        List<String> gourmetUnderThreeChar = new ArrayList<>();

        for (String e : gourmet) {
            if (e.length() <= 3) {
                gourmetUnderThreeChar.add(e);
            }
        }

        // 새로 만들어진 리스트 출력
        for (String e : gourmetUnderThreeChar) {
            System.out.print(e + " ");
        }

    }
}
