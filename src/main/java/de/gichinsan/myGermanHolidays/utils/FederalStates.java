package de.gichinsan.myGermanHolidays.utils;

/**
 * Auflistung aller Bundesländer.
 */
public enum FederalStates {

    BW("Baden-Württemberg"),
    BY("Bayern"),
    BE("Berlin"),
    BB("Brandenburg"),
    HB("Bremen"),
    HH("Hamburg"),
    HE("Hessen"),
    NW("Nordrhein Westfalen"),
    RP("Rheinland Pfalz"),
    SL("Saarland"),
    SN("Sachsen"),
    ST("Sachen Anhalt"),
    SH("Schleswig Holstein"),
    TH("Thüringen"),
    ALL("Alle Bundesländer");

    private String displayName;

    /**
     * @param displayName String
     */
    FederalStates(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return displayName String
     */
    public String displayName() {
        return displayName;
    }

    /**
     * @return toString String
     */
    @Override
    public String toString() {
        return displayName;
    }

}
