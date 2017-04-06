import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class GoodsPriceCalculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("*물건 가격 계산 프로그램");

        // Input
        System.out.print("1. 담배 종류를 입력하세요. (1: 디스, 2: 말보로) : ");
        int whichCigarette = in.nextInt();
        System.out.print("2. 나이를 입력하세요. : ");
        int age = in.nextInt();
        System.out.print("3. 수량을 입력하세요. : ");
        int numberOfCigarette = in.nextInt();

        // Process
        int totalPriceOfCigarette = dCcalculator(whichCigarette, age, numberOfCigarette);
//        int costOfThis = 4500;
//        int costOfMarlboro = 5200;
//        double totalPriceOfCigarette = 0; // 변수 초기화 곡 해주기
//
//        if (whichCigarette == 1) {
//            totalPriceOfCigarette = costOfThis;
//        } else {
//            totalPriceOfCigarette = costOfMarlboro;
//        }
//
//        if (age < 19) {
//            System.out.printf("할인된 가격은 %.0f원입니다. (%d세 담배요금 20%% 할인)\n", totalPriceOfCigarette * 0.8, age);
//            totalPriceOfCigarette = totalPriceOfCigarette * 0.8 * numberOfCigarette;
//        } else if (age >= 45) {
//            System.out.printf("추가된 가격은 %.0f원입니다. (%d세 담배요금 30%% 추가)\n", totalPriceOfCigarette * 1.3, age);
//            totalPriceOfCigarette = totalPriceOfCigarette * 1.3 * numberOfCigarette;
//        } else {
//            totalPriceOfCigarette = totalPriceOfCigarette * numberOfCigarette;
//        }

        // Output
        System.out.println("물건 가격은 총 " + totalPriceOfCigarette + "원입니다.");

    }

    public static int dCcalculator(int choice, int age, int quantity) {

        double totalPrice = 0;

        if (choice == 1) {
            totalPrice = 4500;  // 디스 가격
        } else {
            totalPrice = 5200;  // 말보로 가격
        }

        if (age < 19) {
            totalPrice = totalPrice * 0.8;
            System.out.printf("할인된 가격은 %.0f원입니다. (%d세 담배요금 20%% 할인)\n", totalPrice, age);
        } else if (age >= 45) {
            totalPrice = totalPrice * 1.3;
            System.out.printf("추가요금은 %.0f원입니다. (%d세 담배요금 30%% 추가)\n", totalPrice, age);
        }

        return (int)totalPrice * quantity;

    }
}
