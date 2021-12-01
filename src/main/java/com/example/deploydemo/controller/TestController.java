package com.example.deploydemo.controller;

import com.example.deploydemo.model.Test;
import com.example.deploydemo.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    //TODO: bad style
    private final TestRepository testRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/test")
    public String test() {
        return testRepository.findAll().stream().findAny().map(Test::getName).orElse(null);
    }
}
