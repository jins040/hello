package hashmapex1.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public interface LoginService {

    boolean validateUserID(String id, HashMap map);
    boolean validatePassword(String pw, HashMap map);
}
