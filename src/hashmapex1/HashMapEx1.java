package hashmapex1;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class HashMapEx1 {

    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("asdf", "1234");

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("ID와 PW를 입력해주세요.");
            System.out.print("ID : ");
            String id = in.nextLine().trim();

            System.out.print("PW : ");
            String pw = in.nextLine().trim();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 ID는 존재하지 않습니다. 다시 입력해주세요.");
            } else if (!map.containsValue(pw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                System.out.println("ID와 PW가 일치합니다.");
                break;
            }

        }

    }
}
