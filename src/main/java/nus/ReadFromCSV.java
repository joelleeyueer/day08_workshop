package nus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadFromCSV {

    public ReadFromCSV() {
    }

    void ReadFromCSV() throws IOException {
        List<String> fruits = new ArrayList<>();
        String path  = "./data2/apples.txt";
        FileReader r =  new FileReader(path);
        BufferedReader br = new BufferedReader(r);
        String incomingLine;
        while (null!=(incomingLine = br.readLine())){
            String[] values;
            incomingLine = incomingLine.trim();
            values = incomingLine.split(",");
            for (int i = 0; i < values.length; i++){
                fruits.add(values[i].trim());
            }
        }

        System.out.println(fruits);
    }
}
