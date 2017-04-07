/**
 * Created by danawacomputer on 2017-04-04.
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {

        double fahrenheitValue = 100.0;
        double celsiusValue = (fahrenheitValue - 32) / 1.8;

        System.out.println("화씨 온도 : " + fahrenheitValue + "도");
        System.out.println("화씨 -> 섭씨 : " + celsiusValue + "도");

        String celsiusValueDecimalPoint = String.format("%.2f", celsiusValue); // 소수점 자리 연산
        System.out.println("화씨 -> 섭씨 : " + celsiusValueDecimalPoint + "도 (소수점 두 자리)");

    }

}
