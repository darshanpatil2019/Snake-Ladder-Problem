import java.util.Random;

public class SnakeLadderUC3 {

    //Constants
    private static final int IS_NO_PLAY = 0;
    private static final int IS_LADDER = 1;
    private static final int IS_SNAKE = 2;

    //Declaring Variables for Players Position
    int playerPosition = 0;
    int newPosition = 0;

    // Random Class Object for Generating Random Numbers
    Random randomNo = new Random();

    //Method to Show Player Current Position
    private void showPosition() {
        //Displaying Player Position
        System.out.println("Player Starting Position : "+ playerPosition);
    }

    //Method to Roll the Die and Get No between 1 to 6
    private int rollDie() {
        int dieNo = randomNo.nextInt(6)+1;
        return dieNo;
    }

    //Method to Check for Option
    private void optionPlay(int dieNo) {

        int optionNo = randomNo.nextInt(3)+1;
        System.out.println("Option No : "+ optionNo);

        switch (optionNo) {
            case IS_NO_PLAY:
                System.out.println("Player got NO PLAY");
                newPosition = 0;
                break;
            case IS_LADDER:
                System.out.println("Yahoo!!! Player got LADDER");
                playerPosition += dieNo;
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

    public static void main(String[] args) {
        //Creating Object for Player
        SnakeLadderUC3 obj = new SnakeLadderUC3();

        //Showing Player Position
        obj.showPosition();

        //Show Die Rolling No
        int dieNo = obj.rollDie();
        System.out.println("Die Number for Player : "+ dieNo);

        //Player going for Options
        obj.optionPlay(dieNo);
        obj.showPosition();
    }
}