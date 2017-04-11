package hall;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class PlayerAverage {

    // 필드
    private String playerID;
    private double average;

    // 생성자
    public PlayerAverage() {
    }

    public PlayerAverage(String playerID, double average) {
        this.playerID = playerID;
        this.average = average;
    }

    // Method
    public String getPlayerID() {return playerID;}
    public void setPlayerID(String playerID) {this.playerID = playerID;}

    public double getAverage() {return average;}
    public void setAverage(double average) {this.average = average;}

    @Override
    public String toString() {
        return "PlayerAverage{" +
                "playerID='" + playerID + '\'' +
                ", average=" + average +
                '}';
    }
}
