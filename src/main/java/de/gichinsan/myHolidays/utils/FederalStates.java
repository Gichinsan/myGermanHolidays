package de.gichinsan.myHolidays.utils;

public enum FederalStates {

    /**
     *
     */
    Baden_Wuerttemberg("Baden-Württemberg"), Hessen("Hessen");

    private String displayName;

    /**
     *
     * @param displayName String
     */
    FederalStates(String displayName) {
        this.displayName = displayName;
    }

    /**
     *
     * @return displayName String
     */
    public String displayName() {
        return displayName;
    }

    /**
     *
     * @return toString String
     */
    @Override
    public String toString() {
        return displayName;
    }

}
