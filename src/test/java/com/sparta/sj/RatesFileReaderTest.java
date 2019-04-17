package com.sparta.sj;

import org.junit.*;

import java.io.BufferedReader;
import java.io.FileReader;

public class RatesFileReaderTest{

    private RatesFileReader reader;

    @Before
    public void createFileReader() {
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


    @After
    public void destroyFileReader(){
        reader = null;
    }

    @Ignore
    public void testReaderIsDestroyed(){
        Assert.assertTrue(reader==null);
    }
}
