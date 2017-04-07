/**
 * Created by danawacomputer on 2017-04-04.
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        int celsiusValue = 22;

        double result = toFahrenheit(celsiusValue);

        System.out.println("섭씨 온도 : " + celsiusValue + "도");
        System.out.println("섭씨 -> 화씨 : " + result + "도\n");

        int intNumber = 10;
        double intPlusDouble = celsiusValue + intNumber;

        System.out.println("ex) 22.0 + 10 = " + intPlusDouble + " (int값 + double값 = double값)");

    }

    public static double toFahrenheit(int celsius) {

        return (celsius * 1.8) + 32;

    }

}
