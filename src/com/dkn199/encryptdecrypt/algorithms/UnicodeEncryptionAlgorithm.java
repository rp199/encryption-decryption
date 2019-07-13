package com.dkn199.encryptdecrypt.algorithms;

public class UnicodeEncryptionAlgorithm extends EncryptionAlgorithm{

    public  UnicodeEncryptionAlgorithm(int shift){
        super(shift);
    }

    @Override
    public String encrypt(String text) {
        return this.processString(text, true);
    }

    @Override
    public String decrypt(String text) {
        return this.processString(text, false);
    }

    private String processString(String text, boolean positiveShift){
        String result = "";
        for(char c: text.toCharArray()){
            result +=  (char)(positiveShift? c + this.getShift(): c - this.getShift());
        }
        return result;
    }
}
