package salaries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class SalaryMain {

    public static void main(String[] args) throws Exception {

        // data loading from csv
//        FileReader fr = new FileReader("src\\Salaries.csv");
//        BufferedReader br = new BufferedReader(fr);

        BufferedReader br = new BufferedReader(new FileReader("src\\Salaries.csv"));

        br.readLine();

        // 입력
        List<Salary> list = new ArrayList<>();

        String tempLine = "";

        while ((tempLine = br.readLine()) != null) {

            String[] splitted = tempLine.split(",");
            list.add(new Salary(splitted[0], splitted[1], splitted[2], splitted[3], Integer.parseInt(splitted[4])));
        }


        //SalaryService callSalaryService = new SalaryService();                    // class에서 Method에 static 선언 해주면 그냥 사용 가능

        // 1. 최고 연봉을 가지는 선수 객체 불러오기
        Salary classHavingMaxSalary = SalaryService.findingBestSalary(list);

        System.out.printf("1. 최고 연봉을 가지는 선수 객체 : ");
        System.out.println(classHavingMaxSalary);                                   // Model Class에서 toString() 선언해주면 바로 값 나온다.

        // 2. 최저 연봉을 가지는 선수 객체 불러오기
        Salary classHavingMinSalary = SalaryService.findingWorstSalary(list);
        System.out.printf("\n2. 최저 연봉을 가지는 선수 객체 : ");
        System.out.println(classHavingMinSalary);

        // 3. 선수들 평균 연봉
        double averageSalary = SalaryService.calcAverageSalary(list);
        System.out.printf("\n3. 전체 MLB 선수 평균 연봉은 %.2f$입니다.\n\n", averageSalary);

        // 4. 연도별 평균 연봉
        List<Double> averageYearlySalary = SalaryService.calcAverageYearlySalary(list);
        //System.out.println(averageYearlySalary);
        int yearNum = 1985;
        System.out.println("4. 연도별 평균 연봉 : ");
        for (Double e : averageYearlySalary) {
            System.out.printf("%d년도 평균 연봉 : %.2f달러\n", yearNum, e);
            yearNum++;
        }


    }
}
