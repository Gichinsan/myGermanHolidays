package de.gichinsan.myGermanHolidays.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CountyModel {

    @JsonProperty("Bundesland")
    private String county;

    @JsonProperty("Liste aller Feiertage")
    private List<HolidayModel> hmodel;
}
