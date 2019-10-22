package ru.perepelitsina.part1.lesson20.hh;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class Items {
    String name;
    String id;
    Area area;

    public Items(String name, String description, String createdAt, String contacts, Area area) {
        this.name = name;
        this.id = contacts;
        this.area = area;
    }

    public Items() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Vacancy{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", area=" + area.toString() +
                '}' + "\n";
    }
}
