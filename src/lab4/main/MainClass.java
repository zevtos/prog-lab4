package lab4.main;

import lab4.exceptions.CustomCheckedException;
import lab4.underwatersettlement.construction.*;
import lab4.underwatersettlement.construction.materials.Equipment;
import lab4.underwatersettlement.entities.*;
import lab4.underwatersettlement.history.*;

public class MainClass {
    public static void main(String[] args) {
        City city = new City("на дне мрачного моря");
        PhosphorescentOrganism phos_organism = new PhosphorescentOrganism(150);

        UnderwaterResident architect = new UnderwaterResident("Путник", "Подводный архитектор");
        Elders elders = new Elders("Шахтёр", "Старцы", 0);
        Elders.MiningExpertise expertise = elders.new MiningExpertise();
        expertise.increaseMiningExperience(10);
        System.out.println("-----------------------------------------------");
        UnderwaterResident.Preparation.prepareForJourney(architect);
        System.out.println("-----------------------------------------------");
        AncientSculptors.describeSculptorsNarrative();
        Story.introduceProblemScientifically(elders, architect);
        System.out.print("И вот, ");
        city.constructCity();
        city.describeNewShoggoth();
        phos_organism.provideLight();
        try {
            phos_organism.compensateLightLoss();
        } catch (CustomCheckedException e) {
            // Обработка исключения
            e.printStackTrace();
        }
    }
}
