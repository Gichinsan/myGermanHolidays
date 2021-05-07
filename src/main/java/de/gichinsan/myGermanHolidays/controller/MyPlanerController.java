package de.gichinsan.myGermanHolidays.controller;

import de.gichinsan.myGermanHolidays.model.CountyModel;
import de.gichinsan.myGermanHolidays.model.HolidayModel;
import de.gichinsan.myGermanHolidays.utils.FederalStates;
import de.gichinsan.myGermanHolidays.utils.FixedFeasts;
import de.gichinsan.myGermanHolidays.utils.MovableFeasts;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MyPlanerController implements Serializable {

    /**
     * Liefert eine Liste aller Gesetzlichen Feiertage für ein Bundesland zurück.
     *
     * @param year Jahr
     * @param bl   Abkürzung eines Bundeslandes oder all für Alle Bundesländer
     * @return Name des Feiertages, Datum und wenn vorhanden eine Bemerkung
     */
    @RequestMapping(value = "/v1/myplan", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public CountyModel getMyPlan(@RequestParam(value = "year") int year, @RequestParam(value = "bl") String bl) {
        MovableFeasts mf = new MovableFeasts(year);
        FixedFeasts ff = new FixedFeasts(year);

        CountyModel countyModel = new CountyModel();
        countyModel.setCounty(FederalStates.valueOf(bl.toUpperCase()).displayName());

        List<HolidayModel> myHolidayList = new ArrayList<>();

        HolidayModel hmodelN = new HolidayModel();
        hmodelN.setDescription("Neujahr");
        hmodelN.setDate(ff.getsNeujahr());
        myHolidayList.add(hmodelN);

        if (bl.equalsIgnoreCase("bw") || bl.equalsIgnoreCase("BY") || bl.equalsIgnoreCase("ST") || bl.equalsIgnoreCase("all")) {
            HolidayModel hmodelL = new HolidayModel();
            hmodelL.setDescription("Heillige drei Könige");
            hmodelL.setDate(ff.getsHeilige());
            myHolidayList.add(hmodelL);
        }

        HolidayModel hmodelD = new HolidayModel();
        hmodelD.setDescription("Palmsonntag");
        hmodelD.setDate(mf.getPalmsonntag());
        myHolidayList.add(hmodelD);

        HolidayModel hmodelE = new HolidayModel();
        hmodelE.setDescription("Karfreitag");
        hmodelE.setDate(mf.getKarfreitag());
        myHolidayList.add(hmodelE);

        HolidayModel hmodelF = new HolidayModel();
        hmodelF.setDescription("Ostersonntag");
        hmodelF.setDate(mf.getOstersonntag());
        myHolidayList.add(hmodelF);

        HolidayModel hmodelG = new HolidayModel();
        hmodelG.setDescription("Ostermontag");
        hmodelG.setDate(mf.getOstermontag());
        myHolidayList.add(hmodelG);

        HolidayModel hmodelM = new HolidayModel();
        hmodelM.setDescription("Maifeiertag");
        hmodelM.setDate(ff.getsMaifeiertag());
        myHolidayList.add(hmodelM);

        HolidayModel hmodelC = new HolidayModel();
        hmodelC.setDescription("Christi Himmelfahrt");
        hmodelC.setDate(mf.getChristiHimmelfahrt());
        myHolidayList.add(hmodelC);

        HolidayModel hmodelJ = new HolidayModel();
        hmodelJ.setDescription("Pfingsten");
        hmodelJ.setDate(mf.getPfingsten());
        myHolidayList.add(hmodelJ);

        if (bl.equalsIgnoreCase("bw") || bl.equalsIgnoreCase("by") || bl.equalsIgnoreCase("he") || bl.equalsIgnoreCase("nw") || bl.equalsIgnoreCase("rp") || bl.equalsIgnoreCase("sl") || bl.equalsIgnoreCase("all")) {
            HolidayModel hmodelK = new HolidayModel();
            hmodelK.setDescription("Fronleichnam");
            hmodelK.setDate(mf.getFronleichnam());
            myHolidayList.add(hmodelK);
        }

        HolidayModel hmodelO = new HolidayModel();
        hmodelO.setDescription("Tag der Deutschen Einheit");
        hmodelO.setDate(ff.getsTagderDeutschenEinheit());
        myHolidayList.add(hmodelO);

        if (bl.equalsIgnoreCase("bw") || bl.equalsIgnoreCase("BY") || bl.equalsIgnoreCase("ST") || bl.equalsIgnoreCase("nw") || bl.equalsIgnoreCase("rp") || bl.equalsIgnoreCase("sl") || bl.equalsIgnoreCase("all")) {
            HolidayModel hmodelT = new HolidayModel();
            hmodelT.setDescription("Allerheilligen");
            hmodelT.setDate(ff.getlAllerheiligen());
            myHolidayList.add(hmodelT);
        }

        if (bl.equalsIgnoreCase("bw") || bl.equalsIgnoreCase("all")) {
            HolidayModel hmodelB = new HolidayModel();
            hmodelB.setDescription("Buß und Bettag");
            hmodelB.setDate(mf.getlBussUndBettag());
            myHolidayList.add(hmodelB);
        }

        HolidayModel hmodelP = new HolidayModel();
        hmodelP.setDescription("Weihnachten");
        hmodelP.setDate(ff.getsWeihnachten());
        myHolidayList.add(hmodelP);

        HolidayModel hmodelQ = new HolidayModel();
        hmodelQ.setDescription("Erster Weihnachtsfeiertag");
        hmodelQ.setDate(ff.gets1Weihnachten());
        myHolidayList.add(hmodelQ);

        HolidayModel hmodelR = new HolidayModel();
        hmodelR.setDescription("Zweiter Weihnachtsfeiertag");
        hmodelR.setDate(ff.gets2Weihnachten());
        myHolidayList.add(hmodelR);

        HolidayModel hmodelS = new HolidayModel();
        hmodelS.setDescription("Silvester");
        hmodelS.setDate(ff.getsSilvester());
        myHolidayList.add(hmodelS);

        countyModel.setHmodel(myHolidayList);

        return countyModel;
    }

    /**
     * getFederalStatesList
     *
     * @return Liste aller möglichen Abkürzungen.
     */
    @RequestMapping(value = "/v1/federalList", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
    @ResponseBody
    public List<FederalStates> getFederalStatesList() {
        return Arrays.asList(FederalStates.values());
    }
}
