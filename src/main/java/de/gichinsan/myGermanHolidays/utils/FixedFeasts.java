package de.gichinsan.myGermanHolidays.utils;

import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class FixedFeasts {

    private static int iYear = 0;

    private static long lHeilige;
    private static long lMaifeiertage;
    private static long lNeujahr;
    private static long lTagDerDeutschenEinheit;
    private static long lWeihnachten;
    private static long l1Weihnachten;
    private static long l2Weihnachten;
    private static long lSilvester;
    private static long lAllerHeiligen;


    /**
     * Create a new object with all attributes initialized to defaults or given
     * values.
     *
     * @param year int
     */
    public FixedFeasts(int year) {
        this.setiYear(year);
    }

    /**
     * Return the value of iYear.
     *
     * @return the iYear
     */
    public static int getiYear() {
        return iYear;
    }

    /**
     * Update the value of iYear.
     *
     * @param iYear the iYear to set
     */
    public void setiYear(int iYear) {
        FixedFeasts.iYear = iYear;
    }

    /**
     * Return the value of lHeilige.
     *
     * @return the lHeilige
     */
    public static long getlHeilige() {
        return lHeilige;
    }

    /**
     * Update the value of lHeilige.
     *
     * @param lHeilige the lHeilige to set
     */
    public void setlHeilige(long lHeilige) {
        FixedFeasts.lHeilige = lHeilige;
    }

    /**
     * Return the value of lMaifeiertage.
     *
     * @return the lMaifeiertage
     */
    public static long getlMaifeiertage() {
        return lMaifeiertage;
    }

    /**
     * Update the value of lMaifeiertage.
     *
     * @param lMaifeiertage the lMaifeiertage to set
     */
    public void setlMaifeiertage(long lMaifeiertage) {
        FixedFeasts.lMaifeiertage = lMaifeiertage;
    }

    /**
     * Return the value of lNeujahr.
     *
     * @return the lNeujahr
     */
    public static long getlNeujahr() {
        return lNeujahr;
    }

    /**
     * Update the value of lNeujahr.
     *
     * @param lNeujahr the lNeujahr to set
     */
    public void setlNeujahr(long lNeujahr) {
        FixedFeasts.lNeujahr = lNeujahr;
    }

    /**
     * Return the value of lTagDerDeutschenEinheit.
     *
     * @return the lTagDerDeutschenEinheit
     */
    public static long getlTagDerDeutschenEinheit() {
        return lTagDerDeutschenEinheit;
    }

    /**
     * Update the value of lTagDerDeutschenEinheit.
     *
     * @param lTagDerDeutschenEinheit the lTagDerDeutschenEinheit to set
     */
    public void setlTagDerDeutschenEinheit(long lTagDerDeutschenEinheit) {
        FixedFeasts.lTagDerDeutschenEinheit = lTagDerDeutschenEinheit;
    }

    /**
     * Return the value of lWeihnachten.
     *
     * @return the lWeihnachten
     */
    public static long getlWeihnachten() {
        return lWeihnachten;
    }

    /**
     * Update the value of lWeihnachten.
     *
     * @param lWeihnachten the lWeihnachten to set
     */
    public void setlWeihnachten(long lWeihnachten) {
        FixedFeasts.lWeihnachten = lWeihnachten;
    }

    /**
     * Return the value of l1Weihnachten.
     *
     * @return the l1Weihnachten
     */
    public static long getL1Weihnachten() {
        return l1Weihnachten;
    }

    /**
     * Update the value of l1Weihnachten.
     *
     * @param l1Weihnachten the l1Weihnachten to set
     */
    public void setL1Weihnachten(long l1Weihnachten) {
        FixedFeasts.l1Weihnachten = l1Weihnachten;
    }

    /**
     * Return the value of l2Weihnachten.
     *
     * @return the l2Weihnachten
     */
    public static long getL2Weihnachten() {
        return l2Weihnachten;
    }

    /**
     * Update the value of l2Weihnachten.
     *
     * @param l2Weihnachten the l2Weihnachten to set
     */
    public void setL2Weihnachten(long l2Weihnachten) {
        FixedFeasts.l2Weihnachten = l2Weihnachten;
    }

    /**
     * Return the value of lSilvester.
     *
     * @return the lSilvester
     */
    public static long getlSilvester() {
        return lSilvester;
    }

    /**
     * Update the value of lSilvester.
     *
     * @param lSilvester the lSilvester to set
     */
    public void setlSilvester(long lSilvester) {
        FixedFeasts.lSilvester = lSilvester;
    }

    /**
     * Heillige drei Könige
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getsHeilige() {

        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);

        cal.set(FixedFeasts.getiYear(), 0, 6);

        this.setlHeilige(cal.getTimeInMillis());

        LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(cal.getTime().getTime()), ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.GERMAN);

        return date.format(formatter);
    }

    /**
     * Maifeiertag
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getsMaifeiertag() {

        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);

        cal.set(FixedFeasts.getiYear(), 4, 1);

        this.setlMaifeiertage(cal.getTimeInMillis());

        LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(cal.getTime().getTime()), ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.GERMAN);

        return date.format(formatter);
    }

    /**
     * Neujahr
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getsNeujahr() {

        Calendar cal = Calendar.getInstance();
        cal.set(FixedFeasts.getiYear(), 0, 1);

        this.setlNeujahr(cal.getTimeInMillis());

        LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(cal.getTime().getTime()), ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.GERMAN);

        return date.format(formatter);
    }

    /**
     * Tag der Deutschen Einheit
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getsTagderDeutschenEinheit() {

        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);

        cal.set(FixedFeasts.getiYear(), 9, 3);

        this.setlTagDerDeutschenEinheit(cal.getTimeInMillis());

        LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(cal.getTime().getTime()), ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.GERMAN);

        return date.format(formatter);
    }

    /**
     * Weihnachten
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getsWeihnachten() {

        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);

        cal.set(FixedFeasts.getiYear(), 11, 24);

        this.setlWeihnachten(cal.getTimeInMillis());

        LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(cal.getTime().getTime()), ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.GERMAN);

        return date.format(formatter);
    }

    /**
     * Erster Weihnachtsfeiertag
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String gets1Weihnachten() {

        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);

        cal.set(FixedFeasts.getiYear(), 11, 25);

        this.setL1Weihnachten(cal.getTimeInMillis());

        LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(cal.getTime().getTime()), ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.GERMAN);

        return date.format(formatter);
    }

    /**
     * Zweiter Weihnachtsfeiertag
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String gets2Weihnachten() {

        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);

        cal.set(FixedFeasts.getiYear(), 11, 26);

        this.setL2Weihnachten(cal.getTimeInMillis());

        LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(cal.getTime().getTime()), ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.GERMAN);

        return date.format(formatter);
    }

    /**
     * Silvester
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getsSilvester() {

        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);

        cal.set(FixedFeasts.getiYear(), 11, 31);

        this.setlSilvester(cal.getTimeInMillis());

        LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(cal.getTime().getTime()), ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.GERMAN);

        return date.format(formatter);
    }

    /**
     * Allerheilligen
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getlAllerHeiligen() {

        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);

        cal.set(getiYear(), 10, 1);

        setlAllerHeiligen(cal.getTimeInMillis());

        LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(cal.getTimeInMillis()), ZoneId.systemDefault());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.GERMAN);

        return date.format(formatter);

    }

    /**
     * @param lAllerHeiligen the lAllerHeiligen to set
     */
    public static void setlAllerHeiligen(long lAllerHeiligen) {
        FixedFeasts.lAllerHeiligen = lAllerHeiligen;
    }
}
