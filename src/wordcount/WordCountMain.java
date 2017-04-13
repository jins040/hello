package wordcount;

import wordcount.service.WordCountService;
import wordcount.service.WordCountServiceImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class WordCountMain {

    public static void main(String[] args) {

        // 입력
        List<String> wordList = new ArrayList<>();

        try {                                                                                           //예외 처리(try, catch)
            BufferedReader br = new BufferedReader(new FileReader("src\\closer.txt"));

            String tempLine = "";

            while ((tempLine = br.readLine()) != null) {

                String[] splitted = tempLine.split("\\s");

                for (String e : splitted) {
                    if (e.contains(",")) {
                        wordList.add(e.substring(0,e.length()-1));  // ","를 포함하는 경우 단어 끝의 ","를 제거
                    } else {
                        wordList.add(e);
                    }
                }

            }

        } catch (FileNotFoundException fne) {
            fne.printStackTrace();                                  // 에러 내용 출력
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException ie) {
            ie.printStackTrace();
            System.out.println("파일 IO에 에러가 발생했습니다.");
        }


        // 처리, 팝송 노래 가사를 단어별로 입력 받아 그 갯수를 출력하는 함수
        WordCountService service = new WordCountServiceImpl();
        int numOfLyrics = service.getWordCount(wordList);
        System.out.printf("팝송 closer 노래 가사의 단어 갯수는 총 %d개입니다.", numOfLyrics);

    }
}
