package com.dkn199.encryptdecrypt.algorithms;

import com.dkn199.encryptdecrypt.reader.Reader;
import com.dkn199.encryptdecrypt.reader.ReaderFactory;
import com.dkn199.encryptdecrypt.type.EncryptionModeType;
import com.dkn199.encryptdecrypt.type.EnumUtils;
import com.dkn199.encryptdecrypt.type.ReaderType;

public class Encrypter {

    private final EncryptionAlgorithm encryptionAlgorithm;

    public Encrypter(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    private static EncryptionModeType readEncryptionMode() {
        Reader reader = ReaderFactory.getReader(ReaderType.CONSOLE, null);
        System.out.println("Choose encryption mode (enc/dec):");

        String inputEncryptionMode = reader.read();
        EncryptionModeType encryptionType = EnumUtils.lookupMap(EncryptionModeType.class,
                EncryptionModeType::getValue).apply(inputEncryptionMode);

        if (encryptionType == null) {
            throw new IllegalArgumentException("Invalid encryptionMode value: " + encryptionType);
        }
        return encryptionType;

    }

    public String getProcessedText(String text, EncryptionModeType encryptionMode) {

        if (encryptionMode == null) {
            encryptionMode = readEncryptionMode();
        }

        switch (encryptionMode) {
            case ENCRYPT:
                return encryptionAlgorithm.encrypt(text);
            case DECRYPT:
                return encryptionAlgorithm.decrypt(text);
            default:
                throw new IllegalArgumentException("Invalid encryptionMode value: " + encryptionMode);
        }
    }
}
