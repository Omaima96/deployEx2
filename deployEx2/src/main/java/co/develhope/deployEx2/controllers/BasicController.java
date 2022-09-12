package co.develhope.deployEx2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

        @GetMapping("/")
        public int getSum(int random1,int random2){
            return (random1 + random2);
        }
}
