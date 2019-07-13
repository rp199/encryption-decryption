package com.dkn199.encryptdecrypt.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader implements Reader {

    private final File inputFile;

    public FileReader(File inputFile) {
        this.inputFile = inputFile;
    }

    @Override
    public String read() {
        String data = "";
        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNextLine()) {
                data += fileScanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        return data;
    }
}
