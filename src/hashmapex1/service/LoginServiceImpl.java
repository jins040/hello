package hashmapex1.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class LoginServiceImpl implements LoginService {

    public boolean validateUserID(String id, HashMap map) {

        if (map.containsKey(id)) {
            return true;
        } else {
            return false;
        }

    }

    public boolean validatePassword(String pw, HashMap map) {

        if (map.containsValue(pw)) {
            return true;
        } else {
            return false;
        }

    }

}
