import java.util.Random;

public class SnakeLadderUC3 extends SnakeLadderUC2 {
    int initialPosition = 0;
    int option;
    int ladder = 1;
    int snake = 2;
    int noPlay = 0;

    // Checking option Ladder,Snake or NoPlay

    public void Option() {
        Random random = new Random();
        option = random.nextInt(3);

        //Checking conditions(Option)

        if (option == ladder) {
            initialPosition = initialPosition + rollDie;
            System.out.println("Ladder");
        } else if (option == snake) {
            initialPosition = initialPosition - rollDie;
            System.out.println("Snake");
        } else {
            initialPosition = initialPosition;
            System.out.println("No Play");
        }
        if (initialPosition < rollDie) {
            initialPosition = 0;
        }
        System.out.println("Player is at Position: " + initialPosition);

    }

    public static void main(String[] args) {
        SnakeLadderUC3 obj = new SnakeLadderUC3();
        obj.DieRoll();
        obj.Option();
    }
}