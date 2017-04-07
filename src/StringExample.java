/**
 * Created by danawacomputer on 2017-04-04.
 */
public class StringExample {

    public static void main(String[] args) {

        String myStr = "Hello, World!";
        String myStr2 = "안녕하세요!";

        String result = myStr + myStr2; // +는 이항연산, 숫자일 때는 덧셈, 문자일 때는 결합연산

        String result2 = myStr + 3;

        String toLowerCase = myStr.toLowerCase(); // 전부 소문자로 바꿔라

        String sliced = myStr.substring(0,5);

        boolean b = myStr.contains("Wor");

        boolean s = myStr.startsWith("He");

        System.out.println(result);
        System.out.println(result2);
        System.out.println(toLowerCase);
        System.out.println(sliced);
        System.out.println(b);
        System.out.println(s);

    }
}
