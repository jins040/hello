import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class PasswordGenerator2nd {

    public static void main(String[] args) {

        // input from keyboard
        Scanner in = new Scanner(System.in);

        System.out.print("단어를 하나 입력하세요: ");
        String targetStr = in.nextLine();

        // processing

        String prefix = "$$";
        String postfix = "##";

        PasswordGeneratorService passwordGenerated =
                new PasswordGeneratorService();

        String result = passwordGenerated.modifyingChar(targetStr, prefix, postfix);

        // the last.. output of the result
        System.out.println(result);

    }
}
