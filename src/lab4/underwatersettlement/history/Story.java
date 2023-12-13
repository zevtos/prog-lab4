package lab4.underwatersettlement.history;

import lab4.underwatersettlement.construction.MiningStrongStones;
import lab4.underwatersettlement.entities.Elders;
import lab4.underwatersettlement.entities.UnderwaterColony;
import lab4.underwatersettlement.entities.UnderwaterResident;

public class Story {

    public static void introduceProblemScientifically(Elders initiator, UnderwaterResident person) {
        UnderwaterColony colony = new UnderwaterColony();
        MiningStrongStones mining = new MiningStrongStones();
        System.out.print("Подойдя к проблеме научно, ");
        mining.mineStones(initiator);
        colony.invite(initiator, person);
    }


}