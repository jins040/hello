package mappark;

import mappark.parkmodel.Park;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class ParkMain {

    public static void main(String[] args) {

        // 입력
        Map<String, Park> map = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\Parks.csv"));

            br.readLine();

            String tempLine = "";
            while ((tempLine = br.readLine()) != null) {

                String[] splitted = tempLine.split(",");

                map.put(splitted[0], new Park(splitted[1], splitted[2], splitted[3], splitted[4], splitted[5]));

            }

            System.out.println(map.size());
            Park p = map.get("BAL07");
            System.out.println(p);

        } catch (FileNotFoundException fne) {
            fne.printStackTrace();
            System.out.println("파일 이름이 잘못되었거나 파일이 없습니다.");
        } catch (IOException ie) {
            ie.printStackTrace();
            System.out.println("IO 과정에서 에러가 발생했습니다.");
        }

        // 출력
        System.out.println(map);

        for (Map.Entry<String, Park> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }
}
