package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.das.DataBaseService;

@RequestMapping("/das")
public class DasController {

    private DataBaseService das;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        das.selectOne();
        return "student";
    }

    /**
     * @param das
     *            the das to set
     */
    public void setDas(DataBaseService das) {
        this.das = das;
    }

}
