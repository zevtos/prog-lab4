package lab4.underwatersettlement.history;

public class AncientSculptors {

    private static final String SCULPTORS = "древние скульпторы";

    public static void describeSculptorsNarrative() {
        describeSculptorsReliefs();
        System.out.print(", ");
        describeSculptorsTransformation();
    }

    private static void describeSculptorsReliefs() {
        System.out.print("когда " + getAncientSculptorsDescription() + " рассказывали на своих барельефах о том, как на дне подземного моря закладывали новый город");
    }

    private static void describeSculptorsTransformation() {
        System.out.print("их декадентская, упадническая манера преображалась, ");
        describeEpicTraits();
    }

    private static void describeEpicTraits() {
        System.out.println("и в ней появлялись характерные эпические черты.");
    }
    public static String getAncientSculptorsDescription() {
        return SCULPTORS;
    }
}
