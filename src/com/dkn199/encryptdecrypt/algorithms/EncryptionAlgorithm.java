package com.dkn199.encryptdecrypt.algorithms;

public abstract class EncryptionAlgorithm {

    private int shift;

    public EncryptionAlgorithm(int shift) {
        this.shift = shift;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public abstract String encrypt(String text);

    public abstract String decrypt(String text);
}

