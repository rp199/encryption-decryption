package com.dkn199.encryptdecrypt.printer;

import com.dkn199.encryptdecrypt.type.PrinterType;

import java.io.File;

public class PrinterFactory {

    public static Printer getPrinter(String outputFilepath) {
        PrinterType printerType = outputFilepath != null ? PrinterType.FILE : PrinterType.CONSOLE;
        return PrinterFactory.getPrinter(printerType, outputFilepath);

    }

    private static Printer getPrinter(PrinterType printerType, String outputFilepath) {
        switch (printerType) {
            case CONSOLE:
                return new ConsolePrinter();
            case FILE:
                return new FilePrinter(new File(outputFilepath));
            default:
                throw new IllegalArgumentException("Invalid printer type: " + printerType);
        }
    }
}
