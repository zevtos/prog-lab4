package lab4.underwatersettlement.entities;

import lab4.exceptions.CustomCheckedException;
import lab4.underwatersettlement.illumination.PolarLights;

public class PhosphorescentOrganism implements Luminous{
    private int luminosity;

    public PhosphorescentOrganism(int luminosity) {
        this.luminosity = luminosity;
    }
    @Override
    public void provideLight() {
        System.out.println("Фосфоресцирующие организмы обеспечивали Старцев светом");
    }
    public void compensateLightLoss() throws CustomCheckedException {
        int threshold = 100;

        if (luminosity < threshold) {
            throw new CustomCheckedException("Фосфоресцирующих организмов недостаточно для компенсации утраты света.");
        }
        System.out.print("Фосфоресцирующие организмы компенсировали утрату света, которую раньше обеспечивали:");

        PolarLights polarLights = new PolarLights();
        polarLights.describeAurora();
    }
}
