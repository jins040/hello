package oop;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ClassMemberExampleTest {

    public static void main(String[] args) {

        ClassMemberExample cme = new ClassMemberExample();  // 객체를 heap에 올리는 과정(Class loading)

        int b = ClassMemberExample.getStaticTest(); // Class를 통해 바로 접근(static method)

        int a = ClassMemberExample.CLASS_MEMBER;    // static 변수는 Class에서 바로 호출 가능
                                                    // static 변수는 모든 객체가 공유할 수 있는 것, 현재는 상수 정의할 때 사용
        System.out.println(a);
        System.out.println(b);

        double r = Math.random();   // 대표적인 pure function이 아닌 함수(random), 0~1 범위
        System.out.println(r);

        // 주사위
        int dice = (int)(Math.random()*6 + 1);
        System.out.println(dice);

    }
}
