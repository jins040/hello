package hashmapex1;

import hashmapex1.service.LoginService;
import hashmapex1.service.LoginServiceImpl;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class LoginMain {

    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("asdf", "1234");

        Scanner in = new Scanner(System.in);

        LoginService service = new LoginServiceImpl();

        while (true) {

            System.out.println("ID와 PW를 입력해주세요.");
            System.out.print("ID : ");
            String id = in.nextLine().trim();

            System.out.print("PW : ");
            String pw = in.nextLine().trim();

            boolean checkID = service.validateUserID(id, map);
            boolean checkPW = service.validatePassword(pw, map);

            if (checkID == false) {
                System.out.println("입력하신 ID는 존재하지 않습니다. 다시 입력해주세요.");
            } else if (checkPW == false) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                System.out.println("ID와 PW가 일치합니다.");
                break;
            }

        }


    }
}
