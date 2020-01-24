package com.sv.sprprj.controllers;


import com.sv.sprprj.config.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class IndexController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity getHelloWorldMessage() {
        return ResponseEntity.ok(new ApiResponse(true, "Test passed successfully"));
    }


}
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Controller
//public class IndexController {
//    @GetMapping("/")
//    public ModelAndView index() {
//        Map<String, String> model = new HashMap<>();
//        model.put("name", "Alexey");
//        return new ModelAndView("index", model);
//    }
//}
