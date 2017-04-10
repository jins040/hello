package gourmet;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GourmetService {

    public double calcAverageScore(List<Gourmet> list) {        // list는 argument=매개변수=인자

        int sum = 0;

        for (Gourmet e : list) {
            //sum += e.score;
            sum += e.getScore();
        }

        return (double)sum / list.size();
    }
}
