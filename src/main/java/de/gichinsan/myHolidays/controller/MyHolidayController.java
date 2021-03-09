package de.gichinsan.myHolidays.controller;

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

    @RequestMapping(value = "/v1/myholidays", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getAschermittwoch(@RequestParam(value = "year") int year) {
        MovableFeasts mf = new MovableFeasts(year);
        return mf.getAschermittwoch();
    }

    @RequestMapping(value = "/v1/maifeiertag", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String getMaiFeiertage(@RequestParam(value = "year") int year){
        FixedFeasts ff = new FixedFeasts(year);
        return ff.getsMaifeiertag();
    }

}
