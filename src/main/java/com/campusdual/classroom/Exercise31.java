package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Exercise31 {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("src/main/resources/lorem.txt")))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
