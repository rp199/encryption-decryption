package com.dkn199.encryptdecrypt.algorithms;

import com.dkn199.encryptdecrypt.reader.Reader;
import com.dkn199.encryptdecrypt.reader.ReaderFactory;
import com.dkn199.encryptdecrypt.type.EncryptionAlgorithmType;
import com.dkn199.encryptdecrypt.type.EnumUtils;
import com.dkn199.encryptdecrypt.type.ReaderType;

public class EncryptionAlgorithmFactory {

    public static EncryptionAlgorithm getEncryptionAlgorithm(EncryptionAlgorithmType encryptionAlgorithm, int shift) {
        if (encryptionAlgorithm == null) {
            encryptionAlgorithm = readEncryptionAlgorithm();
        }

        switch (encryptionAlgorithm) {
            case SHIFT:
                return new ShiftEncryptionAlgorithm(shift);
            case UNICODE:
                return new UnicodeEncryptionAlgorithm(shift);
            default:
                throw new IllegalArgumentException("Invalid encryptionMode value: " + encryptionAlgorithm);
        }
    }

    private static EncryptionAlgorithmType readEncryptionAlgorithm() {
        Reader reader = ReaderFactory.getReader(ReaderType.CONSOLE, null);
        System.out.println("Choose the algorithm (shift/unicode):");

        String inputAlgorithmType = reader.read();
        EncryptionAlgorithmType algorithmType = EnumUtils.lookupMap(EncryptionAlgorithmType.class,
                EncryptionAlgorithmType::getValue).apply(inputAlgorithmType);

        if (algorithmType == null) {
            throw new IllegalArgumentException("Invalid encryptionMode value: " + inputAlgorithmType);
        }
        return algorithmType;

    }
}
