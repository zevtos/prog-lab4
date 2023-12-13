package lab4.underwatersettlement.entities;

import lab4.exceptions.CustomCheckedException;
import lab4.underwatersettlement.construction.materials.Equipment;

public class UnderwaterColony {

    public void invite(Elders initiator, UnderwaterResident person) {
        System.out.println(initiator.getRole() + " пригласил " + person.getRole() + " из подводного поселения.");
        System.out.println("Это приглашение обусловлено необходимостью применения новейших технологий " +
                "и опыта в строительстве в условиях подводной среды.");

        try {
            arrivalDetails(person);
        } catch (CustomCheckedException e) {
            // Обработка исключения
            e.printStackTrace();
        }

    }

    private boolean hasNecessaryEquipment(UnderwaterResident person){
        return person.hasNecessaryEquipment();
    }

    private void arrivalDetails(UnderwaterResident person) throws CustomCheckedException{
        if (!hasNecessaryEquipment(person)) {
            throw new CustomCheckedException(person.getRole() + " прибыл без необходимого оборудования.");
        }
        System.out.println(person.getRole() + " прибыл со всем необходимым для деятельности:");

        for (Equipment item : Equipment.values()) {
            System.out.println("- " + item.getDescription());
        }
    }
}
