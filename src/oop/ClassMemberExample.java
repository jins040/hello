package oop;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ClassMemberExample {

    // 필드
    public static int CLASS_MEMBER = 5; // static 변수가 붙으면 상수로 취급한다, Naming을 대문자로, private이 아닌 public으로 선언
                                        // static method
    private int number;
    private String aString;

    // 생성자

    public static int getStaticTest()   {       // static method를 만든다, 좌측에 골뱅이 표시
        return 15;
    }

    public int getNumber(int i) {return 5;}           // method overloading, 같은 함수 이름이라도 파라미터 다르면 호출 가능


    public int getNumber() {            // instance method
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getaString() {
        return aString;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }
}
