package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class HashMapTest {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "kim-map");
        map.put("2", "lee-map");
        map.put("3", "park-map");       // key를 통해 값을 찾는다.

        System.out.println(map.get("2"));

        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("park");

        System.out.println(list.get(1));

        list.add(2, "choi");    // lee와 park 사이에 choi 투입
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }
}
