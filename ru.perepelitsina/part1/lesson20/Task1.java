package ru.perepelitsina.part1.lesson20;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

//Есть набор бесплатных сервисов в интернете, предоставляющих данные в формате JSON:
//https://github.com/toddmotto/public-apis/blob/master/README.md
//Выбрать любой сервис, какой больше нравится, и написать программу, которая с ним взаимодействует.
//Класс сериализуемого объекта может содержать не все поля, а только 2-3 ключевых. Например, для погоды
// достаточно показать диапазон температур.
//Минимальное количество запросов к сервису - 1.
// Не обязательно реализовывать весь функционал, предоставляемый сервисом. Достаточного одного любого запроса
public class Task1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://datazen.katren.ru/calendar/day/");
            try (InputStream is = url.openStream();
            ){
                ObjectMapper om = new ObjectMapper();
                om.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                CalendarDay calendarDay = om.readValue(is, CalendarDay.class);
                System.out.println(calendarDay.toString());
            } catch (IOException e){
                e.printStackTrace();
            }
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}
