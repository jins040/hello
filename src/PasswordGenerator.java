import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-04.
 */
public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("*패스워드 생성기");

        System.out.println("1. 단어를 입력하세요.");
        String inputtedCharacter = in.nextLine();   // 키보드에서 단어 입력받기

        System.out.println(inputtedCharacter);

        System.out.println("\n2. $$ + 첫 글자를 대문자로 + 글자 수의 제곱 + ##");

        String slicingFirstLetter = inputtedCharacter.substring(0,1);   //첫 번 째 글자 추출
        String exceptFirstLetter = inputtedCharacter.substring(1);

        String firstLetterToCapital = slicingFirstLetter.toUpperCase(); // 첫 번 째 글자 대문자로 변경

        int numberOfCharacter = inputtedCharacter.length(); // 글자 수 카운트
        int squareNumberOfCharacter = numberOfCharacter * numberOfCharacter;    // 글자 수 제곱

        String finalPassword = "$$" + firstLetterToCapital + exceptFirstLetter + squareNumberOfCharacter + "##";

        System.out.println(finalPassword);


    }
}
