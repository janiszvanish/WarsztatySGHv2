package com.skni.warsztatysghv2.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class StudentService {

    private UUIDStudentIdGenerator studentIdGenerator;
    private FileSaver fileSaver;
    private StatusService statusService;
    private ApplicationFormService applicationFormService;

    public StudentService(){}

    @Autowired
    public StudentService(UUIDStudentIdGenerator studentIdGenerator, FileSaver fileSaver, StatusService statusService,
                          ApplicationFormService applicationFormService){
        this.studentIdGenerator = studentIdGenerator;
        this.fileSaver = fileSaver;
        this.applicationFormService = applicationFormService;
        this.statusService = statusService;

    }
    public void printStudent() {
        Student student = create(applicationFormService.createMock());
        System.out.println(student);
        try {
            fileSaver.saveToFile(student);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public Student create(ApplicationForm applicationForm) {
        String id = studentIdGenerator.getNext();
        String firstName = applicationForm.getFirstName();
        String lastName = applicationForm.getLastName();
        String email = applicationForm.getEmail();
        Status status = statusService.randomStatus();

        return new Student(id, firstName, lastName, email, status); // new allowed here


    }

}
