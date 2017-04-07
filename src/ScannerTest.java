import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-04.
 */
public class ScannerTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // in이라는 Scanner type 변수

        System.out.println("단어를 입력하시고 엔터를 치세요.");
        String inputted = in.nextLine();  // nextLine 함수 만나면 키보드 입력될때까지 정지, 엔터 키 치기 전까지 값 입력

        System.out.println("키보드로 입력한 글자는 : " + inputted);


    }
}
