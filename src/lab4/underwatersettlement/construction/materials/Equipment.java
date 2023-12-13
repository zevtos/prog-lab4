package lab4.underwatersettlement.construction.materials;

public enum Equipment {
    CELL_MASS("Клеточная масса для производства шогготов"),
    PROTOPLASM("Протоплазма, с лёгкостью превращающаяся в фосфоресцирующие организмы, освещавшие темноту");

    private final String description;

    Equipment(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}