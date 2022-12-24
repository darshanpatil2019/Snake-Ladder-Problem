public class SnakeLadderUC4 extends SnakeLadderUC3 {
    public static void main(String[] args) {

        SnakeLadderUC4 obj = new SnakeLadderUC4();

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
}
