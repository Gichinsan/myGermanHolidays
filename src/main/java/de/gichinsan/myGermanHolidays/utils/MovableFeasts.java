package de.gichinsan.myGermanHolidays.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Berechnung der beweglichen Feiertage in Deutschland.
 *
 */
public class MovableFeasts {

    private static long achsermittwoch;
    private static long palmsonntag;
    private static long karfreitag;
    private static long fronleichnam;
    private static long ostermontag;
    private static long christiHimmelfahrt;
    private static long pfingsten;
    private static long lBussUndBettag;
    private static int iYear = 0;

    /**
     * @param year int
     */
    public MovableFeasts(int year) {
        this.setiYear(year);
    }

    /**
     * Returns the date of Easter Sunday for a given year.
     * <p>
     * Note: year from 1583
     *
     * @return The date of Easter Sunday for a given year.
     */
    private static Calendar easterSunday() {
        int i = getiYear() % 19;
        int j = getiYear() / 100;
        int k = getiYear() % 100;

        int l = (19 * i + j - (j / 4) - ((j - ((j + 8) / 25) + 1) / 3) + 15) % 30;

        int m = (32 + 2 * (j % 4) + 2 * (k / 4) - l - (k % 4)) % 7;

        int n = l + m - 7 * ((i + 11 * l + 22 * m) / 451) + 114;

        int month = n / 31;
        int day = (n % 31) + 1;

        return new GregorianCalendar(getiYear(), month - 1, day);
    }

    /**
     * Return the value of achsermittwoch.
     *
     * @return the achsermittwoch
     */
    public static long getAchsermittwoch() {
        return achsermittwoch;
    }

    /**
     * @return the lBussUndBettag
     */
    public static long getlBussUndBettag() {
        return lBussUndBettag;
    }

    /**
     * Für die Berechnung des Buß- und Bettag gilt folgendes: Dieser Tag ist
     * immer der vorletzte Mittwoch vor dem 1. Advent und kann demnach nur in
     * der Zeit vom 16. - 22.11. liegen. Zur Bestimmung des 1. Advent muss der
     * 4. Advent ermittelt werden. Der 4. Advent ist nun der letzte Sonntag vor
     * dem 1. Weihnachtstag (25.12.) und kann demnach nur in der Zeit vom 18. -
     * 24.12 liegen. Um diesen Sonntag zu bestimmen, muss die Tageszahl des
     * 24.12. ermittelt werden. Für die Ermittlung der Tageszahl eines
     * bestimmten Datum gibt es eine Formel, die jedoch nur für die Tage vom
     * 1.1.1901 bis zum 31.12.2099 korrekt ist. Da aber in der Zeit zwischen
     * Ostern und Weihnachten keine Schalttage liegen können, kann man den 4.
     * Advent trotzdem korrekt berechnen.
     * <p>
     * http://www.dagmar-mueller.de/wdz/html/feiertagsberechnung.html
     * --> jetzt auf https://www.welt-der-zahlen.info/berechnung.html
     *
     * @param lBussUndBettag the lBussUndBettag to set
     */
    private static void setlBussUndBettag(long lBussUndBettag) {
        MovableFeasts.lBussUndBettag = lBussUndBettag;
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
        MovableFeasts.iYear = iYear;
    }

    /**
     * @return achsermittwoch
     */
    public LocalDateTime getAschermittwoch() {

        long day = 46;

        long dayb = day * (24 * 60 * 60 * 1000);

        long aDay = 24 * 60 * 60 * 1000;

        achsermittwoch = easterSunday().getTimeInMillis() - dayb;

        // Muss Mittwoch sein
        Date date = new Date(achsermittwoch);
        Calendar cali = Calendar.getInstance();
        cali.setTime(date);

        int weekday = cali.get(Calendar.DAY_OF_WEEK);
        if (weekday != 4) {
            achsermittwoch = achsermittwoch + aDay;
        }
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(achsermittwoch), ZoneId.systemDefault());
    }

    public LocalDateTime getPalmsonntag() {
        long day = 7;

        long dayb = day * (24 * 60 * 60 * 1000);

        palmsonntag = easterSunday().getTimeInMillis() - dayb;
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(palmsonntag), ZoneId.systemDefault());
    }

    /**
     * @return karfreitag
     */
    public LocalDateTime getKarfreitag() {
        long day = 2;

        long dayb = day * (24 * 60 * 60 * 1000);
        karfreitag = easterSunday().getTimeInMillis() - dayb;
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(karfreitag), ZoneId.systemDefault());
    }

    public LocalDateTime getOstersonntag() {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(easterSunday().getTimeInMillis()), ZoneId.systemDefault());
    }

    public LocalDateTime getOstermontag() {
        long day = 1;

        long dayb = day * (24 * 60 * 60 * 1000);

        ostermontag = easterSunday().getTimeInMillis() + dayb;

        return LocalDateTime.ofInstant(Instant.ofEpochMilli(ostermontag), ZoneId.systemDefault());
    }

    public LocalDateTime getChristiHimmelfahrt() {
        long day = 39;

        long dayb = day * (24 * 60 * 60 * 1000);

        christiHimmelfahrt = easterSunday().getTimeInMillis() + dayb;

        return LocalDateTime.ofInstant(Instant.ofEpochMilli(christiHimmelfahrt), ZoneId.systemDefault());

    }

    public LocalDateTime getPfingsten() {
        long day = 50;

        long dayb = day * (24 * 60 * 60 * 1000);

        pfingsten = easterSunday().getTimeInMillis() + dayb;

        return LocalDateTime.ofInstant(Instant.ofEpochMilli(pfingsten), ZoneId.systemDefault());
    }

    public LocalDateTime getFronleichnam() {
        long day = 60;

        long dayb = day * (24 * 60 * 60 * 1000);

        fronleichnam = easterSunday().getTimeInMillis() + dayb;

        this.setFronleichnam(fronleichnam);
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(fronleichnam), ZoneId.systemDefault());
    }

    /**
     * Update the value of fronleichnam.
     *
     * @param fronleichnam the fronleichnam to set
     */
    public void setFronleichnam(long fronleichnam) {
        MovableFeasts.fronleichnam = fronleichnam;
    }
}
