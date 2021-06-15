package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Domain.Persona;

@RestController
public class HelloController {
    
    @RequestMapping(path="/", method=RequestMethod.GET)
    public String index() {
        return "Hello world!";
    }

    @RequestMapping(path="/hola", method=RequestMethod.POST)
    public String index2() {
        return "Hola món!";
    }

    @RequestMapping(path="/persona")
    @ResponseBody
    public Persona obtePersona() {
        return new Persona("Pere","Selva");
    }
}
