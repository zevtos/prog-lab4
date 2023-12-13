package lab4.underwatersettlement.entities;

import lab4.exceptions.CustomUncheckedException;

public class Elders extends Person{
    private int miningExperience;
    public Elders(String name, String role, int miningExperience) {
        super(name, role);
        this.miningExperience = miningExperience;
    }

    public Elders() {
        super("noname", "Elder");
    }
    @Override
    public String makeSound() {
        // Локальный класс для обработки звуков
        class SoundProcessor {
            private int volume;

            SoundProcessor(int volume) {
                this.volume = volume;
            }

            String process() {
                return "Мелодичные, трубные звуки, слышные на большом расстоянии равном " + volume + " метрам";
            }
        }

        // Используем локальный класс
        SoundProcessor processor = new SoundProcessor(20);
        return processor.process();
    }

    public boolean isCapableOfMining() {
        return miningExperience > 5;
    }

    public class MiningExpertise {
        public void increaseMiningExperience(int experience) {
            if(experience > 0) {
                System.out.println("Старцы упражняются в добыче камней");
                miningExperience += experience;
                System.out.println("Опыт в добыче увеличен до " + miningExperience);
            }else{
                throw new CustomUncheckedException("Опыт в добыче не может быть отрицательным");
            }
        }
    }
}
