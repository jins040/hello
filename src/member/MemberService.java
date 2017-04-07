package member;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class MemberService {

    public double calcAverageAge(List<Member> list) {   // 구성원 평균 나이 계산 클래스

        int sum = 0;

        for (Member e : list ) {
            sum += e.getAge();
        }

        return (double)sum / list.size();

    }

    public int howManyMemberswithLastName (List<Member> list, String lastName) {    // 특정 성을 가지는 인원 파악 클래스

        int countNum = 0;

        for (Member e : list) {
            if (e.getName().contains(lastName)) {
                countNum++;
            } else {}
        }

        return countNum;

    }

    public double calcAverageIdChar (List<Member> list) {   // 이메일 주소 중 @전에 나오는 ID 글자 수 평균 계산 클래스

        List<String> idOfEmail = new ArrayList<>();
        int sum = 0;

        for (Member e : list) {
            idOfEmail.add(e.getEmail().substring(0, e.getEmail().indexOf("@")));
            // System.out.println(idOfEmail);
        }

        for (String e : idOfEmail) {
            sum += e.length();
        }

        return (double)sum / list.size();

    }
}
