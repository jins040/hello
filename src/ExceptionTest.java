import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class ExceptionTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.print("숫자를 입력해주세요: ");
            String userInput = in.nextLine();

            try {
                int converted = Integer.parseInt(userInput);
                System.out.printf("당신이 입력한 숫자는 %d입니다.", converted);
                break;
            } catch (NumberFormatException e) {
                System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요.\n");
            }

        }

    }
}
