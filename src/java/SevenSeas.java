import module.BattleField;
import module.Tortuga;
import util.Reader;

public class SevenSeas {
    public static void main(String[] args) {

        Reader.readFiles();

        Tortuga.setUpShip();
        Tortuga.setUpShip();

        BattleField.winnerShip = BattleField.phaseOne();
        BattleField.winnerShip = BattleField.phaseTwo();

    }
}
