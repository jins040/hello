package hall;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class NullUtil {

    public static int toInt(String s) {                                 //class에서 바로 호출할 수 있도록 static 선언

//        if (s == null || s.equals("")) {
//            return 0;
//        } else {
//            return Integer.parseInt(s);
//        }

        return (s == null || s.equals("")) ? 0 : Integer.parseInt(s);

    }


}
