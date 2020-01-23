package com.sv.sprprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/id")
public class IndexController {
    @GetMapping(value = "/map{id}")
        public ModelAndView index(){
        Map<String, String> model = new HashMap<>();
        model.put("name", "Sergiy");
        return new ModelAndView("index", model);
    }
}
