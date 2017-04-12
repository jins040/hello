package hall.model;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class HallOfFame {

    // 필드
    private String playerID;
    private int yearID;
    private String votedBy;
    private int ballots;
    private int needed;
    private int votes;
    private String inducted;
    private String category;


    // 생성자
    public HallOfFame() {
    }

    public HallOfFame(String playerID, int yearID, String votedBy, int ballots,
                      int needed, int votes, String inducted, String category) {
        this.playerID = playerID;
        this.yearID = yearID;
        this.votedBy = votedBy;
        this.ballots = ballots;
        this.needed = needed;
        this.votes = votes;
        this.inducted = inducted;
        this.category = category;
    }


    // Method
    public String getPlayerID() {return playerID;}
    public void setPlayerID(String playerID) {this.playerID = playerID;}

    public int getYearID() {return yearID;}
    public void setYearID(int yearID) {this.yearID = yearID;}

    public String getVotedBy() {return votedBy;}
    public void setVotedBy(String votedBy) {this.votedBy = votedBy;}

    public int getBallots() {return ballots;}
    public void setBallots(int ballots) {this.ballots = ballots;}

    public int getNeeded() {return needed;}
    public void setNeeded(int needed) {this.needed = needed;}

    public int getVotes() {return votes;}
    public void setVotes(int votes) {this.votes = votes;}

    public String getInducted() {return inducted;}
    public void setInducted(String inducted) {this.inducted = inducted;}

    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}

    @Override
    public String toString() {
        return "HallOfFame{" +
                "playerID='" + playerID + '\'' +
                ", yearID=" + yearID +
                ", votedBy='" + votedBy + '\'' +
                ", ballots=" + ballots +
                ", needed=" + needed +
                ", votes=" + votes +
                ", inducted='" + inducted + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
