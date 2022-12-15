import java.util.Random;

public class SnakeLadderUC2 {
    public static void main(String[] args) {
        SnakeLadderUC2 obj = new SnakeLadderUC2();
        obj.DieRoll();
    }

    public void DieRoll() {
        Random random = new Random();

        int rollDie = random.nextInt(6);
        System.out.println("Player got : " + rollDie);
    }
}
