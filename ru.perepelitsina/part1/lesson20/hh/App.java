package ru.perepelitsina.part1.lesson20.hh;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class App {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.hh.ru/vacancies?text=java&area=1438");
            try (InputStream is = url.openStream();){
                ObjectMapper om = new ObjectMapper();
                om.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                om.enable(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES);
                ArrItems arrItems = om.readValue(is, ArrItems.class);
                System.out.println(arrItems.toString());
            } catch (IOException e){
                e.printStackTrace();
            }
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}
