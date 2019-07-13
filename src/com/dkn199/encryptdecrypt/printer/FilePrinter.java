package com.dkn199.encryptdecrypt.printer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {

    File outputFile;

    public FilePrinter(File outputFile) {
        this.outputFile = outputFile;
    }

    @Override
    public void print(String text) {
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(text);
        } catch (IOException e) {
            System.out.println("An exception occurred while writing file");
        }
    }
}
