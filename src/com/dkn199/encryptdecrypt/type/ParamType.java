package com.dkn199.encryptdecrypt.type;

public enum ParamType implements StringEnum {
    MODE("-mode"), KEY("-key"), DATA("-data"), IN("-in"), OUT("-out"), ALG("-alg");

    private final String value;

    ParamType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
