package de.gichinsan.myGermanHolidays.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class HolidayModel {

    @JsonProperty("Beschreibung")
    private String description;

    @JsonProperty("Datum")
    private String date;

    @JsonProperty("Bemerkung")
    private String note;

}
