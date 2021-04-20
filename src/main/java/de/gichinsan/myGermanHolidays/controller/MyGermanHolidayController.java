package de.gichinsan.myGermanHolidays.controller;

import de.gichinsan.myGermanHolidays.utils.CalcWorkMonthlyDays;
import de.gichinsan.myGermanHolidays.utils.FixedFeasts;
import de.gichinsan.myGermanHolidays.utils.MovableFeasts;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

@RestController
public class MyGermanHolidayController implements Serializable {

    /**
     * Returns the String object of the requested date of Aschermittwoch.
     *
     * @param year the year for a day of Aschermittwoch
     * @return the Date of Aschermittwoch
     */
    @RequestMapping(value = "/v1/aschermittwoch", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getAschermittwoch(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getAschermittwoch().toString();
    }

    /**
     * Returns the String object of the requested date of Palmsonntag.
     *
     * @param year the year for a day of Palmsonntag
     * @return the Date of Palmsonntag
     */
    @RequestMapping(value = "/v1/palmsonntag", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getPalmsonntag(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getPalmsonntag().toString();
    }

    /**
     * Returns the String object of the requested date of Karfreitag.
     *
     * @param year the year for a day of Karfreitag
     * @return the Date of Karfreitag
     */
    @RequestMapping(value = "/v1/karfreitag", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getKarfreitag(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getKarfreitag().toString();
    }

    /**
     * Returns the String object of the requested date of Ostersonntag.
     *
     * @param year the year for a day of Ostersonntag
     * @return the Date of Ostersonntag
     */
    @RequestMapping(value = "/v1/ostersonntag", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getOstersonntag(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getOstersonntag().toString();
    }

    /**
     * Returns the String object of the requested date of Ostermontag.
     *
     * @param year the year for a day of Ostermontag
     * @return the Date of Ostermontag
     */
    @RequestMapping(value = "/v1/ostermontag", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getOstermontag(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getOstermontag().toString();
    }

    /**
     * Returns the String object of the requested date of ChristiHimmelfahrt.
     *
     * @param year the year for a day of ChristiHimmelfahrt
     * @return the Date of ChristiHimmelfahrt
     */
    @RequestMapping(value = "/v1/christiHimmelfahrt", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getChristiHimmelfahrt(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getChristiHimmelfahrt().toString();
    }

    /**
     * Returns the String object of the requested date of Pfingsten.
     *
     * @param year the year for a day of Pfingsten
     * @return the Date of Pfingsten
     */
    @RequestMapping(value = "/v1/pfingsten", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getPfingsten(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getPfingsten().toString();
    }

    /**
     * Returns the String object of the requested date of Fronleichnam.
     *
     * @param year the year for a day of Fronleichnam
     * @return the Date of Fronleichnam
     */
    @RequestMapping(value = "/v1/fronleichnam", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getFronleichnam(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getFronleichnam().toString();
    }

    /**
     * Returns the String object of the requested date of MaiFeiertage.
     *
     * @param year the year for a day of MaiFeiertage
     * @return the Date of MaiFeiertage
     */
    @RequestMapping(value = "/v1/maifeiertag", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getMaiFeiertage(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getsMaifeiertag();
    }

    /**
     * Berechnet die Arbeitstage eines Monats, ohne Wochenende und Feiertage.
     *
     * @param year  INT
     * @param month INT
     * @return Anzahl der Arbeitstage INT
     */
    @RequestMapping(value = "/v1/calcDayofMonth", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public int getCalcDayofMonth(@RequestParam(value = "year") int year, @RequestParam(value = "month") int month) {
        CalcWorkMonthlyDays cm = new CalcWorkMonthlyDays(year, month);
        return cm.getCalcWorkMonthlyDays();
    }

    /**
     * Returns the String object of the requested date of HeiligeDreiKönige.
     *
     * @param year the year for a day of HeiligeDreiKönige
     * @return the Date of HeiligeDreiKönige
     */
    @RequestMapping(value = "/v1/heilige", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getsHeilige(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getsHeilige();
    }

    /**
     * Returns the String object of the requested date of Neujahr.
     *
     * @param year the year for a day of Neujahr
     * @return the Date of Neujahr
     */
    @RequestMapping(value = "/v1/neujahr", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getsNeujahr(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getsNeujahr();
    }

    /**
     * Returns the String object of the requested date of Tag der Deutschen Einheit.
     *
     * @param year the year for a day of Tag der Deutschen Einheit
     * @return the Date of Tag der Deutschen Einheit
     */
    @RequestMapping(value = "/v1/tagderDeutschenEinheit", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getsTagderDeutschenEinheit(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getsTagderDeutschenEinheit();
    }

    /**
     * Returns the String object of the requested date of Weihnachten.
     *
     * @param year the year for a day of Weihnachten
     * @return the Date of Weihnachten
     */
    @RequestMapping(value = "/v1/weihnachten", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getsWeihnachten(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getsWeihnachten();
    }

    /**
     * Returns the String object of the requested date of 1. Weihnachtsfeiertag.
     *
     * @param year the year for a day of 1. Weihnachtsfeiertag
     * @return the Date of 1. Weihnachtsfeiertag
     */
    @RequestMapping(value = "/v1/1Weihnachten", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String gets1Weihnachten(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.gets1Weihnachten();
    }

    /**
     * Returns the String object of the requested date of 2. Weihnachtsfeiertag.
     *
     * @param year the year for a day of 2. Weihnachtsfeiertag
     * @return the Date of 2. Weihnachtsfeiertag
     */
    @RequestMapping(value = "/v1/2Weihnachten", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String gets2Weihnachten(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.gets2Weihnachten();
    }

    /**
     * Returns the String object of the requested date of Silvester.
     *
     * @param year the year for a day of Silvester
     * @return the Date of Silvester
     */
    @RequestMapping(value = "/v1/silvester", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getsSilvester(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getsSilvester();
    }

    /**
     * Returns the String object of the requested date of Allerheiligen.
     *
     * @param year the year for a day of Allerheiligen
     * @return the Date of Allerheiligen
     */
    @RequestMapping(value = "/v1/allerheiligen", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getAllerheiligen(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getlAllerheiligen();
    }

    /**
     * Returns the String object of the requested date of Buss und Bettag.
     *
     * @param year the year for a day of Buss und Bettag
     * @return the Date of Buss und Bettag
     */
    @RequestMapping(value = "/v1/bussundbettag", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public String getBussUndBettag(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getlBussUndBettag().toString();
    }

}
