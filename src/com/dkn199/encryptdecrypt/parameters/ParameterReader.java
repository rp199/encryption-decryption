package com.dkn199.encryptdecrypt.parameters;

import com.dkn199.encryptdecrypt.type.EncryptionAlgorithmType;
import com.dkn199.encryptdecrypt.type.EncryptionModeType;
import com.dkn199.encryptdecrypt.type.EnumUtils;
import com.dkn199.encryptdecrypt.type.ParamType;

public class ParameterReader {

    public static Parameters readParameters(String[] args) {
        Parameters params = new Parameters();
        for (int i = 0, j = 1; i < args.length - 1; i += 2, j += 2) {
            ParamType paramType = EnumUtils.lookupMap(ParamType.class, ParamType::getValue).apply(args[i]);

            if (paramType == null) {
                throw new IllegalArgumentException("Input parameter " + args[i] + "is not supported!");
            }

            switch (paramType) {
                case MODE:
                    params.setEncryptionModeType(EnumUtils.lookupMap(EncryptionModeType.class,
                            EncryptionModeType::getValue).apply(args[j]));
                    break;
                case KEY:
                    params.setKey(Integer.parseInt(args[j]));
                    break;
                case DATA:
                    params.setData(args[j]);
                    break;
                case IN:
                    params.setInFile(args[j]);
                    break;
                case OUT:
                    params.setOutFile(args[j]);
                    break;
                case ALG:
                    params.setAlgorithmType(EnumUtils.lookupMap(EncryptionAlgorithmType.class,
                            EncryptionAlgorithmType::getValue).apply(args[j]));
                    break;
            }

        }
        return params;
    }
}
