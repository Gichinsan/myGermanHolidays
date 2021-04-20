package de.gichinsan.myGermanHolidays.utils;

/**
 * Auflistung aller Bundesländer.
 *
 */
public enum FederalStates {

    Baden_Wuerttemberg("Baden-Württemberg"),
    Bayern("Bayern"),
    Berlin("Berlin"),
    Brandenburg("Brandenburg"),
    Bremen("Bremen"),
    Hamburg("Hamburg"),
    Hessen("Hessen"),
    NordrheinWestfalen("Nordrhein Westfalen"),
    RheinlandPfalz("Rheinland Pfalz"),
    Saarland("Saarland"),
    Sachsen("Sachsen"),
    SachenAnhalt("Sachen Anhalt"),
    SchleswigHolstein("Schleswig Holstein"),
    Thüringen("Thüringen");

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
