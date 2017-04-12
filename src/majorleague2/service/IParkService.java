package majorleague2.service;

import majorleague2.model.Park;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public interface IParkService {

    int countingNumOfNoneUS(List<Park> list);        // 추상 Method(Body가 없는 Method), 기본적으로 abstract가 맨 앞에 붙지만 생략 가능
    List<String> findParkHavingAlias(List<Park> list);
    double averageOfParkNameNum(List<Park> list);

}
