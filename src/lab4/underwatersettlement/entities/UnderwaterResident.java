package lab4.underwatersettlement.entities;

import lab4.exceptions.CustomUncheckedException;
import lab4.underwatersettlement.construction.materials.Equipment;

import java.util.ArrayList;
import java.util.List;

public class UnderwaterResident extends Person {
    private static final int MAX_EQUIPMENTS = 4;
    private static final List<Equipment> equipmentList = new ArrayList<>();

    public UnderwaterResident(String name, String role) {
        super(name, role);
    }

    @Override
    public String makeSound() {
        return "Издаёт звуки";
    }

    public static void addEquipment(Equipment equipment) throws CustomUncheckedException {
        if (equipmentList.size() >= MAX_EQUIPMENTS) {
            throw new CustomUncheckedException("Невозможно добавить больше оборудования. Максимальное количество: " + MAX_EQUIPMENTS);
        }
        equipmentList.add(equipment);
        System.out.println("Добавлен новое оборудование: " + equipment);
    }

    public boolean hasNecessaryEquipment() {
        // Предположим, что для работы требуется определенное оборудование
        // Проверяем, есть ли необходимое оборудование в списке
        // Например:
        return equipmentList.contains(Equipment.CELL_MASS)
                && equipmentList.contains(Equipment.PROTOPLASM);
    }
    public static class Preparation {
        public static void prepareForJourney(UnderwaterResident resident) {
            // Логика подготовки подводного жителя к отправке
            // Например:
            System.out.println(resident.getName() + " готовится к отправке в другой подводный город.");
            addEquipments(resident);
        }
        public static void addEquipments(UnderwaterResident resident){
            resident.addEquipment(Equipment.CELL_MASS);
            resident.addEquipment(Equipment.PROTOPLASM);
        }
    }
}
