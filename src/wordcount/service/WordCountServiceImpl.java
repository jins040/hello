package wordcount.service;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class WordCountServiceImpl implements WordCountService {

    public int getWordCount(List<String> list) {

        int numOfTotalWord = 0;

        for (String e : list) {
            if (!e.equals("")) {
                numOfTotalWord++;
                System.out.println(e);
            } else {
                // e가 공백이면 그대로
            }
        }

        return numOfTotalWord;
    }
}
