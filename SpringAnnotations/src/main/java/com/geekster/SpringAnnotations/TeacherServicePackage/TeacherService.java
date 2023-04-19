package com.geekster.SpringAnnotations.TeacherServicePackage;

import ComponentScanTest.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherService {

    @Autowired
    Teacher t1;

    public String teacherServiceCall(){
        return t1.teach();
    }
}
