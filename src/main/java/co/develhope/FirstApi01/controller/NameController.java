package co.develhope.FirstApi01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping(value = "/getName")
    public String getName(){
        return "Chiara";
    }

    @PostMapping(value = "/{name}")
    public StringBuilder reverseName(@PathVariable String name){
        StringBuilder string = new StringBuilder(name);
        return string.reverse();
    }
}
