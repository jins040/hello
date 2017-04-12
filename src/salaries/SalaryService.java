package salaries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class SalaryService {

    // 1번
    public static Salary findingBestSalary(List<Salary> list) {

        Salary result = new Salary();

        for (Salary e : list) {
            if (e.getSalaryOfPlayer() > result.getSalaryOfPlayer()) {
                result = e;
            } else {}
        }

        return result;
    }


    // 2번
    public static Salary findingWorstSalary(List<Salary> list) {

        Salary result = new Salary();

        int tempValue = list.get(0).getSalaryOfPlayer();

        for (Salary e : list) {
            if (e.getSalaryOfPlayer() < tempValue) {
                tempValue = e.getSalaryOfPlayer();
                result = e;
            } else {}
        }

        return result;
    }


    // 3번
    public static double calcAverageSalary(List<Salary> list) {

        long totalSum = 0;

        for (Salary e : list) {
            totalSum += e.getSalaryOfPlayer();
        }

        return (double)totalSum / list.size();
    }


    // 4번
    public static List<Double> calcAverageYearlySalary(List<Salary> list) {

        List<Double> tempList = new ArrayList<>();

        int tempNum = 1985;
        long totalSum = 0;
        int countNum = 0;

        for (Salary e : list) {
            if (e.getYearID().equals(Integer.toString(tempNum))) {
                if (e == list.get(list.size()-1)) {                 // 마지막 2016년도는 for문 다 돌면 끝나기 때문에 특별히 설정(마지막 element일 때)
                    tempList.add((double) totalSum / countNum);
                } else {
                    totalSum += e.getSalaryOfPlayer();
                    countNum++;
                }
            } else {
                tempList.add((double)totalSum / countNum);          // 년도가 바뀔 때 지금까지 연산한 값을 넣어주고 다시 리셋
                totalSum = e.getSalaryOfPlayer();
                countNum = 1;
                tempNum++;
            }
        }

        //System.out.println(tempList.size());
        return tempList;

    }

}
