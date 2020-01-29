package com.sv.sprprj.controllers;


import com.sv.sprprj.config.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class SpareController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity getHelloWorldMessage() {
        return ResponseEntity.ok(new ApiResponse(true, "Test1 passed successfully"));
    }
}
