package ru.perepelitsina.part1.lesson20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CalendarDay {
    private Boolean holiday;
    private String date;

    public CalendarDay(Boolean holiday, String date) {
        this.holiday = holiday;
        this.date = date;
    }

    public CalendarDay() {
    }

    public Boolean getHoliday() {
        return holiday;
    }

    public void setHoliday(Boolean holiday) {
        this.holiday = holiday;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CalendarDay{" +
                "holiday=" + holiday +
                ", date='" + date + '\'' +
                '}';
    }
}
