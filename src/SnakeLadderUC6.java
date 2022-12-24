import java.util.Random;

public class SnakeLadderUC6 extends SnakeLadderUC5 {

    int diceCount = 0;

    public static void main(String[] args) {

        SnakeLadderUC6 obj = new SnakeLadderUC6();
        //Showing Player Position
        obj.showPosition();

        //Iterating upto Player got Position 100
        while (obj.playerPosition != 100) {
            //Show Die Rolling No
            int dieNo = obj.rollDie();
            System.out.println("Die Number for Player : " + dieNo);

            //Player going for Options
            obj.optionPlay(dieNo);
            obj.showPosition();
        }
    }

    //Method to Roll the Die and Get No between 1 to 6
    int rollDie() {
        int dieNo = randomNo.nextInt(6) + 1;

        //Incrementing the Dice Count on each die roll
        diceCount++;
        System.out.println("Dice Count : " + diceCount);

        return dieNo;
    }

    //Method to Check for Option
    void optionPlay(int dieNo) {

        int optionNo = randomNo.nextInt(2) + 1;
        System.out.println("Option No : " + optionNo);

        switch (optionNo) {
            case IS_NO_PLAY:
                System.out.println("Player got NO PLAY");
                break;
            case IS_LADDER:
                System.out.println("Yahoo!!! Player got LADDER");
                playerPosition += dieNo;
                //If Player Position greater than 100 then skip the Play
                if (playerPosition > 100) {
                    System.out.println("Sorry The Position is Out of Board.");
                    playerPosition -= dieNo;
                }
                break;
            case IS_SNAKE:
                System.out.println("OOPS!!! Player got SNAKE");
                playerPosition -= dieNo;
                if (playerPosition < 0) {
                    playerPosition = 0;
                }
                break;
        }
    }
}