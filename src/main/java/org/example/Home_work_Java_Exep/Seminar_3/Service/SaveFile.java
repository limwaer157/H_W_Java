package org.example.Home_work_Java_Exep.Seminar_3.Service;

import java.io.File;
import java.io.FileWriter;
public class SaveFile implements SaveDataService{
    public void saveAsFile(String[] text, String lastName) {
        try {
            File file = new File(lastName);
            FileWriter fileWriter = new FileWriter(lastName, true);
            if (!file.exists()) {
                for (String string : text) {
                    fileWriter.write(string);
                    fileWriter.append("  ");
                }
                fileWriter.write("\n");
                fileWriter.flush();
                fileWriter.close();
            } else {
                for (String string : text) {
                    System.out.println(string);
                    fileWriter.write(string);
                    fileWriter.append(" ");
                }
                fileWriter.write("\n");
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
