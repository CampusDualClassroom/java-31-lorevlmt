package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Exercise31 {

    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/lorem.txt")));

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception ex2) {
                ex2.printStackTrace();
            }
        }
    }
}
