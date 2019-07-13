package com.dkn199.encryptdecrypt.type;

public enum EncryptionModeType implements StringEnum {
    ENCRYPT("enc"), DECRYPT("dec");

    private final String value;

    EncryptionModeType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
