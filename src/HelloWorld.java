/**
 * Created by danawacomputer on 2017-04-03.
 */
public class HelloWorld {

    public static void main(String[] args) {

        int Days = 90;
        int hoursPerDay = 8;

        int totalHours = Days * hoursPerDay;

        System.out.println("Total time is" + totalHours + "hours");


        int busCost = 1100;
        int timesToRide = 2;

        int totalBusCost = busCost * timesToRide;

        System.out.println("총 버스비는?" + totalBusCost + "원");
    }
}