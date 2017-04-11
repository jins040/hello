package hall;

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
            if (splitted[3].equals("")) {
                fame.setBallots(0);
            } else {
                fame.setBallots(Integer.parseInt(splitted[3]));
            }
            if (splitted[4].equals("")) {
                fame.setNeeded(0);
            } else {
                fame.setNeeded(Integer.parseInt(splitted[4]));
            }
            if (splitted[5].equals("")) {
                fame.setVotes(0);
            } else {
                fame.setVotes(Integer.parseInt(splitted[5]));
            }
            fame.setInducted(splitted[6]);
            fame.setCategory(splitted[7]);

            halls.add(fame);

        }


        //
        List<PlayerAverage> newList = new ArrayList<>();

        for (HallOfFame e : halls) {

            PlayerAverage pa = new PlayerAverage();
            pa.setPlayerID(e.getPlayerID());
            pa.setAverage((e.getBallots() + e.getNeeded() + e.getVotes() / 3.0));
            newList.add(pa);

        }

        System.out.println(newList);
        for (PlayerAverage e : newList) {
            System.out.printf("Player ID = %s, average = %.2f\n", e.getPlayerID(), e.getAverage());
        }

    }
}
