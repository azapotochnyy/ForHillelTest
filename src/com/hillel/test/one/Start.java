package com.hillel.test.one;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by A.Zapotochnyy on 27.03.2018.
 */

//Task №1
public class Start {

    public static void main(String[] args) {

            Pattern pattern = Pattern.compile(" |:|;|,|-|/|\\.");
            BufferedReader reader = null;
            List<String> lines = new ArrayList<String>();
            try {
                reader = new BufferedReader(new FileReader(".\\text.txt"));
                String line;

                while ((line = reader.readLine()) != null) {
                    String[] array = pattern.split(line);
                    for (String oneWorld : array) {
                        if (!oneWorld.equals("")) {
                            lines.add(oneWorld.trim());
                        } else {
                            continue;
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            for (String check : lines) {
                System.out.println(check);
            }

        }


    }

