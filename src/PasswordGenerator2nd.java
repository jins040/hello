import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class PasswordGenerator2nd {

    public static void main(String[] args) {

        // input from keyboard
        Scanner in = new Scanner(System.in);

        System.out.println("단어를 하나 입력하세요: ");
        String targetStr = in.nextLine();

        // processing
        String postfix = "##";

        if (targetStr.length() >= 8) {
            // 8자리 이상일 때 로직
            postfix = "";
        }

        String prefix = "$$";

        int squareLengthOfChar = targetStr.length() * targetStr.length();

        targetStr = targetStr.substring(0,1).toUpperCase() + targetStr.substring(1);

        String passwordGenerated = prefix + targetStr + squareLengthOfChar + postfix;

        // the last.. output of the result
        System.out.println(passwordGenerated);

    }



}
