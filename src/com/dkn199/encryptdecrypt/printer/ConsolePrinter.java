package com.dkn199.encryptdecrypt.printer;

public class ConsolePrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
