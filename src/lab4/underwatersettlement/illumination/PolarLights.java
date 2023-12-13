package lab4.underwatersettlement.illumination;

import lab4.underwatersettlement.entities.Luminous;

public class PolarLights {
    public void describeAurora(){
        Luminous aurora = new Luminous() {
            @Override
            public void provideLight() {
                System.out.println("Полярные сияния - непременные спутники антарктических ночей.");
            }
        };

        aurora.provideLight();
    }
}
