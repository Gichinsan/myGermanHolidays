package de.gichinsan.myGermanHolidays.utils;

import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Berechnung der beweglichen Feiertage in Deutschland.
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
    private static DateTimeFormatter formatter;

    /**
     * @param year int
     */
    public MovableFeasts(int year) {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.GERMAN);
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
     * Return the value of Buß und Bettag.
     * <p>
     * Nur in Sachsen ist dieser Tag ein freier Tag.
     * <p>
     * Zwischen Buss und Bettag und dem 4. Advent liegen 32 Tage.
     * Zwischen dem 4. Advent und dem 24.12. liegt die Anzahl Tage, die durch die Tageszahl ausgedrückt wird.
     *
     * @return the lBussUndBettag
     */
    public String getlBussUndBettag() {
        long day = 32;

        long dayb = day * (24 * 60 * 60 * 1000);

        long aDay = 24 * 60 * 60 * 1000;

        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        cal.set(MovableFeasts.getiYear(), 11, 24);

        lBussUndBettag = cal.getTimeInMillis() - dayb;

        Date date = new Date(lBussUndBettag);
        Calendar cali = Calendar.getInstance();
        cali.setTime(date);

        int weekday = cali.get(Calendar.DAY_OF_WEEK);
        LocalDateTime bubDay = null;
        //Finde den letzten Mittwoch
        if (weekday != 3) {
            while (weekday != 3) {
                lBussUndBettag = lBussUndBettag - aDay;
                LocalDateTime varDay = LocalDateTime.ofInstant(Instant.ofEpochMilli(lBussUndBettag), ZoneId.systemDefault());
                bubDay = varDay.minus(1, ChronoUnit.DAYS);
                weekday = bubDay.getDayOfWeek().getValue();
            }
        }
        return bubDay.format(formatter);
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
     * Aschermittwoch
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getAschermittwoch() {

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
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(achsermittwoch), ZoneId.systemDefault()).format(formatter);
    }

    /**
     * Palmsonntag
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getPalmsonntag() {
        long day = 7;

        long dayb = day * (24 * 60 * 60 * 1000);

        palmsonntag = easterSunday().getTimeInMillis() - dayb;
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(palmsonntag), ZoneId.systemDefault()).format(formatter);
    }

    /**
     * Karfreitag
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getKarfreitag() {
        long day = 2;

        long dayb = day * (24 * 60 * 60 * 1000);
        karfreitag = easterSunday().getTimeInMillis() - dayb;
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(karfreitag), ZoneId.systemDefault()).format(formatter);
    }

    /**
     * Ostersonntag
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getOstersonntag() {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(easterSunday().getTimeInMillis()), ZoneId.systemDefault()).format(formatter);
    }

    /**
     * Ostermontag
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getOstermontag() {
        long day = 1;

        long dayb = day * (24 * 60 * 60 * 1000);

        ostermontag = easterSunday().getTimeInMillis() + dayb;

        return LocalDateTime.ofInstant(Instant.ofEpochMilli(ostermontag), ZoneId.systemDefault()).format(formatter);
    }

    /**
     * Christi Himmelfahrt
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getChristiHimmelfahrt() {
        long day = 39;

        long dayb = day * (24 * 60 * 60 * 1000);

        christiHimmelfahrt = easterSunday().getTimeInMillis() + dayb;

        return LocalDateTime.ofInstant(Instant.ofEpochMilli(christiHimmelfahrt), ZoneId.systemDefault()).format(formatter);

    }

    /**
     * Pfingsten
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getPfingsten() {
        long day = 50;

        long dayb = day * (24 * 60 * 60 * 1000);

        pfingsten = easterSunday().getTimeInMillis() + dayb;

        return LocalDateTime.ofInstant(Instant.ofEpochMilli(pfingsten), ZoneId.systemDefault()).format(formatter);
    }

    /**
     * Fronleichnam
     *
     * @return Datum im Format "yyyy-MM-dd"
     */
    public String getFronleichnam() {
        long day = 60;

        long dayb = day * (24 * 60 * 60 * 1000);

        fronleichnam = easterSunday().getTimeInMillis() + dayb;

        this.setFronleichnam(fronleichnam);
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(fronleichnam), ZoneId.systemDefault()).format(formatter);
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
