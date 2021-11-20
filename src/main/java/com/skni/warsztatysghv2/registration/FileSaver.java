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
        String path = "students";
        File studentsDir = new File(path);
        studentsDir.mkdir();
        String fileName = "student" + counter + ".txt";

        File studentFile = new File(studentsDir.getPath() + "/" + fileName);
        studentFile.createNewFile();
        FileWriter writer = new FileWriter(studentFile);
        writer.write(student.toString());
        writer.close();


    }

}
