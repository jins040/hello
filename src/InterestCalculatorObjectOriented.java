import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class InterestCalculatorObjectOriented {

    public static void main(String[] args) {

        // Input
        /*
        원금을 입력하세요: 3,000,000 (int)
        기간을 입력하세요: 48 (int)
        이율을 입력하세요: 35.5 (double)
         */
        Scanner in = new Scanner(System.in);

        System.out.print("원금을 입력하세요.(원) : ");
        int originalPrice = in.nextInt();
        System.out.print("기간을 입력하세요.(개월) : ");
        int monthlyPeriod = in.nextInt();
        System.out.print("이율을 입력하세요.(%) : ");
        double annualInterestRate = in.nextDouble() / 100;

        // Process
        // 이자 계산 공식 : 이자 = 원금 * 이율(연이율) * (월/12);
        // 기간 : 연(year)

        double interest = calcInterest(originalPrice, monthlyPeriod, annualInterestRate);

        int totalIncome = originalPrice + (int)interest;

        // Output
        /*
        48개월 후 당신은 5,000,000원을 받을 수 있습니다.
         */
        System.out.println(monthlyPeriod + "개월 후 당신은 " + totalIncome + "원을 받을 수 있습니다.");
        System.out.printf("%d개월 후에 당신은 %d원을 받을 수 있습니다.", monthlyPeriod, totalIncome);   // double은 %f

    }

    public static double calcInterest(
            int principal, int month, double rate) {

        if (month >= 36) {
            rate = rate * (70.0/100);
            System.out.printf("변경된 이자율은 %.2f%%입니다.\n", rate*100);
        }

        double interest =
                principal * rate * (month/12);

        return interest;

    }
}
