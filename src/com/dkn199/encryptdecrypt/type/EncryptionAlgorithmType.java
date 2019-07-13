package com.dkn199.encryptdecrypt.type;

public enum EncryptionAlgorithmType implements StringEnum {
    SHIFT("shift"), UNICODE("unicode");

    private final String value;

    EncryptionAlgorithmType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
