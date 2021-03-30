/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author braya
 */
public class FileManager {

    public static boolean createFile(String fileModel) {
        boolean created = false;
        try {
            File file = new File(fileModel + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;

    }

    public static boolean save(String data, String fileModel) {
        boolean saved = false;

        createFile(fileModel);

        try {
            FileWriter myWrite = new FileWriter(fileModel + ".txt", true);
            myWrite.write(System.getProperty("line.separator") + data);
            myWrite.close();
            System.out.println("A new record of " + fileModel + " was saved");
            saved = true;
        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;

        }

        return saved;

    }


    public static String read(String calculators) {
        calculators = null;
        String text = null;
        String document = "C:\\Users\\braya\\OneDrive\\Documentos\\ESPE\\II Semestre\\Fundamentos de Programación\\"
                + "Code U1\\ESPE202011-FP-GEO-3285\\workshops\\unit3\\WS27ADT\\ElectronicsStoreSystem.cvs";
        try (BufferedReader textBr = new BufferedReader(new FileReader(document))) {
            while ((calculators = textBr.readLine()) != null) {
                text = calculators;
            }
        } catch (IOException ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }

        return text;
    }
}
