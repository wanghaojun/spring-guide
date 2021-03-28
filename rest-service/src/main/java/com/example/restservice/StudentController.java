package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private  StudentRepository studentRepository;

    @GetMapping("/greet")
    public  String greet(String name){
        return  new String("hello" + name);
    }

    @PostMapping("/save")
    public String save(String name){
        Student s = new Student();
        s.setName(name);
        studentRepository.save(s);
        return  new String("save success!");
    }
    @GetMapping("/find")
    public Object find(){
        return studentRepository.findAll();
    }

    @GetMapping("/findByName")
    public Object findByName(String name){
        return studentRepository.findByName(name);
    }



}
