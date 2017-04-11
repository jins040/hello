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
        int totalSum = 0;
        int countNum = 0;

        for (Salary e : list) {
            if (e.getYearID().equals(Integer.toString(tempNum))) {
                totalSum += e.getSalaryOfPlayer();
                countNum++;
            } else {
                tempList.add((double)totalSum / countNum);
                totalSum = e.getSalaryOfPlayer();
                countNum = 1;
                tempNum++;
            }
        }

        System.out.println(tempList.size());
        return tempList;

    }

}
