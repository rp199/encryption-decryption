package com.dkn199.encryptdecrypt.reader;

import com.dkn199.encryptdecrypt.type.ReaderType;

import java.io.File;

public class ReaderFactory {

    public static Reader getReader(ReaderType readerType, String inputFilepath) {
        switch (readerType) {
            case CONSOLE:
                return new ConsoleReader();
            case FILE:
                return new FileReader(new File(inputFilepath));
            default:
                throw new IllegalArgumentException("Invalid printer type: " + readerType);
        }
    }
}
