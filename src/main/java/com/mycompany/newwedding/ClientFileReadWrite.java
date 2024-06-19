package com.mycompany.newwedding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ClientFileReadWrite {

    public File file;
    public FileWriter writer;
    public FileReader reader;
    public BufferedReader bfr;

    public void writeInFile(String s) {
        try {
            file = new File("ClientHistory.txt");
            file.createNewFile();
            writer = new FileWriter(file, true);
            writer.write(s + "\r" + "\n");
            writer.flush();
            writer.close();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "IO Exception Occurred", "Information", 2);
        }
    }

    public void readFromFile() {
        try {
            reader = new FileReader(file);
            bfr = new BufferedReader(reader);
            String text = " ", temp;

            while ((temp = bfr.readLine()) != null) {
                text = text + temp + "\n" + "\r";
            }
            System.out.print(text);
            reader.close();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "IO Exception Occurred", "Information", 2);
        }
    }

}
