package de.gichinsan.myGermanHolidays.utils;

import lombok.Data;
import lombok.val;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Data
public class CalcWorkMonthlyDays {

    private int year;
    private int month;

    /**
     * @param year INT
     * @param month INT
     */
    public CalcWorkMonthlyDays(int year, int month) {
        this.setMonth(month);
        this.setYear(year);
    }

    /**
     * @return Anzahl der Arbeitstage - INT
     */
    public int getCalcWorkMonthlyDays() {
        // Get the number of days in that month
        YearMonth yearMonthObject = YearMonth.of(this.getYear(), this.getMonth());

        //First day of this Month
        LocalDate startDate = YearMonth.of(this.getYear(), this.getMonth()).atDay(1);

        //Last day of this Month
        LocalDate endDate = yearMonthObject.atEndOfMonth();

        return getWorkDays(startDate, endDate);
    }


    /**
     * @param startDate LocalDate
     * @param endDate LocalDate
     * @return int Anzahl der Arbeitstage
     */
    private int getWorkDays(LocalDate startDate, LocalDate endDate) {
        int days = 0;
        while (startDate.isBefore(endDate.plusDays(1))) {
            val dow = startDate.getDayOfWeek();
            if ((!dow.equals(DayOfWeek.SATURDAY) && !dow.equals(DayOfWeek.SUNDAY)) && !isFeasts(startDate)) {
                days += 1;
            }
            startDate = startDate.plusDays(1);
        }
        return days;
    }

    /**
     * isFeasts gibt zurück ob es sich um einen beweglichen oder festen Feiertag handelt.
     * <p>
     * Note: Weihnachten und Silverster sind zu meinst halbe Arbeitstage!
     *
     * @param startDate LocalDate
     * @return boolean true/false
     */
    private boolean isFeasts(LocalDate startDate) {
        int year = startDate.getYear();
        MovableFeasts mf = new MovableFeasts(year);
        FixedFeasts ff = new FixedFeasts(year);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatter = formatter.withLocale(Locale.GERMAN);

        if ((mf.getChristiHimmelfahrt().format(formatter).equals(startDate.toString()))
                || (mf.getPfingsten().format(formatter).equals(startDate.toString()))
                || (mf.getKarfreitag().format(formatter).equals(startDate.toString()))
                || (mf.getOstermontag().format(formatter).equals(startDate.toString()))
                || (ff.getsNeujahr().equals(startDate.toString()))
                || (ff.getsMaifeiertag().equals(startDate.toString()))
                || (ff.getlAllerHeiligen().format(formatter).equals(startDate.toString()))
                || (ff.gets1Weihnachten().equals(startDate.toString()))
                || (ff.gets2Weihnachten().equals(startDate.toString()))
                || (ff.getsTagderDeutschenEinheit().equals(startDate.toString()))
                || (ff.getsHeilige().equals(startDate.toString()))
                || (mf.getFronleichnam().format(formatter).equals(startDate.toString()))) {
            return true;
        } else {
            return false;
        }
    }


}
