package com.dkn199.encryptdecrypt;

import com.dkn199.encryptdecrypt.algorithms.EncryptionAlgorithmFactory;
import com.dkn199.encryptdecrypt.printer.Printer;
import com.dkn199.encryptdecrypt.printer.PrinterFactory;
import com.dkn199.encryptdecrypt.reader.Reader;
import com.dkn199.encryptdecrypt.reader.ReaderFactory;
import com.dkn199.encryptdecrypt.type.ReaderType;
import com.dkn199.encryptdecrypt.algorithms.Encrypter;
import com.dkn199.encryptdecrypt.parameters.ParameterReader;
import com.dkn199.encryptdecrypt.parameters.Parameters;


public class Main {

    public static void main(String[] args) {

        Parameters parameters = ParameterReader.readParameters(args);

        Reader reader;
        if (parameters.getInFile() != null) {
            reader = ReaderFactory.getReader(ReaderType.FILE, parameters.getInFile());
            parameters.setData(reader.read());
        } else if (parameters.getData() == null) {
            reader = ReaderFactory.getReader(ReaderType.CONSOLE, null);
            System.out.println("Enter data:");
            parameters.setData(reader.read());
            try {
                System.out.println("Enter key:");
                parameters.setKey(Integer.parseInt(reader.read()));
            } catch (NumberFormatException e) {
                System.out.println("Key must be a number!");
                return;
            }
        }

        Encrypter encrypter =
                new Encrypter(EncryptionAlgorithmFactory.getEncryptionAlgorithm(parameters.getAlgorithmType(),
                        parameters.getKey()));
        String result = encrypter.getProcessedText(parameters.getData(), parameters.getEncryptionModeType());

        Printer printer = PrinterFactory.getPrinter(parameters.getOutFile());
        printer.print(result);
    }
}
