package de.gichinsan.myHolidays.utils;

import lombok.Data;
import lombok.val;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;

@Data
public class CalcWorkMonthlyDays {

    private int year;
    private int month;

    /**
     *
     * @param year
     * @param month
     */
    public CalcWorkMonthlyDays(int year, int month) {
        this.setMonth(month);
        this.setYear(year);
    }

    /**
     *
     * @return
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
     * @param startDate
     * @param endDate
     * @return
     */
    private int getWorkDays(LocalDate startDate, LocalDate endDate) {
        startDate = startDate.minusDays(1);
        int dayCtr = 1;
        int days = 1;
        while (startDate.plusDays(dayCtr).isBefore(endDate)) {
            dayCtr += 1;
            val dow = startDate.plusDays(dayCtr).getDayOfWeek();
            if (!dow.equals(DayOfWeek.SATURDAY) && !dow.equals(DayOfWeek.SUNDAY))
                days += 1;
        }
        return days;
    }


}
