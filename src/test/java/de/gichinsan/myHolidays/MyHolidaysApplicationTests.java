package de.gichinsan.myHolidays;

import de.gichinsan.myHolidays.controller.MyHolidayController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@AutoConfigureRestDocs(outputDir = "target/snippets")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MyHolidaysApplicationTests {

    @Autowired
    private MyHolidayController controller;

    @LocalServerPort
    private int port;

    private int year = 2021;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void getAschermittwoch() {
        assertThat(controller.getAschermittwoch(year)).isEqualTo("2021-02-17T23:00");
    }

    @Test
    public void getPalmsonntag() {
        assertThat(controller.getPalmsonntag(year)).isEqualTo("2021-03-27T23:00");
    }

    @Test
    public void getKarfreitag() {
        assertThat(controller.getKarfreitag(year)).isEqualTo("2021-04-02T00:00");
    }

    @Test
    public void getOstersonntag() {
        assertThat(controller.getOstersonntag(year)).isEqualTo("2021-04-04T00:00");
    }

    @Test
    public void getChristiHimmelfahrt() {
        assertThat(controller.getChristiHimmelfahrt(year)).isEqualTo("2021-05-13T00:00");
    }

    @Test
    public void getPfingsten() {
        assertThat(controller.getPfingsten(year)).isEqualTo("2021-05-24T00:00");
    }

    @Test
    public void getFronleichnam() {
        assertThat(controller.getFronleichnam(year)).isEqualTo("2021-06-03T00:00");
    }


    @Test
    public void getsHeilige() {
        assertThat(controller.getsHeilige(year)).isEqualTo("2021-01-06");
    }

    @Test
    public void getsMaifeiertag() {
        assertThat(controller.getMaiFeiertage(year)).isEqualTo("2021-05-01");
    }


    @Test
    public void getsNeujahr() {
        assertThat(controller.getsNeujahr(year)).isEqualTo("2021-01-01");
    }

    @Test
    public void getsTagderDeutschenEinheit() {
        assertThat(controller.getsTagderDeutschenEinheit(year)).isEqualTo("2021-10-03");
    }

    @Test
    public void getsWeihnachten() {
        assertThat(controller.getsWeihnachten(year)).isEqualTo("2021-12-24");
    }

    @Test
    public void gets1Weihnachten() {
        assertThat(controller.gets1Weihnachten(year)).isEqualTo("2021-12-25");
    }

    @Test
    public void gets2Weihnachten() {
        assertThat(controller.gets2Weihnachten(year)).isEqualTo("2021-12-26");
    }

    @Test
    public void getsSilvester() {
        assertThat(controller.getsSilvester(year)).isEqualTo("2021-12-31");
    }


    @Test
    public void getCalcDayofMonth12() {
        assertThat(controller.getCalcDayofMonth(year, 12)).isEqualTo(23);
    }

    @Test
    public void getCalcDayofMonth1() {
        assertThat(controller.getCalcDayofMonth(year, 1)).isEqualTo(19);
    }

    @Test
    public void getCalcDayofMonth2() {
        assertThat(controller.getCalcDayofMonth(year, 2)).isEqualTo(20);
    }

    @Test
    public void getCalcDayofMonth3() {
        assertThat(controller.getCalcDayofMonth(year, 3)).isEqualTo(23);
    }

    @Test
    public void getCalcDayofMonth4() {
        assertThat(controller.getCalcDayofMonth(year, 4)).isEqualTo(20);
    }

    @Test
    public void getCalcDayofMonth5() {
        assertThat(controller.getCalcDayofMonth(year, 5)).isEqualTo(19);
    }

    @Test
    public void getCalcDayofMonth6() {
        assertThat(controller.getCalcDayofMonth(year, 6)).isEqualTo(21);
    }

    @Test
    public void getCalcDayofMonth7() {
        assertThat(controller.getCalcDayofMonth(year, 7)).isEqualTo(22);
    }

    @Test
    public void getCalcDayofMonth8() {
        assertThat(controller.getCalcDayofMonth(year, 8)).isEqualTo(22);
    }

    @Test
    public void getCalcDayofMonth9() {
        assertThat(controller.getCalcDayofMonth(year, 9)).isEqualTo(22);
    }

    @Test
    public void getCalcDayofMonth10() {
        assertThat(controller.getCalcDayofMonth(year, 10)).isEqualTo(21);
    }

    @Test
    public void getCalcDayofMonth11() {
        assertThat(controller.getCalcDayofMonth(year, 11)).isEqualTo(21);
    }
}
