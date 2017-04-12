package majorleague2;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by danawacomputer on 2017-04-10.
 */
public class FileReaderExample {

    public static void main(String[] args) throws Exception {       // throws Exception 은 예외를 처리하지 않겠다는 뜻

        // txt파일을 Ctrl+C하고 src 우클릭하여 Paste
        FileReader fr = new FileReader("src\\Parks.csv");

        BufferedReader br = new BufferedReader(fr);     // fr.Reader() 바로 하면 파일 읽는 방식이 까다롭다.

                                                        // .readLine() 을 쓰기 위해서 Buffer 사용
//        String line = br.readLine();
//        String line2 = br.readLine();
//
//        System.out.println(line);
//        System.out.println(line2);  // Line by Line으로 읽기 위한 방법


//        while (true) {                          // 무한루프(다 돌고 null 무한 return할 수도)
//            String line = br.readLine();
//
////            String[] splitted = line.split(",");
////            for (String e : splitted) {
////                System.out.println(e);
////            }
//
//            if (line == null) {
//                break;                          // 무한루프 돌지 않기 위한 setting
//            }
//            System.out.println(line);
//        }


        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }
}
