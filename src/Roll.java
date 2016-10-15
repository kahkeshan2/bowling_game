/**
 * Created by masood on 06/13/16.
 */
public class Roll {
    private int rollScore;
    private int frameNumber;

    public Roll(int rollScore, int frameNumber) {
        this.rollScore = rollScore;
        this.frameNumber = frameNumber;
    }

    public int getRollScore() {
        return rollScore;
    }

    public void setRollScore(int rollScore) {
        this.rollScore = rollScore;
    }

    public int getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }



}
