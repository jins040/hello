package school;

import school.model.SchoolModel;
import school.service.SchoolService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class SchoolMain {

    public static void main(String[] args) throws Exception{

        // 입력
        BufferedReader br = new BufferedReader(new FileReader("src\\Schools.csv"));

        br.readLine();  // skip first line

        List<SchoolModel> list = new ArrayList<>();

        String tempLine = "";
        while ((tempLine = br.readLine()) != null) {

            String[] splitted = tempLine.split(",");

            list.add(new SchoolModel(splitted[0], splitted[1], splitted[2], splitted[3],splitted[4]));

        }

        // 처리
        // 기능1 : SchoolID 글자 수가 6글자 이상인 SchoolID의 글자를 "..."으로 표시하여 새로운 리스트 생성 ex)albion...
        SchoolService callingService = new SchoolService();
        List<SchoolModel> newList = callingService.getNewList(list);
        for (SchoolModel e : newList) {
            System.out.println(e.getSchoolID());
        }

    }
}
