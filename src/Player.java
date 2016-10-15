import java.util.ArrayList;

/**
 * Created by masood on 06/13/16.
 */
public class Player {
    private ArrayList<Frame> frames;

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public ArrayList getFramesList() {
        return frames;
    }

    public Player() {
        frames = new ArrayList<>();
    }

    private int totalScore;




    public void AddFrames(Frame newFrame){

        frames.add(newFrame);
    }

    public Frame getFrame(int frameNumber){
        return frames.get(frameNumber);
    }
    public Roll NextRoll(Roll roll){
        if(this.getFrame(roll.getFrameNumber()).getRolls().indexOf(roll)==Const.End_Roll_Of_Frame){
            return this.getFrame(roll.getFrameNumber()+1).getRoll(Const.First_Roll_Of_Frame);}
        else{
            return this.getFrame(roll.getFrameNumber()).getRoll(this.getFrame(roll.getFrameNumber()).getRolls().indexOf(roll)+1);
        }
    }
    public boolean IsEndFrame() {
        if (this.getFramesList().size()-1 == Const.End_Frame && this.getFrame(Const.End_Frame).getFrameType() != FrameType.Strike && this.getFrame(Const.End_Frame).getFrameType() != FrameType.Spare)
            return true;
        else if (this.getFramesList().size()-1 > Const.End_Frame) {
            if (this.getFramesList().size() == Const.End_Frame + 1 && this.getFrame(Const.End_Frame + 1).getFrameType() != FrameType.Strike && this.getFrame(Const.End_Frame).getFrameType() == FrameType.Strike)
                return true;
            else if (this.getFramesList().size()-1 == Const.End_Frame + 1 && this.getFrame(Const.End_Frame).getFrameType() == FrameType.Spare)
                return true;
            else if (this.getFramesList().size()-1 == Const.End_Frame + 2 && this.getFrame(Const.End_Frame + 1).getFrameType() == FrameType.Strike && this.getFrame(Const.End_Frame).getFrameType() == FrameType.Strike)
                return true;
        }
    return false;

    }

}
