package com.dkn199.encryptdecrypt.parameters;

import com.dkn199.encryptdecrypt.type.EncryptionAlgorithmType;
import com.dkn199.encryptdecrypt.type.EncryptionModeType;

public class Parameters {
    private EncryptionAlgorithmType algorithmType;
    private EncryptionModeType encryptionModeType;
    private String inFile;
    private String outFile;
    private String data;

    private int key;

    public EncryptionAlgorithmType getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(EncryptionAlgorithmType algorithmType) {
        this.algorithmType = algorithmType;
    }

    public EncryptionModeType getEncryptionModeType() {
        return encryptionModeType;
    }

    public void setEncryptionModeType(EncryptionModeType encryptionModeType) {
        this.encryptionModeType = encryptionModeType;
    }

    public String getInFile() {
        return inFile;
    }

    public void setInFile(String inFile) {
        this.inFile = inFile;
    }

    public String getOutFile() {
        return outFile;
    }

    public void setOutFile(String outFile) {
        this.outFile = outFile;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

}
