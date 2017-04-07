/**
 * Created by danawacomputer on 2017-04-05.
 */
public class ArrayExample {

    public static void main(String[] args) {

        //int[] iArr = new int[10];

        // 전체 주석 Ctrl+'/'
//        System.out.println(iArr);
//
//        int zero = iArr[0];
//
//        iArr[0] = 2;
//        iArr[1] = 4;
//        iArr[2] = 6;
//        iArr[3] = 8;
//        iArr[4] = 10;
//        iArr[5] = 12;
//        iArr[6] = 14;
//        iArr[7] = 16;
//        iArr[8] = 18;
//        iArr[9] = 20;
//
//        System.out.println(iArr[0]);
//        System.out.println(iArr[1]);
//        System.out.println(iArr[2]);
//        System.out.println(iArr[3]);
//        System.out.println(iArr[4]);
//        System.out.println(iArr[5]);

        int[] iArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19
                ,20,21,22,23,24,25,26,27,28,29,30};

//        // 369게임
//        for (int e : iArr) {
//            String numberToString = String.valueOf(e);
//
//            if (numberToString.contains("3") || numberToString.contains("6") || numberToString.contains("9")) {
//                System.out.println("짝!");
//            } else {
//                System.out.println(e);
//            }
//        }

        // 배열에 숫자가 몇 개 있는지 알 수 없다는 전제 하에서 모든 숫자의 평균
        // 너무 커질 것 같으면 "long totalSum = 0L" 같은 것으로 지정하기도 한다.

        double result = calcAverage(iArr);

        //System.out.printf("전체 숫자 갯수는 %d개, 전체 합은 %d, 전체 평균은 %.2f.", iArr.length, totalSum, totalAverage);
        System.out.printf("전체 평균은 %.2f", result);

//        for (int e : iArr) {
//            if (e % 5 == 0) {
//                System.out.println("Bingo!");
//            } else {
//                System.out.println(e);
//            }
//        }

    }

    public static double calcAverage(int[] intArr) {

        int sum = 0;

        for (int e : intArr) {
            sum += e;
        }

        return (double) sum / intArr.length;
    }
}
