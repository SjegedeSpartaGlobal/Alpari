package com.sparta.sj;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class RatesFileReader {

    private FileReader ratesFile;

    public RatesFileReader(String path) {
        try {
            this.ratesFile = new FileReader(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public FileReader getRatesFile() {
        return this.ratesFile;
    }
}

