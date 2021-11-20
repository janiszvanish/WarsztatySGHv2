package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Component
public class FileSaver {
    private int counter = 0;

    public void saveToFile(Student student) throws IOException {
        counter++;
        String path = "D:\\studia\\2021-2022\\zimowy\\SPRING\\spotkanie2\\WarsztatySGHv2\\src\\main\\java\\com\\skni\\warsztatysghv2\\student" + counter + ".txt";;
        File file = new File(path);
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write(student.toString());
        writer.close();


    }

}
