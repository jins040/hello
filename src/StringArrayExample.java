/**
 * Created by danawacomputer on 2017-04-05.
 */
public class StringArrayExample {

    public static void main(String[] args) {

        String[] strArr = {
                "숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지", "은행골", "메이비", "돌배기집"
                , "구로곱창", "두끼", "아비꼬", "마루가메제면", "킹통부대찌개", "바른식탁", "말뚝곱창", "보나베띠", "춘자싸롱"
                , "황제해물보쌈", "호우 양꼬치"
        };

        //1. element 글자 수의 평균 구하기
        int totalNumberOfStrings = 0;
        int countNumber = 0;
        double totalAverage = 0;

        for (String e : strArr) {
            totalNumberOfStrings += e.length();
            countNumber += 1;
        }

        totalAverage = (double)totalNumberOfStrings / countNumber;

        System.out.printf("전체 element 글자 수 평균값은 %.2f입니다. (전체 글자 수는 %d개, 총 string 수는 %d개)\n\n",
                totalAverage, totalNumberOfStrings, countNumber);

        //2. 글자수가 3글자 이하인 엘레먼트의 배열을 만드세요.
        String[] arrayLessThanThreeLetter = new String[strArr.length];

        int arrayCount = 0;

        for (String e : strArr) {
            if (e.length() <= 3) {
                arrayLessThanThreeLetter[arrayCount] = e;
                arrayCount++;
            } else {
            }
        }

        System.out.println("<글자 수가 3글자 이하인 element 배열 목록>");

        for (String e : arrayLessThanThreeLetter) {
            System.out.print(e + " ");
        }


    }
}
