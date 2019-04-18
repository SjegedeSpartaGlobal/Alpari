package com.sparta.sj;

import org.junit.Test;

public class RatesJsonParserTest {

    @Test
    public void parseJsonCheck(){
        RatesJsonParser ratesJsonParser = new RatesJsonParser("resources/rates.json");
        System.out.println(ratesJsonParser.getRatesJson());

    }
}
