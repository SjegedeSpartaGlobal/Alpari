package com.sparta.sj;

import org.junit.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RatesFileReaderTest{

    private static RatesFileReader reader;

    @BeforeClass
    public static void createFileReader() {
        reader = new RatesFileReader("resources/rates.json");

    }

    @Test
    public void testFileReaderIsCreated(){
        Assert.assertTrue(reader!=null);


    }

    @Test
    public void testReaderIsFileReader(){
        Assert.assertTrue(reader.getRatesFile() instanceof FileReader);
    }


    @AfterClass
    public static void destroyFileReader(){
        reader = null;
    }

    @Ignore @Test
    public void testReaderIsDestroyed(){
        Assert.assertTrue(reader==null);
    }
}
