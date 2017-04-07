/**
 * Created by danawacomputer on 2017-04-07.
 */
public class PasswordGeneratorService {

    public String modifyingChar(
            String inputtedChar, String prefix, String postfix) {

        if (inputtedChar.length() >= 8) {
            // 8자리 이상일 때 로직
            postfix = "";
        }

        int squareLengthOfChar = inputtedChar.length() * inputtedChar.length();

        inputtedChar = inputtedChar.substring(0,1).toUpperCase() + inputtedChar.substring(1);

        return prefix + inputtedChar + squareLengthOfChar + postfix;

    }
}
