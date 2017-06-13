package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nizar on 13/06/17.
 */
@Controller
public class test {

    @Autowired
    private Storage storage;

    @RequestMapping(value ="/home")
    public String test1(Model model){
        model.addAttribute(storage.applicationBean);
        return "home";
    }
}
