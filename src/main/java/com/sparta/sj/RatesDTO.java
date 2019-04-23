package com.sparta.sj;

import org.json.simple.JSONObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class RatesDTO {

    private JSONObject rates;

    public RatesDTO(String filepath) {
         RatesJsonParser parser = new RatesJsonParser(filepath);

         rates = parser.getRatesJson();
    }

    public JSONObject getRates() {
        return rates;
    }

    public boolean getSuccess(){
        return (boolean) rates.get("success");
    }

    public int getTimeStamp(){
        return (int) rates.get("timestamp");
    }

    public String getBase(){
        return (String) rates.get("base");
    }

    public LocalDate getDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        LocalDate date  = LocalDate.parse((String) rates.get("date"), formatter);
        return date;
    }



}
