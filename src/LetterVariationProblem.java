/**
 * Created by danawacomputer on 2017-04-04.
 */
public class LetterVariationProblem {

    public static void main(String[] args) {

        String myStr = "soongon";

        String exceptFirstLetter = myStr.substring(1);
        String firstLetter = myStr.substring(0,1);

        String combination = exceptFirstLetter + firstLetter;

        String combinationWithAy = combination + "ay";

        System.out.println(combinationWithAy);

        //indexOf 기능 사용
        String myStr2 = "soongon.kim";

        String specificPoint = myStr2.substring(0, myStr2.indexOf("."));

        System.out.println(specificPoint);

    }

}
