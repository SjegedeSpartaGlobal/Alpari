package com.sparta.sj;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RatesJsonParser {

    private JSONObject ratesJson;

    public RatesJsonParser(String filepath) {

        try {
            RatesFileReader reader = new RatesFileReader(filepath);
            JSONParser parser = new JSONParser();
            ratesJson = (JSONObject) parser.parse(reader.getRatesFile());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public JSONObject getRatesJson() {
        return ratesJson;
    }
}


