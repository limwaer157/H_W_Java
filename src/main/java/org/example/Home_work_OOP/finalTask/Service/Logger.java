package org.example.Home_work_OOP.finalTask.Service;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Logger {
    public void printTofile(String a ){
        Date date = new Date();
        try {
        File file = new File("Result.txt");
        if(!file.exists()){
            PrintWriter pw = new PrintWriter(file);
            pw.println(date);
            pw.print(a);
            pw.close();
        }
        else {
            PrintWriter pw1 = new PrintWriter(file);
            pw1.println(date);
            pw1.print(a);
            pw1.close();
        }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
