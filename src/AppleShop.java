/**
 * Created by danawacomputer on 2017-04-04.
 */
public class AppleShop {

    public static void main(String[] args) {

        int iPadProOriginalPrice = 999_000;
        //double dcRate = 15 / 100;   // double 연산에서는 둘 중 하나 실수가 좋다
        double dcRate = 15.0 / 100;

        //double iPadProDiscountedPrice = iPadProOriginalPrice * 85 / 100;

        //double iPadProDiscountedPrice = iPadProOriginalPrice * (1-dcRate);
        //int iPadProDiscountedPrice = (int)(iPadProOriginalPrice * (1-dcRate)); // 실수의 정수화

        int resultPrice = getDiscountedPrice(iPadProOriginalPrice, dcRate);

        System.out.println("iPad Pro 정가 : " + iPadProOriginalPrice + "원");
        System.out.println("15% 할인된 가격 : " + resultPrice + "원");


    }

    public static int getDiscountedPrice(int originalPrice, double discountedRate) {

        int resultPrice = (int)(originalPrice * (1-discountedRate));

        return resultPrice;

    }

}
