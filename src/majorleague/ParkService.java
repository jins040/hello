package majorleague;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class ParkService {

    // 2번
    public int parkNumOfNoneUS(List<Park> list) {

        int countNum = 0;

        for (Park e : list) {
            if(e.getCountry().equals("US")) {

            } else{
                countNum++;
            }
        }

        return countNum;
    }

    // 3번
    public int parkNumHavingAlias(List<Park> list) {

        int countNum = 0;

        for (Park e : list) {
            if(e.getParkAlias().equals("")) {

            } else{
                countNum++;
                System.out.println(e.getParkAlias());
            }
        }

        return countNum;
    }

    // 4번
    public double averageOfParkNameNum(List<Park> list) {

        int totalSum = 0;

        for (Park e : list) {
            totalSum += e.getParkName().length();
        }

        return (double)totalSum / list.size();
    }

}
