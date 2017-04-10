package majorleague;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ParkMain {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("src\\Parks.csv");

        BufferedReader br = new BufferedReader(fr);

        // 1. List<Park>
        List<Park> list = new ArrayList<>();

        String line = "";
        while ((line = br.readLine()) != null) {

            String [] splitted = line.split(",");

            Park tempClass = new Park(
                    splitted[0], splitted[1], splitted[2], splitted[3], splitted[4], splitted[5]);

            list.add(tempClass);
        }

        ParkService classOfPark = new ParkService();

        // 1. List<Park>


        // 2. 국가가 US가 아닌 볼 파크 수? int
        int result1 = classOfPark.parkNumOfNoneUS(list);
        System.out.printf("2. 국가가 US가 아닌 볼 파크 수는 %d개입니다.\n", result1);

        // 3. 별명이 있는 볼 파크 수? int
        int result2 = classOfPark.parkNumHavingAlias(list);
        System.out.printf("3. 별명이 있는 볼 파크 수는 %d개입니다.\n", result2);

        // 4. 볼 파크 이름의 글자 평균? double
        double result3 = classOfPark.averageOfParkNameNum(list);
        System.out.printf("4. 볼 파크 이름 글자 수 평균은 %.2f개입니다.\n", result3);

    }
}
