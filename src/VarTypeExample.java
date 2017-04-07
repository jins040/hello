/**
 * Created by danawacomputer on 2017-04-04.
 */
public class VarTypeExample {

    public static void main(String[] args) {

        // integer type
        int myInt = 2_000_000_000; // 32bit
        /*
         * int myInt; //변수의 선언, 메모리 공간을 확보하다.
         * myInt = 5; //최초로 변수에 값을 담는 행위, 초기화
         *
         * myInt = 7; //재할당, re-assignment, '='연산자는 할당 연산자(왼쪽에는 변수, 오른쪽에는 값)
         */
        long myLong = 1_000_000_000_000_000_000L;   // 64bit, Long 타입은 끝에 L 붙이지 않으면 integer로 인식

        // float type
        double myDouble = 3.14; // 64bit, 소수점이 붙으면 double type으로 인식

        // string type
        String myStr = "Hello world"; // String은 class type

        char myChar = 'a'; // 글자 '한 글자'만, ASCII code

        // boolean type
        boolean myBool = true; // true, false 두 가지 값

        System.out.println(myBool);

    } // 변수의 scope

}
