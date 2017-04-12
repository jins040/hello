package majorleague2;

import majorleague2.model.Park;
import majorleague2.service.ParkService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ParkMain {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("src\\Parks.csv");

        BufferedReader br = new BufferedReader(fr);

        // 입력
        List<Park> list = new ArrayList<>();

        br.readLine();                                                                              // skip first line
        String line = "";
        while ((line = br.readLine()) != null) {

            String[] splitted = line.split(",");    // List<String> splitted = Arrays.asList(line.split(",");

            list.add(new Park(splitted[0], splitted[1], splitted[2], splitted[3], splitted[4], splitted[5]));                                                                    // 메모리에 올리는 과정
        }


        ParkService classOfPark = new ParkService();

        // 1. List<Park>
        System.out.println("1. List<Park> 호출");
        for (Park e : list) {
            System.out.printf("[%s / %s / %s / %s / %s / %s]\n",
                    e.getParkKey(), e.getParkName(), e.getParkAlias(), e.getCity(), e.getState(), e.getCountry());
        }

        // 2. 국가가 US가 아닌 볼 파크 수? int
        int parkNumOfNoneUS = classOfPark.countingNumOfNoneUS(list);
        System.out.printf("\n2. 국가가 US가 아닌 볼 파크 수는 %d개입니다.\n\n", parkNumOfNoneUS);

        // 3. 별명이 있는 볼 파크 목록? List<String>
        List<String> parkListHavingAlias = classOfPark.findParkHavingAlias(list);
        System.out.println("3. 별명을 갖고 있는 볼 파크 목록: ");
        System.out.println(parkListHavingAlias);
        System.out.printf("별명을 갖고 있는 볼 파크 갯수는 %d개입니다.\n\n", parkListHavingAlias.size());

        // 4. 볼 파크 이름의 글자 평균? double
        double averageValue = classOfPark.averageOfParkNameNum(list);
        System.out.printf("4. 볼 파크 이름 글자 수 평균은 %.2f개입니다.\n", averageValue);

    }
}
