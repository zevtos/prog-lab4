package lab4.underwatersettlement.construction;

import lab4.exceptions.CustomUncheckedException;
import lab4.underwatersettlement.entities.Elders;

public class MiningStrongStones extends StoneMining {

    @Override
    public void mineStones(Elders initiator) {
        if (initiator.isCapableOfMining()) {
            System.out.println(initiator.getRole() + " наладил добычу особо прочных камней в горных недрах.");
        } else {
            throw new CustomUncheckedException(initiator.getRole() + " не способен наладить добычу камней.");
        }
    }
}
