package school.service;

import school.model.SchoolModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class SchoolService implements ISchoolService {

    public List<SchoolModel> getNewList(List<SchoolModel> list) {

        List<SchoolModel> modifiedList = new ArrayList<>();

        for (SchoolModel e : list) {

            SchoolModel tempSchoolClass = e;

            if((e.getSchoolID().length()) >= 6) {
                tempSchoolClass.setSchoolID(e.getSchoolID().substring(0,6) + "...");
            } else {}

            modifiedList.add(tempSchoolClass);

        }

        return modifiedList;
    }
}
