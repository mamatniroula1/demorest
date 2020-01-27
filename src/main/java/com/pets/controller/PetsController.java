package com.pets.controller;

import com.pets.vo.Dog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetsController {

    @GetMapping("/dogs/{did}")
    public Dog findDog(@PathVariable int did){
        Dog dog= new Dog();
        dog.setColor("very intelligent black ass nigger");
        dog.setName("bimal");
        dog.setPrice(60);
        dog.setDid(did);
        return dog;
    }


}
