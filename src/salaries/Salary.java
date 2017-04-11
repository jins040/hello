package salaries;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Salary {

    // 필드
    private String yearID;
    private String teamID;
    private String lgID;
    private String playerID;
    private int salaryOfPlayer;

    // 생성자
    public Salary() {
    }

    public Salary(String yearID, String teamID, String lgID, String playerID, int salaryOfPlayer) {
        this.yearID = yearID;
        this.teamID = teamID;
        this.lgID = lgID;
        this.playerID = playerID;
        this.salaryOfPlayer = salaryOfPlayer;
    }

    // Method
    public String getYearID() {
        return yearID;
    }

    public void setYearID(String yearID) {
        this.yearID = yearID;
    }

    public String getTeamID() {
        return teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public String getLgID() {
        return lgID;
    }

    public void setLgID(String lgID) {
        this.lgID = lgID;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public int getSalaryOfPlayer() {
        return salaryOfPlayer;
    }

    public void setSalaryOfPlayer(int salaryOfPlayer) {
        this.salaryOfPlayer = salaryOfPlayer;
    }



    @Override                                                   // 우클릭 + generate + toString()
    public String toString() {
        return "Salary{" +
                "yearID='" + yearID + '\'' +
                ", teamID='" + teamID + '\'' +
                ", lgID='" + lgID + '\'' +
                ", playerID='" + playerID + '\'' +
                ", salaryOfPlayer=" + salaryOfPlayer +
                '}';
    }
}
