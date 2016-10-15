public class Game {

    public static int CalculateScore(Player player) {
        if(player.IsEndFrame()) {
            for (int frame = Const.First_Frame; frame < player.getFramesList().size(); frame++) {
                Roll nextRoll = player.NextRoll(player.getFrame(frame).getRoll(0));
                Roll next_nextRoll = player.NextRoll(nextRoll);
                if (player.getFrame(frame).getFrameType() == FrameType.Strike)

                    player.setTotalScore(player.getTotalScore() + player.getFrame(frame).getFrameScore() + nextRoll.getRollScore() + next_nextRoll.getRollScore());
                else if (player.getFrame(frame).getFrameType() == FrameType.Spare)
                    player.setTotalScore(player.getTotalScore() + player.getFrame(frame).getFrameScore() + next_nextRoll.getRollScore());
                else if (player.getFrame(frame).getFrameType() == FrameType.Normal)
                    player.setTotalScore(player.getTotalScore() + player.getFrame(frame).getFrameScore());
            }
            return player.getTotalScore();
        }else{
            System.out.println("The Game has not finished");
            return 0;

        }
    }


    public static void main(String[] args) {
        System.out.println("game start");
        Player player_one = new Player();
        Player player_two = new Player();
        Roll roll0 = new Roll(10,0);
        Roll roll00 = new Roll(0,0);
        Roll roll1 = new Roll(5,1);
        Roll roll01 = new Roll(5,1);
        Roll roll2 = new Roll(3,2);
        Roll roll02 = new Roll(5,2);
        Roll roll3 = new Roll(10,3);
        Roll roll03 = new Roll(0,3);
        Roll roll4 = new Roll(5,4);
        Roll roll04 = new Roll(3,4);
        Roll roll5 = new Roll(5,5);
        Roll roll05 = new Roll(5,5);
        Roll roll6 = new Roll(5,6);
        Roll roll06 = new Roll(5,6);
        Roll roll7 = new Roll(5,7);
        Roll roll07 = new Roll(5,7);
        Roll roll8 = new Roll(4,8);
        Roll roll08 = new Roll(1,8);
        Roll roll9 = new Roll(2,9);
        Roll roll09 = new Roll(3,9);
        Frame frame1 = new Frame(roll0,roll00,0);
        Frame frame2 = new Frame(roll1,roll01,1);
        Frame frame3 = new Frame(roll2,roll02,2);
        Frame frame4 = new Frame(roll3,roll03,3);
        Frame frame5 = new Frame(roll4,roll04,4);
        Frame frame6 = new Frame(roll5,roll05,5);
        Frame frame7 = new Frame(roll6,roll06,6);
        Frame frame8 = new Frame(roll7,roll07,7);
        Frame frame9 = new Frame(roll8,roll08,8);
        Frame frame0 = new Frame(roll9,roll09,9);
        player_one.AddFrames(frame0);
        player_one.AddFrames(frame1);
        player_one.AddFrames(frame2);
        player_one.AddFrames(frame3);
        player_one.AddFrames(frame4);
        player_one.AddFrames(frame5);
        player_one.AddFrames(frame6);
        player_one.AddFrames(frame7);
        player_one.AddFrames(frame8);
        player_one.AddFrames(frame9);
        System.out.println(CalculateScore(player_one));

    }

}