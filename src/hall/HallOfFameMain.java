package hall;

        import hall.model.HallOfFame;

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.util.ArrayList;
        import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class HallOfFameMain {

    public static void main(String[] args) throws Exception {

        // 입력
        BufferedReader br = new BufferedReader(new FileReader("src\\HallOfFame.csv"));

        br.readLine();  // skip the first line

        List<HallOfFame> halls = new ArrayList<>();

        String tempLine = "";
        while ((tempLine = br.readLine()) != null) {

            String[] splitted = tempLine.split(",");

            HallOfFame fame = new HallOfFame();

            fame.setPlayerID(splitted[0]);
            fame.setYearID(Integer.parseInt(splitted[1]));
            fame.setVotedBy(splitted[2]);
            fame.setBallots(NullUtil.toInt(splitted[3]));           // data validation, 숫자가 들어가지 않은 공란에 대한 처리
            fame.setNeeded(NullUtil.toInt(splitted[4]));            // 따로 static 선언을 한 class 선언을 통해 호출
            fame.setVotes( splitted[5].equals("") ? 0 : Integer.parseInt(splitted[5]) );    // 3항 연산자 사용
            fame.setInducted(splitted[6]);
            fame.setCategory(splitted[7]);

            halls.add(fame);                // List는 add를 이용해 순서대로 담긴다.(index 할당)

        }




        // mapping 작업
        List<PlayerAverage> newList = new ArrayList<>();

        for (HallOfFame e : halls) {

            PlayerAverage pa = new PlayerAverage();

            pa.setPlayerID(e.getPlayerID());
            pa.setAverage((e.getBallots() + e.getNeeded() + e.getVotes()) / 3.0);

            newList.add(pa);

        }

        // 출력
        System.out.println(newList);
        for (PlayerAverage e : newList) {
            System.out.printf("PlayerID = %s, average = %.2f\n", e.getPlayerID(), e.getAverage());
        }
        System.out.printf("전체 데이터는 %d개입니다.\n", newList.size());

        System.out.println(newList.get(1999));

    }
}
