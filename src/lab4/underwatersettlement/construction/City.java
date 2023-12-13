package lab4.underwatersettlement.construction;

import lab4.exceptions.CustomCheckedException;
import lab4.underwatersettlement.entities.NewShoggoth;

public class City {
    private String description;

    public City(String description) {
        this.description = description;
    }

    public void constructCity() {
        System.out.print(description + " вырос громадный город, ");
        implementDesignPlan();
        describeCitySkill();
    }

    public void implementDesignPlan() {
        System.out.print("город архитектурой напоминал прежнюю столицу, ");
    }
    public void describeCitySkill() {
        System.out.print("Город был построен с мастерством, превзошедшим даже прежнюю столицу, ибо ");
        PreciseCalculation preciseCalculation = new PreciseCalculation();
        preciseCalculation.performPreciseCalculation();
    }
    public void describeNewShoggoth() {
        NewShoggoth newShoggoth = new NewShoggoth("Новые шогготы", "исполинских размеров", "значительный интеллект");
        newShoggoth.describeShoggoth();
        newShoggoth.followCommands();
        newShoggoth.communicateWithElders();
        newShoggoth.makeSound();
        try {
            newShoggoth.describeBehavior();
        } catch (CustomCheckedException e) {
            // Обработка исключения
            e.printStackTrace();
        }

    }

}
