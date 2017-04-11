package inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class InheritanceTest {

    public static void main(String[] args) {

        Child c = new Child();
        // c.~~ 할 때 자신의 method는 볼드체로, 상속 받은 것은 그냥 나온다.

        Parent p = new Child();
        // Type은 부모, 할당되는 값은 자손이더라도 성립한다. "Child is a Parent" (역은 성립하지 않는다.)
        List a = new ArrayList();
        List<String> aa = new ArrayList<>();


        c.smoke();
        p.smoke();  // 실행될 때 기준, Late Binding


    }
}
