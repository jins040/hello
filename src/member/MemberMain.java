package member;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class MemberMain {

    public static void main(String[] args) {

        Member jinsuk = new Member();
        jinsuk.setName("이진석");
        jinsuk.setAge(26);
        jinsuk.setHpnum("010-2979-0767");
        jinsuk.setEmail("jins920409@gmail.com");

        Member lucyRyu = new Member("류승아", 25, "010-9377-6928", "loveyou_06@naver.com");
        Member sona = new Member("류관리", 25, "010-2478-1378", "sona.ria.sss@gmail.com");
        Member taejun = new Member("김태준", 27, "010-6256-7334", "kim19911211@gmail.com");
        Member alix = new Member("이가원", 25, "010-6439-5943", "dlrkdnjs1211@gmail.com");
        Member wnstjd = new Member("임준성", 20, "010-9972-8210", "wnstjd9972@gmail.com");
        Member sen = new Member("김세원", 27, "010-4734-6373", "sewon0613@naver.com");
        Member bongBong = new Member("이기봉", 26, "010-3009-5732", "lkb573@gmail.com");
        Member jjinha = new Member("진하영", 24, "010-3033-3247", "vnfflvdl1@gmail.com");

        List<Member> list = Arrays.asList(
          jinsuk, lucyRyu, sona, taejun, alix, wnstjd, sen, bongBong, jjinha
        );

        // 클래스 호출

        Scanner in = new Scanner(System.in);

        MemberService classInMemberService = new MemberService();

        double averageAge = classInMemberService.calcAverageAge(list);
        System.out.printf("1. ds11반 구성원 평균 나이는 %.1f세입니다.\n\n", averageAge);

        //String specificLastName = "이";
        System.out.print("2. 성(Last name)을 입력해주세요. ");
        String specificLastName = in.nextLine();
        int havingSpicificLastName = classInMemberService.howManyMemberswithLastName(list, specificLastName);

        System.out.printf("%s씨 성을 가진 구성원 수는 %d명입니다.\n\n", specificLastName, havingSpicificLastName);
        double averageIdChar = classInMemberService.calcAverageIdChar(list);

        System.out.printf("3. 구성원 Email ID 글자 수 평균은 %.1f글자입니다.\n", averageIdChar);

    }
}
