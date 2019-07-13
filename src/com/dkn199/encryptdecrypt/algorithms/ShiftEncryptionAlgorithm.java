package com.dkn199.encryptdecrypt.algorithms;

public class ShiftEncryptionAlgorithm extends EncryptionAlgorithm{

    public ShiftEncryptionAlgorithm(int shift){
        super(shift);
    }

    @Override
    public String encrypt(String text) {
        String cypher ="";
        for(char c: text.toCharArray()){
            char shiftedChar = c;
            if(c >= 'a' && c<='z'){
                shiftedChar += this.getShift();
                if(c + this.getShift() > 'z'){
                    shiftedChar = (char)(shiftedChar -'z' + 'a' - 1);
                }
            }
            cypher += shiftedChar;
        }
       return cypher;
}

    @Override
    public String decrypt(String text) {
        String cypher ="";
        for(char c: text.toCharArray()){
            char shiftedChar = c;
            if(c >= 'a' && c<='z'){
                shiftedChar -= this.getShift();
                if(shiftedChar < 'a'){
                    shiftedChar = (char)('z' - ('a' - shiftedChar) + 1);
                }
            }
            cypher += shiftedChar;
        }
        return cypher;
    }
}
