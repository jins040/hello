package school.model;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class SchoolModel {

    // 필드
    private String schoolID;
    private String nameFull;
    private String city;
    private String state;
    private String country;

    // 생성자
    public SchoolModel() {
    }

    public SchoolModel(String schoolID, String nameFull, String city, String state, String country) {
        this.schoolID = schoolID;
        this.nameFull = nameFull;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    // Method
    public String getSchoolID() {return schoolID;}
    public void setSchoolID(String schoolID) {this.schoolID = schoolID;}

    public String getNameFull() {return nameFull;}
    public void setNameFull(String nameFull) {this.nameFull = nameFull;}

    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}

    public String getState() {return state;}
    public void setState(String state) {this.state = state;}

    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}

    @Override
    public String toString() {
        return "SchoolModel{" +
                "schoolID='" + schoolID + '\'' +
                ", nameFull='" + nameFull + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
