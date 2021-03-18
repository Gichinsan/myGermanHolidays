package de.gichinsan.myHolidays.controller;

import de.gichinsan.myHolidays.utils.CalcWorkMonthlyDays;
import de.gichinsan.myHolidays.utils.FixedFeasts;
import de.gichinsan.myHolidays.utils.MovableFeasts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@Slf4j
public class MyHolidayController implements Serializable {

    @RequestMapping(value = "/v1/aschermittwoch", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getAschermittwoch(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getAschermittwoch().toString();
    }

    @RequestMapping(value = "/v1/palmsonntag", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getPalmsonntag(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getPalmsonntag().toString();
    }

    @RequestMapping(value = "/v1/karfreitag", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getKarfreitag(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getKarfreitag().toString();
    }

    @RequestMapping(value = "/v1/ostersonntag", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getOstersonntag(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getOstersonntag().toString();
    }

    @RequestMapping(value = "/v1/ostermontag", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getOstermontag(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getOstermontag().toString();
    }

    @RequestMapping(value = "/v1/christiHimmelfahrt", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getChristiHimmelfahrt(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getChristiHimmelfahrt().toString();
    }

    @RequestMapping(value = "/v1/pfingsten", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getPfingsten(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getPfingsten().toString();
    }

    @RequestMapping(value = "/v1/fronleichnam", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getFronleichnam(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getFronleichnam().toString();
    }


    @RequestMapping(value = "/v1/maifeiertag", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getMaiFeiertage(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getsMaifeiertag().toString();
    }

    @RequestMapping(value = "/v1/calcDayofMonth", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public int getCalcDayofMonth(@RequestParam(value = "year") int year, @RequestParam(value = "month") int month) {
        CalcWorkMonthlyDays cm = new CalcWorkMonthlyDays(year, month);
        return cm.getCalcWorkMonthlyDays();
    }

    @RequestMapping(value = "/v1/heilige", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getsHeilige(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getsHeilige().toString();
    }

    @RequestMapping(value = "/v1/neujahr", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getsNeujahr(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getsNeujahr().toString();
    }

    @RequestMapping(value = "/v1/tagderDeutschenEinheit", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getsTagderDeutschenEinheit(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getsTagderDeutschenEinheit().toString();
    }

    @RequestMapping(value = "/v1/weihnachten", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getsWeihnachten(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getsWeihnachten().toString();
    }

    @RequestMapping(value = "/v1/1Weihnachten", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String gets1Weihnachten(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.gets1Weihnachten().toString();
    }

    @RequestMapping(value = "/v1/2Weihnachten", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String gets2Weihnachten(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.gets2Weihnachten().toString();
    }

    @RequestMapping(value = "/v1/silvester", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getsSilvester(@RequestParam(value = "year") int year) {
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getsSilvester().toString();
    }


}
