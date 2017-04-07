/**
 * Created by danawacomputer on 2017-04-04.
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        int celsiusValue = 22;

        Celsius2FahrenheitService service =
                new Celsius2FahrenheitService();    // 객체화 작업 'sevice'가 객체

        double result = service.toFahrenheit(celsiusValue);

        System.out.println("섭씨 온도 : " + celsiusValue + "도");
        System.out.println("섭씨 -> 화씨 : " + result + "도\n");

        int intNumber = 10;
        double intPlusDouble = celsiusValue + intNumber;

        System.out.println("ex) 22.0 + 10 = " + intPlusDouble + " (int값 + double값 = double값)");

    }
}
