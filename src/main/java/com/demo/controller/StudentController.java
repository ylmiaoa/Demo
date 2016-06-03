package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.dao.StudentDao;

@RequestMapping("/stu")
public class StudentController {

    private StudentDao studentDao;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(String p) {
        System.out.println(" *** stu = " + p + " ***");
        System.out.println(studentDao.test());
        return "student";
    }

    /**
     * @param studentDao
     *            the studentDao to set
     */
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

}
