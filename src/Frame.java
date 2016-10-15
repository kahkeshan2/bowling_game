import java.util.ArrayList;

/**
 * Created by masood on 06/13/16.
 */
public class Frame {
    private int frameNumber;
    private ArrayList<Roll> rolls;
    private int frameScore;
    private FrameType frameType;

    public ArrayList<Roll> getRolls() {
        return rolls;
    }

    public void setRolls(ArrayList<Roll> rolls) {
        this.rolls = rolls;
    }

    public int getFrameNumber() {
        return frameNumber;

    }



    public int getFrameScore() {

        return frameScore;
    }

    public void setFrameScore() {

        this.frameScore = getRoll(0).getRollScore()+getRoll(1).getRollScore();
    }

    public FrameType getFrameType() {
        return frameType;
    }

    public void setFrameType() {
        Roll firstRoll = getRoll(0);
        Roll secondRoll = getRoll(1);
        if (firstRoll.getRollScore() == 10)
            this.frameType = FrameType.Strike;
        else if(getFrameScore() ==10)
            this.frameType = FrameType.Spare;
        else
            this.frameType = FrameType.Normal;
        this.frameType = frameType;
    }


    public Frame(Roll firstroll, Roll secondRoll, int frameNumber){
        this.frameNumber = frameNumber;
        rolls = new ArrayList<>();
        AddRoll(firstroll);
        AddRoll(secondRoll);
        setFrameScore();
        setFrameType();
    }
    private void AddRoll(Roll roll){

        rolls.add(roll);
    }
    public Roll getRoll(int rollNumber) {
        if (rollNumber < 2 && rollNumber >= 0)
            return rolls.get(rollNumber);

        else {
            System.out.println(Const.Out_of_range_Error);
            return null;
        }
    }
}
