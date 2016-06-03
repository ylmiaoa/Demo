package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Model;

@Controller
@RequestMapping("/mvc")
public class HelloMvc {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ModelAndView say(String pid, Model model) {
        System.out.println("helloworld pid=" + pid + ", model=" + model);
        return new ModelAndView("success", "pid", pid);
    }

    @RequestMapping(value = "/departments/{departmentId}")
    public String findDepatmentAlternative(@PathVariable("departmentId") String someDepartmentId) {
        System.out.println("Find department with ID: " + someDepartmentId);
        return "someResult";

    }

    @RequestMapping(value = "/haveView", method = RequestMethod.POST)
    public ModelAndView haveView(@RequestParam("s") int model) {
        System.out.println("HelloMvc haveView model=" + model);

        ModelAndView m = new ModelAndView();
        m.setViewName("someResult");
        m.addObject("name", model);

        return m;

    }

    @RequestMapping(value = "/notHaveView", method = RequestMethod.POST)
    @ResponseBody
    public void notHaveView(Model model) {
        System.out.println("HelloMvc notHaveView model=" + model);

        ModelAndView m = new ModelAndView();
        m.addObject("name", model.getName());
    }

    @RequestMapping(value = "/jsonModel", method = RequestMethod.POST)
    public @ResponseBody Model jsonModel(@RequestBody Model model) {
        System.out.println("HelloMvc jsonModel model=" + model);

        return model;
    }

    @RequestMapping(value = "/jsonString", method = RequestMethod.POST)
    @ResponseBody
    public String jsonString(Model model) {
        System.out.println("HelloMvc jsonString model=" + model);

        return "jsonString";
    }
}
