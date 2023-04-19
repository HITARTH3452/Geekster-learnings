package com.geekster.SpringAnnotations.controller;

import ComponentScanTest.Teacher;
import com.geekster.SpringAnnotations.TeacherServicePackage.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired
    TeacherService ts;

    @RequestMapping(value = "/teach", method = RequestMethod.GET)
    public String teach(){
       return ts.teacherServiceCall();
    }
}
