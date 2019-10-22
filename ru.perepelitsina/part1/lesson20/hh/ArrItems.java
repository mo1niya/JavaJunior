package ru.perepelitsina.part1.lesson20.hh;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArrItems {
    Items[] items;

    public ArrItems(Items[] vac) {
        this.items = vac;
    }

    public ArrItems() {
    }

    public Items[] getItems() {
        return items;
    }

    public void setItems(Items[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ArrItems{" +
                "Items=" + Arrays.toString(items) +
                '}';
    }
}
